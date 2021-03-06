package com.company.painter.dao;

public class Order {

    private static int orderNo = 1;
    private final double cost;
    private final String quality;

    public Order(double cost, String quality){
        this.quality = quality;
        this.cost = cost;
        orderNo++;
    }

    public double getCost(){
        return this.cost;
    }
    public String getQuality(){
        return this.quality;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cost=" + cost +
                ", quality='" + quality + '\'' +
                '}';
    }
}
