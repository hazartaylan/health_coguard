package app.coguard.health.customview;

import android.graphics.Rect;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpaceItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        // Add top margin only for the first item to avoid double space between items
        if(parent.getChildPosition(view) != 0)
            outRect.left = space;
    }
}
