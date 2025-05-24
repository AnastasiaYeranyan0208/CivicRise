package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    private Button btnQuizzes, btnFacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnQuizzes = findViewById(R.id.btnQuizzes);
        btnFacts = findViewById(R.id.btnFacts);


        btnQuizzes.setOnClickListener(v -> {
            Intent intent = new Intent(this, QuizCategoriesActivity.class);
            startActivity(intent);
        });

        btnFacts.setOnClickListener(v -> {
            Intent intent = new Intent(this, FactsActivity.class);
            startActivity(intent);
        });


    }
}
