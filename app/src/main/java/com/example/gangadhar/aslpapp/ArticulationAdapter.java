package com.example.gangadhar.aslpapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ArticulationAdapter extends RecyclerView.Adapter<ArticulationViewHolder> {

    private Context mContext;
    private ArticulationDataList mArticulationDataList;

    public ArticulationAdapter(Context context, ArticulationDataList articulationDataList) {
        this.mContext = context;
        this.mArticulationDataList = articulationDataList;
    }

    @NonNull
    @Override
    public ArticulationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.articulation_view_item, viewGroup, false);
        return new ArticulationViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull ArticulationViewHolder articulationViewHolder, int position) {
        articulationViewHolder.bind(mContext.getResources().getString(mArticulationDataList.getArticulationDataArrayList().get(position).getLetterId()));
    }

    @Override
    public int getItemCount() {
        return mArticulationDataList.getArticulationDataArrayList().size();
    }
}
