package com.company.painter;

public class OrderedPaint {

   private OrderedPaint(){}

    public static double getPrice(double area, String quality){
        double numOfCans;

        if ((area * 0.5 ) % 1 == 0){ // whole number
            numOfCans =  (area * 0.5);
        } else { // not a whole number
            numOfCans =  (area * 0.5  + 1);
        }

        if (quality.equalsIgnoreCase("basic")){
            return  (2 * numOfCans );
        } else {
            return  (5 * numOfCans );
        }

    }

  }
