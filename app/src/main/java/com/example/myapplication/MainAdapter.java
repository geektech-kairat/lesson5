package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

   private RecyclerItem listener;






    public void initListener(RecyclerItem listener){
        this.listener = listener;
    }

    ArrayList<ItemModel> list1 = new ArrayList<>();

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.onBind(list1.get(position), listener);

    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public void addText(ArrayList<ItemModel> list2) {
        list1 = list2;
        notifyDataSetChanged();


    }
    public void deleteItem(int position){
        list1.remove(position);
        notifyDataSetChanged();

    }
}
