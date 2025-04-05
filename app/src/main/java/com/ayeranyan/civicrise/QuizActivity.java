package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestion;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button btnNext;

    private List<Question> questions;
    private int currentIndex = 0;
    private int score = 0;

    private String category;
    private int quizIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        category = getIntent().getStringExtra("category");
        quizIndex = getIntent().getIntExtra("quizIndex", 0);

        tvQuestion = findViewById(R.id.tvQuestion);
        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btnNext = findViewById(R.id.btnNext);

        questions = QuizData.getQuiz(category, quizIndex);

        loadQuestion();

        btnNext.setOnClickListener(v -> {
            int selectedId = radioGroup.getCheckedRadioButtonId();
            if (selectedId == -1) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
                return;
            }

            int selectedIndex = radioGroup.indexOfChild(findViewById(selectedId));
            if (selectedIndex == questions.get(currentIndex).getCorrectIndex()) {
                score++;
            }

            currentIndex++;

            if (currentIndex < questions.size()) {
                loadQuestion();
            } else {
                Intent intent = new Intent(this, QuizResultActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("total", questions.size());
                intent.putExtra("category", category);
                intent.putExtra("quizIndex", quizIndex);
                startActivity(intent);
                finish();
            }
        });
    }

    private void loadQuestion() {
        radioGroup.clearCheck();
        Question q = questions.get(currentIndex);
        tvQuestion.setText(q.getQuestionText());
        rb1.setText(q.getOption1());
        rb2.setText(q.getOption2());
        rb3.setText(q.getOption3());
        rb4.setText(q.getOption4());
    }
}
