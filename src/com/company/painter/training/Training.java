package com.company.painter.training;

import java.util.Arrays;

public class Training {

    public static void main(String[] args){
            wednesdayTraining();
    }
    private static void wednesdayTraining(){
      /*  String[] string = new String[6];
        System.out.println(string.length);
       // string[6]  = "valami";
        string[4] = "delux";
        string[5] = "basic";
        for(String s : string){
           // s = "Gareth" => It doesnt change the array! Only String s
            System.out.println(s);
        }*/
        /*
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int count = 0;
        int [][] gridCounter = new int[10][10];


        // This iterate over the outer loop
        for(int i =0; i < gridCounter.length; i++){
            for(int j= 0;j < gridCounter[i].length; j++){ //This goes rtough the inner loop
                gridCounter[i][j] = ++count;
                System.out.print(gridCounter[i][j]+"|");
            }
            System.out.println();
        }*/
        /*
        int [][] myNumbers = {{1,2,3,4},{5,6,7,8,9,10}};
        for (int[] i : myNumbers){
            for(int j : i){
                System.out.println(j);
            }
        }*/
    }
    private static void tuesdayTraining(){
        int[] asd = {1,2,3};


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