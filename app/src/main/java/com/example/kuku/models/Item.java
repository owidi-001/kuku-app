package com.example.kuku.models;

import java.util.Objects;

public class Item {
    //    Attributes
    private String breed;
    private String type;
    private String image;
    private double price;

    //    Constructor
    public Item(String breed, String type, String image, double price) {
        this.breed = breed;
        this.type = type;
        this.image = image;
        this.price = price;
    }

    //Getters and setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "breed='" + breed + '\'' +
                ", type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && breed.equals(item.breed) && type.equals(item.type) && Objects.equals(image, item.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, type, image, price);
    }
}