package com.example.hungercure;

public class Food2 {

    private String name;
    private String description;
    private int imageId;

    public static final Food2[] foods2 = {

            new Food2("Ice Cream", "Dessert made from dairy milk, Chocolate and cream", R.drawable.icecream),
            new Food2("Salad", "Dish consisting of a mixture of small pieces of food, usually vegetables or fruit.", R.drawable.salad),
            new Food2("Pasta Brown", "Italian food typically made from an unleavened dough of durum wheat flour mixed with water or eggs.", R.drawable.pastabrown),
            new Food2("Eggs on Cake", "Try it, you'll love it!", R.drawable.eggsoncakes)

    };

    public Food2(String name, String description, int imageId) {
        this.name = name;
        this.description = description;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return this.name;
    }

    public int getImageId() {
        return imageId;
    }
}
