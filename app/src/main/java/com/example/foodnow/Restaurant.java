package com.example.foodnow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gia Dat on 9/18/2020
 */
public class Restaurant {
    private String name;
    private int logo;
    private int cover;
    private String address;
    private String openHours;
    private List<Food> menu;

    public Restaurant() {
    }

    public Restaurant(String name, int logo, String address) {
        this.name = name;
        this.logo = logo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }

    public List<Food> getMenu() {
        return menu;
    }

    public void setMenu(List<Food> menu) {
        this.menu = menu;
    }

    public static List<Restaurant> getData(){
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Circle K",R.drawable.ic_circlek,"40 Hung Vuong"));
        restaurants.add(new Restaurant("Highland Coffee",R.drawable.ic_highland,"30 Nguyen Van Cu"));
        restaurants.add(new Restaurant("MiniStop",R.drawable.ic_ministop,"70 Ly Thai To"));
        restaurants.add(new Restaurant("7 Eleven",R.drawable.ic_seveneleven,"82 Nguyen Thi Minh Khai"));
        restaurants.add(new Restaurant("VinMart",R.drawable.ic_vinmart,"53 Le Quang Sung"));
        return restaurants;
    }
}
