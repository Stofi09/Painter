package com.company.painter;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Order> orders = new ArrayList<>();

    public Customer (String name){
        this.name = name;
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
}
