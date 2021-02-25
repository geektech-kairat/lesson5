package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerItem   {

    RecyclerView recyclerView;

    MainAdapter adapter;

    ImageButton del;

    public static ArrayList<ItemModel> list2;
    TextView textView;

    String a;
    String b;


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        Intent intent = getIntent();
//        if (requestCode == 123 && requestCode == RESULT_OK) {
//            a = intent.getStringExtra("1");
//            b = intent.getStringExtra("2");
//
//        }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv1);

        adapter = new MainAdapter();
        adapter.initListener(this);



        textView = findViewById(R.id.cars);
        textView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);

        });


        recyclerView.setAdapter(adapter);

        del = findViewById(R.id.del);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(manager);

        list2 = new ArrayList<>();

        list2.add(0, new ItemModel("Subaru", "2015", R.drawable.subaru));
        list2.add(0, new ItemModel("Audi", "2017", R.drawable.audi));
        list2.add(0, new ItemModel("BMW", "2018", R.drawable.bmw));
        list2.add(0, new ItemModel("Ferrari", "2016", R.drawable.ferarri));
        list2.add(0, new ItemModel("Tesla", "2018", R.drawable.tesla));




        adapter.addText(list2);


    }

    @Override
    public void deleteItem(int position) {
            adapter.deleteItem(position);
    }
}