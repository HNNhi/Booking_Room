package com.example.bookinghotel;

public class User {
    private int resouceImage;
    private String name;
    private String price;

    public User(int resouceImage, String name, String price) {
        this.resouceImage = resouceImage;
        this.name = name;
        this.price = price;
    }

    public int getResouceImage() {
        return resouceImage;
    }

    public void setResouceImage(int resouceImage) {
        this.resouceImage = resouceImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
