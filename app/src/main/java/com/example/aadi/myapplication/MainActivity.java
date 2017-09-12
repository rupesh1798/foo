package com.example.aadi.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import static com.example.aadi.myapplication.R.id.rv;

public class MainActivity extends AppCompatActivity implements Adapter.ListItemLongClickListener {
    Adapter adapter;
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(rv);
        List<ItemData> data = com.example.aadi.myapplication.data.getData();
        adapter = new Adapter(this, data, this);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemLongCLick(int clickedPos) {
        Toast.makeText(this, "YOU long clicked on this " + clickedPos + "position", Toast.LENGTH_SHORT)
                .show();
    }
}
