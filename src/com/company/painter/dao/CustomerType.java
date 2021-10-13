package com.company.painter.dao;

public enum CustomerType {
    BRONZE("Bronze"),
    SILVER("Silver"),
    GOLD("Gold");

    private final String type;

    CustomerType(String type){
        this.type = type;
    }

}
