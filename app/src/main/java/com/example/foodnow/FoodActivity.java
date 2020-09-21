package com.example.foodnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FoodActivity extends AppCompatActivity {

    RecyclerView listFoodView;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        listFoodView = findViewById(R.id.listFoodView);
        foodAdapter = new FoodAdapter(listFoodView.getContext(),Food.getData());
        listFoodView.setLayoutManager(new LinearLayoutManager(FoodActivity.this,RecyclerView.VERTICAL,false));
        listFoodView.setAdapter(foodAdapter);
    }
}