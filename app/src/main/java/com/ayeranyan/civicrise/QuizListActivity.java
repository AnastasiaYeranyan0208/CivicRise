package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class QuizListActivity extends AppCompatActivity {

    private Button btnQuiz1, btnQuiz2, btnQuiz3;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);

        btnQuiz1 = findViewById(R.id.btnQuiz1);
        btnQuiz2 = findViewById(R.id.btnQuiz2);
        btnQuiz3 = findViewById(R.id.btnQuiz3);

        category = getIntent().getStringExtra("category");
        if (category == null) category = "media";

        setupQuizNames();

        btnQuiz1.setOnClickListener(v -> startQuiz(0));
        btnQuiz2.setOnClickListener(v -> startQuiz(1));
        btnQuiz3.setOnClickListener(v -> startQuiz(2));
    }

    private void setupQuizNames() {
        switch (category) {
            case "media":
                btnQuiz1.setText("Fake News & Media Manipulation");
                btnQuiz2.setText("Propaganda Techniques");
                btnQuiz3.setText("Media Literacy: Spot the Bias");
                break;
            case "rights":
                btnQuiz1.setText("Social Movements & Protests");
                btnQuiz2.setText("LGBTQ+ and Gender Rights");
                btnQuiz3.setText("Human Rights & Global Challenges");
                break;
            case "politics":
                btnQuiz1.setText("Political Ideologies Around the World");
                btnQuiz2.setText("Corruption and Governance");
                btnQuiz3.setText("Democracy vs. Authoritarianism");
                break;
        }
    }

    private void startQuiz(int quizIndex) {
        Intent intent = new Intent(this, QuizActivity.class);
        intent.putExtra("category", category);
        intent.putExtra("quizIndex", quizIndex);
        startActivity(intent);
    }
}
