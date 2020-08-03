package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapp.activity.ChapitreActivity;

public class MainActivity extends AppCompatActivity {
  Button btnFormation,btnGuideComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFormation = (Button) findViewById(R.id.btn_formation);
        btnGuideComplete = (Button) findViewById(R.id.btn_guide_complete);

        btnFormation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChapitreActivity.class);
                startActivity(intent);
            }
        });
    }


}