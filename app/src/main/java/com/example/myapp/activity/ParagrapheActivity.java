package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.MainActivity;
import com.example.myapp.Models.Paragraphe;
import com.example.myapp.R;
import com.example.myapp.adapters.ChapitreAdapter;
import com.example.myapp.adapters.ParagrapheAdapter;

import java.util.ArrayList;
import java.util.List;

public class ParagrapheActivity extends AppCompatActivity {
    private List<Paragraphe> ParagrapheList = new ArrayList<Paragraphe>();
    private RecyclerView recyclerView;
    private ParagrapheAdapter mAdapter;
    Button btnQuiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraphe);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_paragraphes);

        mAdapter = new ParagrapheAdapter(ParagrapheList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareParagrapheData();
        mAdapter.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = recyclerView.indexOfChild(v);
                Intent intent = new Intent(getApplicationContext(), ContenueActivity.class);
                startActivity(intent);
            }
        });

        btnQuiz = (Button) findViewById(R.id.btn_quiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
    }

    private void prepareParagrapheData() {
        int i;
        for ( i=0;i<6;i++) {
            Paragraphe p1 = new Paragraphe("Paragraphe : "+i);
            ParagrapheList.add(p1);
        }


        mAdapter.notifyDataSetChanged();
    }
}