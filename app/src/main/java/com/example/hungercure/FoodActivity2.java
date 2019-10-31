package com.example.hungercure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity2 extends AppCompatActivity {

    public static final String EXTRA_FOODNO2 = "foodno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food2);

        int foodno = (int) getIntent().getExtras().get(EXTRA_FOODNO2);

        Food2 food = Food2.foods2[foodno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView foodimage = findViewById(R.id.foodimage);

        name.setText(food.getName());
        desc.setText(food.getDescription());
        foodimage.setImageResource(food.getImageId());
    }
}
