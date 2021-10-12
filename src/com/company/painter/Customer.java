package com.company.painter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Order> orders = new ArrayList<>();
    private Enum type;

    public Customer (String name){
        this.name = name;
        this.type = CustomerType.BRONZE;
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }
    public ArrayList<Order> listOders(){
        return this.orders;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", orders=" + orders +
                ", type=" + type +
                '}';
    }
}
