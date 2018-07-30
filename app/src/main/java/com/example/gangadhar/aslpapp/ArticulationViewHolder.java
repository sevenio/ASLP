package com.example.gangadhar.aslpapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class ArticulationViewHolder extends RecyclerView.ViewHolder {
    private TextView mTitle;

    public ArticulationViewHolder(@NonNull View itemView) {
        super(itemView);
        mTitle = itemView.findViewById(R.id.title);
    }

    public void bind(String text) {
        mTitle.setText(text);
    }
}
