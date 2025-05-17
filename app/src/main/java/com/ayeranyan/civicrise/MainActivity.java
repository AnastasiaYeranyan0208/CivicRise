package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin, btnRegister, btnTestMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnTestMode = findViewById(R.id.btnTestMode);

        btnLogin.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,LoginActivity.class)));

        btnRegister.setOnClickListener (v -> startActivity(new Intent(MainActivity.this, RegisterActivity.class)));
        btnTestMode.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainMenu2Activity.class)));

    }
}