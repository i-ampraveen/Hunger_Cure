package com.example.hungercure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> listView, View v, int position, long id) {

                if(position == 0){

                     Intent intent = new Intent(TopLevelActivity.this, FoodCategoryActivity.class);
                     startActivity(intent);
                }
                if(position == 1){

                    Intent intent1 = new Intent(TopLevelActivity.this, FoodCategoryActivity1.class);
                    startActivity(intent1);
                }
                if(position == 2){

                    Intent intent2 = new Intent(TopLevelActivity.this, FoodCategoryActivity2.class);
                    startActivity(intent2);
                }
            }
        };

        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
