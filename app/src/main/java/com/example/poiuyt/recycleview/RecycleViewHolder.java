package com.example.poiuyt.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by poiuyt on 7/5/16.
 */

public class RecycleViewHolder extends RecyclerView.ViewHolder {

    TextView left, rightBottom, rightTop;

    public RecycleViewHolder(View itemView) {
        super(itemView);
        left = (TextView) itemView.findViewById(R.id.left);
        rightBottom = (TextView) itemView.findViewById(R.id.rightBottom);
        rightTop = (TextView) itemView.findViewById(R.id.rightTop);
    }
}
