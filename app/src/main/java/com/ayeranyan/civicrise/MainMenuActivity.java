package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    private Button btnQuizzes, btnArticles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnQuizzes = findViewById(R.id.btnQuizzes);
        btnArticles = findViewById(R.id.btnArticles);

        btnQuizzes.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizCategoriesActivity.class);
            startActivity(intent);
        });

        btnArticles.setOnClickListener(v -> {
            Intent intent = new Intent(this, ArticleListActivity.class);
            startActivity(intent);
        });
    }
}
