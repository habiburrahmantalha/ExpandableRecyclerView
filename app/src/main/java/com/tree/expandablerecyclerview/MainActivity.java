package com.tree.expandablerecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    ArrayList<Item> itemArrayList = new ArrayList<>();
    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("Title","Description"));
        itemArrayList.add(new Item("Title","Description"));
        itemArrayList.add(new Item("Title","Description"));
        itemArrayList.add(new Item("Title","Description"));
        itemArrayList.add(new Item("Title","Description"));
        adapter = new ExpandableRecyclerViewAdapter(itemArrayList,this);
        recyclerView.setAdapter(adapter);


    }
}
