package com.example.hungercure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity1 extends AppCompatActivity {

    public static final String EXTRA_FOODNO1 = "foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food1);

        int foodno = (int) getIntent().getExtras().get(EXTRA_FOODNO1);

        Food1 food = Food1.foods1[foodno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView foodimage = findViewById(R.id.foodimage);

        name.setText(food.getName());
        desc.setText(food.getDescription());
        foodimage.setImageResource(food.getImageId());
    }
}
