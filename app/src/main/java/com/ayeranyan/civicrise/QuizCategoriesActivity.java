package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizCategoriesActivity extends AppCompatActivity {

    private Button btnMedia, btnRights, btnPolitics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_categories);

        btnMedia = findViewById(R.id.btnMedia);
        btnRights = findViewById(R.id.btnRights);
        btnPolitics = findViewById(R.id.btnPolitics);

        btnMedia.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizListActivity.class);
            intent.putExtra("category", "media");
            startActivity(intent);
        });

        btnRights.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizListActivity.class);
            intent.putExtra("category", "rights");
            startActivity(intent);
        });

        btnPolitics.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizListActivity.class);
            intent.putExtra("category", "politics");
            startActivity(intent);
        });
    }
}
