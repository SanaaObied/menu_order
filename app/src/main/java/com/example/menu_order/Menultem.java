package com.example.menu_order;

public class Menultem {
    private String name;
    private double price;
    private String category;

    public Menultem(){ }

    public Menultem(String name, double price,String category) {
        this.name=name;
        this.price=price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
