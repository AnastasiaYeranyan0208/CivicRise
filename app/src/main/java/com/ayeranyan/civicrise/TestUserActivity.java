package com.ayeranyan.civicrise;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class TestUserActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText etUsername, etPassword;
    private Button btnLogin;
    private CheckBox chkRemember;

    private final String expectedUsername = "Test User";
    private final String testEmail = "testuser@example.com";
    private final String testPassword = "Samsung2025";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences("TestUserPrefs", MODE_PRIVATE);
        boolean remember = prefs.getBoolean("remember", false);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser != null && remember) {
            startActivity(new Intent(this, MainMenuActivity.class));
            finish();
            return;
        }

        setContentView(R.layout.activity_test_user);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        chkRemember = findViewById(R.id.chkRemember);

        etUsername.setText(expectedUsername);
        etUsername.setEnabled(false);
        etPassword.setText(testPassword);
        etPassword.setEnabled(false);

        chkRemember.setChecked(remember);

        btnLogin.setOnClickListener(v -> {
            if (chkRemember.isChecked()) {
                prefs.edit().putBoolean("remember", true).apply();
            } else {
                prefs.edit().clear().apply();
            }

            mAuth.signInWithEmailAndPassword(testEmail, testPassword)
                    .addOnSuccessListener(authResult -> {
                        startActivity(new Intent(TestUserActivity.this, MainMenuActivity.class));
                        finish();
                    })
                    .addOnFailureListener(e -> Toast.makeText(this, "Login failed: " + e.getMessage(), Toast.LENGTH_SHORT).show());
        });
    }
}
