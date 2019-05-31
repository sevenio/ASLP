package com.therapy.speech.telugu;


import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class MainGridLayoutManager extends GridLayoutManager {



    public MainGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }



    @Override
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return spanLayoutSize(super.generateDefaultLayoutParams());
    }

    @Override
    public RecyclerView.LayoutParams generateLayoutParams(Context c, AttributeSet attrs) {
        return spanLayoutSize(super.generateLayoutParams(c, attrs));
    }

    @Override
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return spanLayoutSize(super.generateLayoutParams(lp));
    }

    @Override
    public boolean checkLayoutParams(RecyclerView.LayoutParams lp) {
        return super.checkLayoutParams(lp);
    }

    private RecyclerView.LayoutParams spanLayoutSize(RecyclerView.LayoutParams layoutParams) {
        if (getOrientation() == HORIZONTAL) {
            layoutParams.width = (int) Math.round(getHorizontalSpace() / getSpanCount()) - layoutParams.leftMargin - layoutParams.rightMargin;
        } else if (getOrientation() == VERTICAL) {
            layoutParams.height = (int) Math.round(getVerticalSpace() / Math.ceil((float)getItemCount() / (float) getSpanCount())) - layoutParams.topMargin - layoutParams.bottomMargin;
        }
        return layoutParams;
    }

    @Override
    public boolean canScrollVertically() {
        return false;
    }

    @Override
    public boolean canScrollHorizontally() {
        return false;
    }

    private int getHorizontalSpace() {
        return getWidth() - getPaddingRight() - getPaddingLeft();
    }

    private int getVerticalSpace() {
        return getHeight() - getPaddingBottom() - getPaddingTop();
    }
}

