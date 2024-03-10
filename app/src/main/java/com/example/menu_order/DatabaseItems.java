package com.example.menu_order;

import java.util.ArrayList;
import java.util.List;

public class DatabaseItems {
    public DatabaseItems() {
        items.add(new Menultem("Coffee",10,"Hot Drinks"));
        items.add(new Menultem("Tea",8,"Hot Drinks"));
        items.add(new Menultem("Ice Coffee",15,"Cold Drinks"));
        items.add(new Menultem("Sprite",5,"Cold Drinks"));
        items.add(new Menultem("Chicken Sandwitch",20,"Sandwitches"));
        items.add(new Menultem("Orange Juice", 12, "Cold Drinks"));
        items.add(new Menultem("Cappuccino", 12, "Hot Drinks"));
        items.add(new Menultem("Lemonade", 7, "Cold Drinks"));
        items.add(new Menultem("Espresso", 10, "Hot Drinks"));
        items.add(new Menultem("Club Sandwich", 22, "Sandwiches"));
        items.add(new Menultem("Vegetable Sandwich", 18, "Sandwiches"));
    }

    private List<Menultem>items= new ArrayList<Menultem>();
    public String[] getCategories(){
       //assume We are reading data from dataBase
       String [] categories={"Hot Drinks","Cold Drinks", "Sandwitches"};
       return categories;
    }

}
