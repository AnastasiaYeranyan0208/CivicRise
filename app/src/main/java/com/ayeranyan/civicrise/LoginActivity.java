package com.ayeranyan.civicrise;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private CheckBox checkboxRemember;

    private FirebaseAuth auth;
    private FirebaseFirestore db;
    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        checkboxRemember = findViewById(R.id.checkboxRemember);

        prefs = getSharedPreferences("CivicRisePrefs", MODE_PRIVATE);

        if (prefs.getBoolean("rememberMe", false)) {
            startMain();
        }

        btnLogin.setOnClickListener(v -> loginUser());
    }

    private void loginUser() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString();

        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
            return;
        }

        db.collection("users")
                .whereEqualTo("username", username)
                .get()
                .addOnSuccessListener(querySnapshot -> {
                    if (!querySnapshot.isEmpty()) {
                        String email = querySnapshot.getDocuments().get(0).getString("email");

                        if (email == null || email.isEmpty()) {
                            Toast.makeText(this, "No email associated with this username", Toast.LENGTH_SHORT).show();
                            return;
                        }

                        auth.signInWithEmailAndPassword(email, password)
                                .addOnSuccessListener(authResult -> {
                                    FirebaseUser user = auth.getCurrentUser();
                                    if (user != null && user.isEmailVerified()) {
                                        if (checkboxRemember.isChecked()) {
                                            prefs.edit().putBoolean("rememberMe", true).apply();
                                        }
                                        startMain();
                                    } else {
                                        Toast.makeText(this, "Please verify your email before logging in", Toast.LENGTH_LONG).show();
                                    }
                                })
                                .addOnFailureListener(e ->
                                        Toast.makeText(this, "Login failed: " + e.getMessage(), Toast.LENGTH_SHORT).show());

                    } else {
                        Toast.makeText(this, "No such user found", Toast.LENGTH_SHORT).show();
                    }
                })
                .addOnFailureListener(e ->
                        Toast.makeText(this, "Database error: " + e.getMessage(), Toast.LENGTH_SHORT).show());
    }

    private void startMain() {
        startActivity(new Intent(this, MainMenuActivity.class));
        finish();
    }
}

