package com.project.foodiecliapp.model;

import java.util.List;
import java.util.Objects;

public class Restaurant {
    private String id;
    private String name;
    private String address;
    private List<String> menu;


    public String getId() {
        return id;
    }


    public Restaurant setId(String id) {
        this.id = id;
        return this;
    }


    public String getName() {
        return name;
    }


    public Restaurant setName(String name) {
        this.name = name;
        return this;
    }


    public String getAddress() {
        return address;
    }


    public Restaurant setAddress(String address) {
        this.address = address;
        return this;
    }


    public List<String> getMenu() {
        return menu;
    }


    public Restaurant setMenu(List<String> menu) {
        this.menu = menu;
        return this;
    }




    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, menu);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Restaurant restaurant = (Restaurant) obj;
        return Objects.equals(id, restaurant.id) &&
                Objects.equals(name, restaurant.name) &&
                Objects.equals(address, restaurant.address) &&
                Objects.equals(menu, restaurant.menu);
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", menu=" + menu +
                '}';
    }
}
