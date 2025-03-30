package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnQuizzes, btnArticles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnQuizzes = findViewById(R.id.btnQuizzes);
        btnArticles = findViewById(R.id.btnArticles);

        btnQuizzes.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, QuizListActivity.class)));

        btnArticles.setOnClickListener(v -> {

        });
    }
}