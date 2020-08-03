package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapp.Models.Paragraphe;
import com.example.myapp.Models.Quiz;
import com.example.myapp.R;
import com.example.myapp.adapters.ParagrapheAdapter;
import com.example.myapp.adapters.QuizAdapter;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {
    private List<Quiz> QuizList = new ArrayList<Quiz>();
    private RecyclerView recyclerView;
    private QuizAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_quiz);

        mAdapter = new QuizAdapter(QuizList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareQuizData();

    }
    private void prepareQuizData() {
        int i;
        for ( i=0;i<6;i++) {
           Quiz q1 = new Quiz("Question du jour ?"+i,"reponse 1","reponse 2","reponse 3","reponse 4");
            QuizList.add(q1);
        }


        mAdapter.notifyDataSetChanged();
    }
}