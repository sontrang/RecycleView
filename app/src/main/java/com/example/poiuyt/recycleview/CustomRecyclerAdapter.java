package com.example.poiuyt.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by poiuyt on 7/5/16.
 */

public class CustomRecyclerAdapter extends RecyclerView.Adapter<RecycleViewHolder> implements View.OnClickListener {
    Context context;
    ClickEvent event;

    public CustomRecyclerAdapter(Context context, ClickEvent event) {
        this.event = event;
        this.context = context;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        RecycleViewHolder holder = new RecycleViewHolder(view);
        holder.itemView.setOnClickListener(this);
//        holder.left.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
//        holder.left.setTag(position);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return 20;
    }


    static Toast toast;

    public static void showToast(Context context, String str) {
        if (toast != null) {
            toast.cancel();
        }
        toast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public void onClick(View view) {
        event.onClickItem(view.getTag().toString());
    }

    public interface ClickEvent {
        void onClickItem(String str);
        /**
         * exe in Adapter
         */
    }
}
