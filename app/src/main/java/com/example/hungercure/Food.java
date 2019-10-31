package com.example.hungercure;

public class Food {

    private String name;
    private String description;
    private int imageId;

    public static final Food[] foods = {

            new Food("Pizza", "Thin crust pizza with extra cheese", R.drawable.pizza),
            new Food("Burger", "Veg burger with healthy stuff", R.drawable.burger),
            new Food("Sandwich", "Whole wheat sandwich", R.drawable.sandwich),

            new Food("Sprite", "Colorless, Caffeine-free, lemon and lime-flavoured soft drink", R.drawable.sprite),
            new Food("Diet Coke", "Perfect balance of crisp and refreshing and also sugar-free!", R.drawable.dietcoke),
            new Food("Chocolate Shake", "Just go for it!", R.drawable.chocolateshake),

            new Food("Ice Cream", "Dessert made from dairy milk, Chocolate and cream", R.drawable.icecream),
            new Food("Salad", "Dish consisting of a mixture of small pieces of food, usually vegetables or fruit.", R.drawable.salad),
            new Food("Pasta Brown", "Italian food typically made from an unleavened dough of durum wheat flour mixed with water or eggs.", R.drawable.pastabrown),
            new Food("Eggs on Cake", "Try it, you'll love it!", R.drawable.eggsoncakes)
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
