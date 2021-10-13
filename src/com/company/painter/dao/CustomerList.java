package com.company.painter.dao;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {


    private static List<Customer> customers = new ArrayList<>();
    private static CustomerList ListInstance = null;

    private CustomerList(){}

    public static void addCustomer(Customer customer){
        if (ListInstance == null){
            ListInstance = new CustomerList();
        }
        customers.add(customer);
    }
    public static List<Customer> getList(){
        return customers;
    }
}
