package com.ayeranyan.civicrise;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.*;

import java.util.ArrayList;
import java.util.List;

public class QuizResultActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> resultsList = new ArrayList<>();
    private FirebaseFirestore db;
    private String userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        listView = findViewById(R.id.quizResultsListView);
        db = FirebaseFirestore.getInstance();

        FirebaseAuth auth = FirebaseAuth.getInstance();
        userId = (auth.getCurrentUser() != null) ? auth.getCurrentUser().getUid() : "guest";

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, resultsList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = view.findViewById(android.R.id.text1);
                text.setTextColor(getResources().getColor(android.R.color.white));
                text.setTypeface(ResourcesCompat.getFont(getApplicationContext(), R.font.roboto_bold));
                text.setTextSize(18);
                return view;
            }
        };
        listView.setAdapter(adapter);

        loadResults();
    }

    private void loadResults() {
        db.collection("results")
                .whereEqualTo("userId", userId)
                .get()
                .addOnSuccessListener(queryDocumentSnapshots -> {
                    resultsList.clear();
                    for (DocumentSnapshot doc : queryDocumentSnapshots) {
                        String title = doc.getString("quizTitle");
                        long score = doc.getLong("score");
                        long total = doc.getLong("total");
                        resultsList.add(title + " — " + score + "/" + total);
                    }
                    adapter.notifyDataSetChanged();
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(this, "Failed to load results.", Toast.LENGTH_SHORT).show();
                });
    }
}
