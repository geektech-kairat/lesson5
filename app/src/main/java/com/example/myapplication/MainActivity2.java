package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    EditText editText1, editText2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText1 = findViewById(R.id.textView1);
        editText2 = findViewById(R.id.textView2);
        imageView = findViewById(R.id.image_2);

        imageView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            ArrayList<ItemModel> list3 = new ArrayList<>();
            list3.add(new ItemModel(editText1.getText().toString(), editText2.getText().toString(), R.drawable.subaru));

            intent.putExtra("1", list3);


            startActivityForResult(intent, 123);
        });
    }




}