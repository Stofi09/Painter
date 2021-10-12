package com.company.painter;

public class OrderedPaint {

    private OrderedPaint(){}

    private static final double TWENTY_DISCOUNT = 0.8;
    private static final double THIRTY_DISCOUNT = 0.7;
    private static final double HALF_DISCOUNT = 0.5;

    private static double checkDiscount(double price){
       if (price < 100.0) return 1;
       else if(price < 200) return TWENTY_DISCOUNT;
       else if(price < 300) return  THIRTY_DISCOUNT;
       else return HALF_DISCOUNT;
     }

    public static double getPrice(double area, String quality){
        double numOfCans;

        if ((area * 0.5 ) % 1 == 0){ // whole number
            numOfCans =  (area * 0.5);
        } else { // not a whole number
            numOfCans =  (area * 0.5  + 1);
        }

        if (quality.equalsIgnoreCase("basic")){
           double price =  (2 * numOfCans );
           return price * checkDiscount(price);
        } else {
            double price =  (5 * numOfCans );
            return price * checkDiscount(price);
        }

    }

  }
