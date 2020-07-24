package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ChapitreActivity extends AppCompatActivity {
    private List<Chapitre> chapitreList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChapitreAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapitre);
        recyclerView = (RecyclerView) findViewById(R.id.recycle_view_chapitres);

        mAdapter = new ChapitreAdapter(chapitreList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareChapitreData();
    }
    private void prepareChapitreData() {
        for (int i=0;i<6;i++) {
            Chapitre c = new Chapitre("Planification");
            chapitreList.add(c);
        }


        mAdapter.notifyDataSetChanged();
    }
}