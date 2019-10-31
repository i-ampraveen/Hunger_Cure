package com.example.hungercure;

public class Food1 {

    private String name;
    private String description;
    private int imageId;

    public static final Food1[] foods1 = {

            new Food1("Sprite", "Colorless, Caffeine-free, lemon and lime-flavoured soft drink", R.drawable.sprite),
            new Food1("Diet Coke", "Perfect balance of crisp and refreshing and also sugar-free!", R.drawable.dietcoke),
            new Food1("Chocolate Shake", "Just go for it!", R.drawable.chocolateshake),

    };

    public Food1(String name, String description, int imageId) {
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

