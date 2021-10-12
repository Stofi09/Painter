package com.company.painter;

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
        sumCustomerSpending();
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
    private void  sumCustomerSpending(){
        double cost = 0;
        for (int i =0; i< this.orders.size(); i++){
          cost += this.orders.get(i).getCost();
        }
        System.out.println("this is the iterating: "+cost);
        changeType(cost);
    }
    private void changeType(double cost){
        if (cost < 15000 && cost > 10000) this.type = CustomerType.SILVER;
        else if (cost > 15000) this.type = CustomerType.GOLD;
    }
}
