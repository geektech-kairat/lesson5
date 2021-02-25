package com.example.myapplication;

public class ItemModel {
    String modelItemModelClass, yearItemModelClass;
    int imageItemModelClass;

    public ItemModel(String modelItemModelClass, String yearItemModelClass, int imageItemModelClass) {
        this.modelItemModelClass = modelItemModelClass;
        this.yearItemModelClass = yearItemModelClass;
        this.imageItemModelClass = imageItemModelClass;
    }

    public ItemModel(String modelItemModelClass, String yearItemModelClass) {
        this.modelItemModelClass = modelItemModelClass;
        this.yearItemModelClass = yearItemModelClass;
    }
}
