package com.project.foodiecliapp.model;

import java.util.Objects;

public class Dish {
       private String id;
       private String name;
       private String description;
       private double price;
    public Dish() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return Double.compare(price, dish.price) == 0 && Objects.equals(id, dish.id) && Objects.equals(name, dish.name) && Objects.equals(description, dish.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "description='" + description + '\'' + ", " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
