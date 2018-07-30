package com.example.gangadhar.aslpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        setupRecyclerView();


    }

    private void setupRecyclerView() {
        ArticulationDataList articulationDataList = new ArticulationDataList();
        MainGridLayoutManager gridLayoutManager = new MainGridLayoutManager(this, 5);
        ArticulationAdapter articulationAdapter = new ArticulationAdapter(this, articulationDataList);

        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(articulationAdapter);

    }

    private void initUi() {
        mRecyclerView = findViewById(R.id.articulation_recyclerview);
    }
}
