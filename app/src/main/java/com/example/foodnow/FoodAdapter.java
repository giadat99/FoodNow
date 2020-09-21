package com.example.foodnow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Gia Dat on 9/18/2020
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    Context context;
    List<Food> foodList;

    public FoodAdapter(Context context, List<Food> foodList) {
        this.context = context;
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.food_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food food = foodList.get(position);
        holder.imgFood.setImageResource(food.getImage());
        holder.priceFood.setText(food.getPrice() + "");
        holder.nameFood.setText(food.getName());
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgFood;
        TextView nameFood , priceFood;
        public ViewHolder(@NonNull View view) {
            super(view);
            imgFood = view.findViewById(R.id.imgFood);
            nameFood = view.findViewById(R.id.nameFood);
            priceFood = view.findViewById(R.id.priceFood);
        }
    }
}
