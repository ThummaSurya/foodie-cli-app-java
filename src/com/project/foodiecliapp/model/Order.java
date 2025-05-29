package com.project.foodiecliapp.model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order
{
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private double totalPrice;
    private Date orderDate;


    public String getId() {

        return id;
    }


    public Order setId(String id) {
        this.id = id;
        return this;
    }


    public Customer getCustomer() {

        return customer;
    }


    public Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }


    public Restaurant getRestaurant() {

        return restaurant;
    }

    public Order setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }


    public List<Dish> getDishes() {

        return dishes;
    }


    public Order setDishes(List<Dish> dishes) {
        this.dishes = dishes;
        return this;
    }


    public double getTotalPrice() {

        return totalPrice;
    }


    public Order setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }


    public Date getOrderDate() {

        return orderDate;
    }

    public Order setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, customer, restaurant, dishes, totalPrice, orderDate);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        return Double.compare(order.totalPrice, totalPrice) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(restaurant, order.restaurant) &&
                Objects.equals(dishes, order.dishes) &&
                Objects.equals(orderDate, order.orderDate);
    }


    @Override
    public String toString() {
        return "Order{" +
                " id ='" + id + '\'' +
                ", customer=" + customer +
                ", restaurant=" + restaurant +
                ", dishes=" + dishes +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}
