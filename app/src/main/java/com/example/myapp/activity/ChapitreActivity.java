package com.example.myapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapp.Models.Chapitre;
import com.example.myapp.R;
import com.example.myapp.adapters.ChapitreAdapter;

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
        mAdapter.setClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = recyclerView.indexOfChild(v);
                Intent intent = new Intent(getApplicationContext(), ParagrapheActivity.class);
                startActivity(intent);
            }
        });

        //action bar icone
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_logo_officiel);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }
    private void prepareChapitreData() {
        for (int i=1;i<=6;i++) {
            Chapitre c = new Chapitre("Chapitre "+i);
            chapitreList.add(c);
        }


        mAdapter.notifyDataSetChanged();
    }
}