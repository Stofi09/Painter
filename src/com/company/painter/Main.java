package com.company.painter;

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
        /*for (int i = 0; i < 30; i++){
            System.out.println("Computing");
        }
        int[] numbers =     {1,2,3,4,5,6,7,8,9,10};
        int sumOfTheNumbers = 0;
        for(int j : numbers){
            sumOfTheNumbers += j;
        }
        System.out.println("That is the sum: "+sumOfTheNumbers);
        System.out.println("Your order is ready, the paint will cost: " + order.getCost() + "£");
        */

        /* Training stuffs
        if (customer.getType().name().equalsIgnoreCase("SILVER")){
            System.out.println("You have to spend 5000 more to become a GOLD level customer");
        }else if (customer.getType().name().equalsIgnoreCase("GOLD")){
            System.out.println("THANK YOU! Because of you, we can all go to the Bahamas!");
        }else {
            System.out.println("You have to spend more man!");
        }

        String something = switch(customer.getType().name()){
            case "BRONZE" -> "just a bronze";
            case "SILVER" -> "Not bad";
            case "GOLD" -> "Yeehah!";
            default -> "Nothing";
        };


        System.out.println("Something: "+""+something);

        boolean playAgain = true;
        int count = 0;
        while(playAgain){
            if(count > 10){
                playAgain = false;
            }
            System.out.println(count++);
        }
        count = 0;
        do{
            if(count>10){
                playAgain = true;
            }
        }while (!playAgain);

        for(int i = 0; i < customer.listOders().size(); i++){
            System.out.println(customer.listOders().get(i));
        }
        */
        // Best practice: Known amount -> For loop
        // Not known -> While
    }

}
