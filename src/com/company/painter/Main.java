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
        boolean isReceiptRequired = false;

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

        System.out.println("Do you have a card or would you like one? Type \"yes\" if you want or have.");
        try{
            String message = scanner.next();
            if (message.equalsIgnoreCase("yes")){
                if(customer.getCard()){
                    System.out.println("Thank you for you card.");
                }else {
                    customer.setCard();
                    System.out.println("Here is your new card.");
                }
            } else {
                System.out.println("No card for you!");
            }
        }catch (Exception e){
            Error.error(e);
        }

        System.out.println("Would you like a receipt? Type \"yes\" if you want.");
        try{
            String message = scanner.next();
            if (message.equalsIgnoreCase("yes")){
                makeReceipt(customer);
            } else {
                System.out.println("No receipt for you!");
            }
        }catch (Exception e){
            Error.error(e);
        }

        System.out.println("Thank you " + customer.getName() + ", your order will be completed shortly.");
        Thread.sleep(3000);

    }
    private static void makeReceipt( Customer customer){
            System.out.println("your receipt is on the way "+ customer.getName());
    }

}
