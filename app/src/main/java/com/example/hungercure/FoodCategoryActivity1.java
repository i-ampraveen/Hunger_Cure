package com.example.hungercure;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity1 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listFood = getListView();

        ArrayAdapter<Food1> listAdapter = new ArrayAdapter<Food1>(this, android.R.layout.simple_list_item_1, Food1.foods1);
        listFood.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemview, int position, long id) {
        super.onListItemClick(listView, itemview, position, id);

        Intent intent = new Intent(FoodCategoryActivity1.this, FoodActivity1.class);
        intent.putExtra(FoodActivity1.EXTRA_FOODNO1, (int) id);
        startActivity(intent);
    }
}
