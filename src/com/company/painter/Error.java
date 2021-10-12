package com.company.painter;

public class Error {

    private Error(){}

    public static void error(Exception e){
        System.err.println("Exception thrown:\n" + e);
        System.exit(0);
    }
}
