package com.example.foodnow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * Created by Gia Dat on 9/19/2020
 */
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder>{

    private List<Restaurant> restaurants;

    public RestaurantAdapter(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurant_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurant restaurant = restaurants.get(position);
        holder.imgRestaurant.setImageResource(restaurant.getLogo());
        holder.addressRestaurant.setText(restaurant.getAddress());
        holder.nameRestaurant.setText(restaurant.getName());
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgRestaurant;
        TextView nameRestaurant , addressRestaurant;

        public ViewHolder(@NonNull View view) {
            super(view);
            imgRestaurant = view.findViewById(R.id.imgRestaurant);
            nameRestaurant = view.findViewById(R.id.nameRestaurant);
            addressRestaurant = view.findViewById(R.id.addressRestaurant);
        }
    }
}
