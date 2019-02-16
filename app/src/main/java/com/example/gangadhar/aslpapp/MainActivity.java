package com.example.gangadhar.aslpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView mRecyclerView;
    private Button initial_button, medial_button, final_button, loadImages;
    private boolean isInitial = false;
    private boolean isMedial = false;
    private boolean isFinal = false;
    ArticulationDataList articulationDataList;

    private int position = 0;
    private ArticulationAdapter.AdapterCallback adapterCallback = new ArticulationAdapter.AdapterCallback() {
        @Override
        public void setPosition(int position) {
            MainActivity.this.position = position;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
         articulationDataList = new ArticulationDataList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        ArticulationAdapter articulationAdapter = new ArticulationAdapter(this, articulationDataList, adapterCallback);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setAdapter(articulationAdapter);

    }

    private void initUi() {
        mRecyclerView = findViewById(R.id.articulation_recyclerview);
        initial_button = findViewById(R.id.initial_button);
        medial_button = findViewById(R.id.medial_button);
        final_button = findViewById(R.id.final_button);
        loadImages = findViewById(R.id.load_images);
        final_button.setOnClickListener(this);
        medial_button.setOnClickListener(this);
        initial_button.setOnClickListener(this);
        loadImages.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.initial_button: {
                if(!isInitial){
                    initial_button.setBackgroundColor(getResources().getColor(R.color.colorSelected));
                }else {
                    initial_button.setBackgroundColor(getResources().getColor(R.color.colorDeSelected));
                }
                isInitial = !isInitial;

                break;
            }
            case R.id.medial_button: {
                if(!isMedial){
                    medial_button.setBackgroundColor(getResources().getColor(R.color.colorSelected));
                }else {
                    medial_button.setBackgroundColor(getResources().getColor(R.color.colorDeSelected));
                }
                isMedial = !isMedial;
                break;
            }
            case R.id.final_button: {
                if(!isFinal){
                    final_button.setBackgroundColor(getResources().getColor(R.color.colorSelected));
                }else {
                    final_button.setBackgroundColor(getResources().getColor(R.color.colorDeSelected));
                }
                isFinal = !isFinal;
                break;
            }
            case R.id.load_images:{
                ArrayList<ArticulationData> articulationDataList = this.articulationDataList.getArticulationDataArrayList();
                ArticulationData articulationData = articulationDataList.get(position);
                ArrayList<ArticulationDataItem> articulationDataItems = new ArrayList<>();
                if(!(isInitial || isFinal || isMedial)){
                    Toast.makeText(MainActivity.this, "Please select atleast one option", Toast.LENGTH_LONG).show();
                    return;
                }
                if(isInitial){
                    articulationDataItems.addAll(articulationData.getInitialList());
                }
                if(isMedial){
                    articulationDataItems.addAll(articulationData.getMedialList());
                }
                if(isFinal){
                    articulationDataItems.addAll(articulationData.getFinalList());
                }
                if(articulationDataItems.isEmpty()){
                    Toast.makeText(MainActivity.this, "No cards available for the given selection" , Toast.LENGTH_LONG).show();
                    return;
                }
                startActivity(SecondActivity.createIntent(MainActivity.this, articulationDataItems));
            }
        }
    }
}
