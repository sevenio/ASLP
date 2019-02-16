package com.example.gangadhar.aslpapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;

public class ArticulationAdapter extends RecyclerView.Adapter<ArticulationViewHolder> {

    private Context mContext;
    private ArticulationDataList mArticulationDataList;
    private Integer selectedItemPosition = 0;
    private Integer oldselectedItemPosition = 0;
    private AdapterCallback adapterCallback;
    private ArticulationViewHolder.ViewholderCallback viewholderCallback = new ArticulationViewHolder.ViewholderCallback() {
        @Override
        public void selectedLetter(int position) {
            oldselectedItemPosition = selectedItemPosition;
            selectedItemPosition = position;
            adapterCallback.setPosition(position);
            notifyItemChanged(selectedItemPosition);
            notifyItemChanged(oldselectedItemPosition);
        }
    };


    public ArticulationAdapter(Context context, ArticulationDataList articulationDataList, AdapterCallback adapterCallback) {
        this.mContext = context;
        this.mArticulationDataList = articulationDataList;
        this.adapterCallback = adapterCallback;
    }

    @NonNull
    @Override
    public ArticulationViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.articulation_view_item, viewGroup, false);
        return new ArticulationViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull ArticulationViewHolder articulationViewHolder, int position) {
        articulationViewHolder.bind(mContext.getResources().getString(mArticulationDataList.getArticulationDataArrayList().get(position).getLetterId()),viewholderCallback,  selectedItemPosition == position);
    }

    @Override
    public int getItemCount() {
        return mArticulationDataList.getArticulationDataArrayList().size();
    }
    public interface AdapterCallback{
        void setPosition(int position);
    }
}
