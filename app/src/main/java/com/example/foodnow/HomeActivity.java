package com.example.foodnow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.ic_address,
            R.drawable.ic_order,
            R.drawable.ic_user
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager = findViewById(R.id.viewPager);
        addTabs(viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        setTabIcons();

    }

    public void addTabs(ViewPager viewPager){
        HomeAdapter homeAdapter = new HomeAdapter(getSupportFragmentManager(),0);
        homeAdapter.add(new RetaurantFragment(),"Restaurant");
        homeAdapter.add(new OrderFragment(),"Order");
        homeAdapter.add(new ProfileFragment(),"Profile");
        viewPager.setAdapter(homeAdapter);
    }

    public void setTabIcons(){
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }


}