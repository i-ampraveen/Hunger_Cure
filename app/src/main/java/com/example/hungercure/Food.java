package com.example.hungercure;

public class Food {

    private String name;
    private String description;
    private int imageId;

    public static final Food[] foods = {

            new Food("Pizza", "Thin crust pizza with extra cheese", R.drawable.pizza),
            new Food("Burger", "Veg burger with healthy stuff", R.drawable.burger),
            new Food("Sandwich", "Whole wheat sandwich", R.drawable.sandwich),

    };

    public Food(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }

    public int getImageId() {
        return imageId;
    }
}
