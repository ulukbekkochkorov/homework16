package com.company;

public class Cirkle {
    static final double PI = 3.14159;
    static int r = 5;
    static double a;
    static double c;


    public static double area (){
        a = PI * (r*r);
        return a;
    }
    public static double circumference (){
        c = PI * 2 * r;
        return c;
    }
}
