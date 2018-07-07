package com.padcmyanmar.asartaline.assignment.tra.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.asartaline.assignment.tra.R;
import com.padcmyanmar.asartaline.assignment.tra.adapters.RestaurantNextListAdapter;

public class ASarTaLineActivity extends BaseActivity {
    private RestaurantNextListAdapter mRestaurantNextList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asartaline_list);
        RecyclerView rvRestaurant = findViewById(R.id.rv_next_restaurant);
        mRestaurantNextList = new RestaurantNextListAdapter();
        rvRestaurant.setAdapter(mRestaurantNextList);
        rvRestaurant.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));

    }


}
