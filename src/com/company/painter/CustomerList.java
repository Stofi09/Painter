package com.company.painter;

import java.util.ArrayList;

public class CustomerList {


    private static ArrayList<Customer> customers = new ArrayList<>();
    private static CustomerList ListInstance = null;

    private CustomerList(){}

    public static void addCustomer(Customer customer){
        if (ListInstance == null){
            ListInstance = new CustomerList();
        }
        customers.add(customer);
    }
    public static ArrayList<Customer> getList(){
        return customers;
    }
}
