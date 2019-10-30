package com.example.hungercure;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listFood = getListView();

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, Food.foods);
        listFood.setAdapter(listAdapter);
    }
}
