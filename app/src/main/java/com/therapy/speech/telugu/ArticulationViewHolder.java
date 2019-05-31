package com.therapy.speech.telugu;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ArticulationViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView mTitle;
    private ViewholderCallback viewholderCallback;

    public ArticulationViewHolder(@NonNull View itemView) {
        super(itemView);
        mTitle = itemView.findViewById(R.id.title);
        mTitle.setOnClickListener(this);
    }

    public void bind(String text, ViewholderCallback viewholderCallback, boolean isSelected) {
        mTitle.setText(text);
        this.viewholderCallback = viewholderCallback;
        if (isSelected) {
            mTitle.setTextColor(itemView.getContext().getResources().getColor(R.color.colorSelected));
        } else {
            mTitle.setTextColor(itemView.getContext().getResources().getColor(R.color.colorAccent));
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.title: {
                viewholderCallback.selectedLetter(getAdapterPosition());
                break;
            }
        }
    }

    public interface ViewholderCallback {
        void selectedLetter(int position);
    }
}
