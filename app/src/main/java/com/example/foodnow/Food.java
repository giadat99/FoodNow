package com.example.foodnow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gia Dat on 9/18/2020
 */
public class Food {
    private String name;
    private int price;
    private int image;

    public Food() {
    }

    public Food(String name, int price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public static List<Food> getData(){
        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food("Black Coffee",49000,R.drawable.ic_black_coffee));
        foodList.add(new Food("Banh mi",39000,R.drawable.ic_banh_mi));
        foodList.add(new Food("Milk tea",55000,R.drawable.ic_milk_tea));
        foodList.add(new Food("Sandwich",25000,R.drawable.ic_sandwich));
        return foodList;
    }
}
