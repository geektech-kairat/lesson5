package com.example.myapplication;


import android.view.View;

import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;

import pl.droidsonroids.gif.GifImageView;

public class MainViewHolder extends RecyclerView.ViewHolder implements Serializable {
    public TextView model, year;
    public GifImageView gifImageView;
    ImageButton del;


    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        del= itemView.findViewById(R.id.del);
        model = itemView.findViewById(R.id.model2);
        year = itemView.findViewById(R.id.year2);
        gifImageView = itemView.findViewById(R.id.image_item_layout);
    }

    public void onBind(ItemModel itemModel, RecyclerItem listener ) {



        del.setOnClickListener(v -> listener.deleteItem(getAdapterPosition()));



        model.setText(itemModel.modelItemModelClass);
        year.setText(itemModel.yearItemModelClass);
        gifImageView.setBackgroundResource(itemModel.imageItemModelClass);



    }


}

