package com.ayeranyan.civicrise;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        setLink(R.id.tvLink1, "https://www.science.org/doi/10.1126/science.aap9559");
        setLink(R.id.tvLink2, "https://news.emory.edu/features/2024/09/emag_ai_elections_25-09-2024/index.html");
        setLink(R.id.tvLink3, "https://artsci.tamu.edu/news/2023/06/visual-misinformation-is-widespread-on-facebook-and-often-undercounted-by-researchers.html");
        setLink(R.id.tvLink4, "https://www.brookings.edu/articles/how-tech-platforms-fuel-u-s-political-polarization-and-what-government-can-do-about-it/");

        Button backButton = findViewById(R.id.btnBackToMenu);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(FactsActivity.this, MainMenuActivity.class);
            startActivity(intent);
        });
    }

    private void setLink(int viewId, String url) {
        TextView linkView = findViewById(viewId);
        linkView.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        });
    }
}
