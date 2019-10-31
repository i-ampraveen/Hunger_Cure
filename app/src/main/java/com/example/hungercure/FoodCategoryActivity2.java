package com.example.hungercure;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity2 extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listfood = getListView();

        ArrayAdapter<Food2> listAdapter = new ArrayAdapter<Food2>(this, android.R.layout.simple_list_item_1, Food2.foods2);
        listfood.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listView, View itemview, int position, long id) {
        super.onListItemClick(listView, itemview, position, id);

        Intent intent = new Intent(FoodCategoryActivity2.this, FoodActivity2.class);
        intent.putExtra(FoodActivity2.EXTRA_FOODNO2, (int) id);
        startActivity(intent);
    }
}
