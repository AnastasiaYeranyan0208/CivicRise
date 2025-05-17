package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private TextView tvQuestion;
    private RadioGroup radioGroup;
    private RadioButton rb1, rb2, rb3, rb4;
    private Button btnNext;

    private List<Question> questionList;
    private int currentIndex = 0;
    private int score = 0;
    private String category;
    private int quizIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvQuestion = findViewById(R.id.tvQuestion);
        radioGroup = findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btnNext = findViewById(R.id.btnNext);

        category = getIntent().getStringExtra("category");
        quizIndex = getIntent().getIntExtra("quizIndex", 0);

        questionList = new ArrayList<>();
        loadQuestionsFromFirestore();

        btnNext.setOnClickListener(v -> {
            if (!rb1.isChecked() && !rb2.isChecked() && !rb3.isChecked() && !rb4.isChecked()) {
                Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show();
                return;
            }

            int selectedIndex = radioGroup.indexOfChild(findViewById(radioGroup.getCheckedRadioButtonId()));
            int correctIndex = questionList.get(currentIndex).getCorrectIndex();

            RadioButton selectedButton = (RadioButton) radioGroup.getChildAt(selectedIndex);
            RadioButton correctButton = (RadioButton) radioGroup.getChildAt(correctIndex);

            if (selectedIndex == correctIndex) {
                selectedButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
                score++;
            } else {
                selectedButton.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                correctButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
            }

            for (int i = 0; i < radioGroup.getChildCount(); i++) {
                radioGroup.getChildAt(i).setEnabled(false);
            }

            btnNext.setEnabled(false);
            btnNext.postDelayed(() -> {
                currentIndex++;
                if (currentIndex < questionList.size()) {
                    showQuestion(currentIndex);
                    btnNext.setEnabled(true);
                } else {
                    Intent intent = new Intent(QuizActivity.this, QuizResultActivity.class);
                    intent.putExtra("score", score);
                    intent.putExtra("total", questionList.size());
                    intent.putExtra("category", category);
                    intent.putExtra("quizIndex", quizIndex);
                    startActivity(intent);
                    finish();
                }
            }, 1000);
        });
    }

    private void loadQuestionsFromFirestore() {
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String quizId = category + "_" + quizIndex;

        db.collection("quizzes")
                .document(quizId)
                .collection("questions")
                .get()
                .addOnSuccessListener(query -> {
                    for (QueryDocumentSnapshot doc : query) {
                        Question q = doc.toObject(Question.class);
                        questionList.add(q);
                    }
                    if (questionList.isEmpty()) {
                        Toast.makeText(this, "No questions found", Toast.LENGTH_SHORT).show();
                        finish();
                    } else {
                        showQuestion(currentIndex);
                    }
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(this, "Failed to load quiz", Toast.LENGTH_SHORT).show();
                    finish();
                });
    }

    private void showQuestion(int index) {
        Question q = questionList.get(index);
        tvQuestion.setText(q.getQuestionText());

        rb1.setText(q.getOption1());
        rb2.setText(q.getOption2());
        rb3.setText(q.getOption3());
        rb4.setText(q.getOption4());

        radioGroup.clearCheck();
        for (int i = 0; i < radioGroup.getChildCount(); i++) {
            RadioButton rb = (RadioButton) radioGroup.getChildAt(i);
            rb.setEnabled(true);
            rb.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        }
    }
}

