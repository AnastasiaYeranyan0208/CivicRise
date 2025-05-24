package com.ayeranyan.civicrise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class QuizEndActivity extends AppCompatActivity {

    private TextView tvCongratulations;
    private Button btnBackToMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_end);

        tvCongratulations = findViewById(R.id.tvCongratulations);
        btnBackToMenu = findViewById(R.id.btnBackToMenu);

        int score = getIntent().getIntExtra("score", 0);
        int total = getIntent().getIntExtra("total", 15);

        String message = "Congratulations!\nYou got " + score + " out of " + total + " correct!";
        tvCongratulations.setText(message);

        btnBackToMenu.setOnClickListener(v -> {
            Intent intent = new Intent(QuizEndActivity.this, MainMenuActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        });
    }
}
