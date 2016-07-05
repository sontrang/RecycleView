package com.example.poiuyt.recycleview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import static com.example.poiuyt.recycleview.CustomRecycleAdapter.showToast;


public class MainActivity extends Activity {


    CustomRecycleAdapter adapter;
    RecyclerView recycleView;
    Button btnAdd;
    LinearLayoutManager mLayoutManager;
    CustomRecycleAdapter.ClickEvent event = new CustomRecycleAdapter.ClickEvent() {
        @Override
        public void onClickItem(String str) {
            showToast(MainActivity.this, "You just clicked at " + str);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView = (RecyclerView) findViewById(R.id.recycleView);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        adapter = new CustomRecycleAdapter(MainActivity.this, event);
        recycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        recycleView.setLayoutManager(mLayoutManager);
        recycleView.setAdapter(adapter);

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
