package com.company.painter;

import com.company.painter.dao.Customer;
import com.company.painter.dao.CustomerList;
import com.company.painter.dao.Order;
import com.company.painter.error.Error;
import com.company.painter.paintCalculations.PaintPriceCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        String quality = null;
        double area = 0;
        String name = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name!");
        try {
             name = scanner.next();
        } catch (Exception e){
            Error.error(e);
        }

        System.out.println("Enter the wall area in square metres as a whole, positive number.");
        try{
             area = scanner.nextDouble();
        } catch ( Exception e){
            Error.error(e);
        }

        System.out.println("Choose the quality of the paint by typing \"basic\" or \"premium\".");
        try{
             quality = scanner.next();
        }catch (Exception e){
            Error.error(e);
        }
        if (!quality.equalsIgnoreCase("basic") && !quality.equalsIgnoreCase("premium")){
            System.err.println("Your input has to be either \"basic\" or \"premium\".");
            System.exit(0);
        }


        Order order = new Order( PaintPriceCalculator.getPrice(area,quality),quality);
        Customer customer = new Customer(name);
        customer.addOrder(order);
        CustomerList.addCustomer(customer);
        System.out.println("Thank you " + customer.getName() + ", your order will be completed shortly.");
        Thread.sleep(3000);

    }

}
