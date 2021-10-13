package com.company.painter.dao;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Order> orders = new ArrayList<>();
    private Enum type;

    public Customer (String name){
        this.name = name;
        this.type = CustomerType.BRONZE;
    }

    public void addOrder(Order order){
        this.orders.add(order);
        sumCustomerSpending();
        checkCustomerType();
    }
    public List<Order> listOders(){
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
    private void  sumCustomerSpending(){
        double cost = 0;
        for(Order o :orders ){
            cost += o.getCost();
        }

        System.out.println("this is the iterating : "+cost);
        changeType(cost);
    }
    private void changeType(double cost){
        if (cost < 15000 && cost > 10000) this.type = CustomerType.SILVER;
        else if (cost > 15000) this.type = CustomerType.GOLD;
    }

    public Enum getType(){
        return this.type;
    }
    private void checkCustomerType(){
        if (this.type.name().equalsIgnoreCase("SILVER")) System.out.println(this.name +"! Thank you for being a Silver level customer!");
        if (this.type.name().equalsIgnoreCase("GOLD")) System.out.println(this.name +"! Thank you for being a Gold level customer!");
    }
}
