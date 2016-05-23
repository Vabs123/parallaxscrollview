package com.example.vaibhav.parallaxscroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private  parallax_Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new parallax_Adapter(MainActivity.this,getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    public List<ItemObjects> getData() {
        List<ItemObjects> data = new ArrayList<>();
        int[] icons = {R.drawable.b2,R.drawable.b2,R.drawable.b2,R.drawable.b2};
        String[] titles = {"hello","hello","hello","hello"};
        String[] details = {"bello","bello","bello","bello"};
        for( int i = 0;i < titles.length && i< icons.length;i++){
            ItemObjects current = new ItemObjects();
            current.photo = icons[i];
            current.name = titles[i];
            current.info = details[i];

            data.add(current);
        }
        return data;    }
}
