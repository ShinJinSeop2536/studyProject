package org.example.java.lambda.Chapter11;

public class Fruit {
    public String name;
    public int price;
    public Fruit(String name , int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
