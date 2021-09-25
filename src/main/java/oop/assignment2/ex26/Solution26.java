package oop.assignment2.ex26;

import java.util.Scanner;
import java.lang.Math;

public class Solution26 {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){


        PaymentCalculator payment = new PaymentCalculator();
       double n = PaymentCalculator.calculateMonthsUntilPaidOff();

        System.out.println("It will take you "+ n +" months to pay off this car");



    }
}

class  PaymentCalculator{
    Scanner in = new Scanner(System.in);


    static double calculateMonthsUntilPaidOff(){

        Scanner in = new Scanner(System.in);

        System.out.println("What is your balance?");
        double b = in.nextDouble();
        System.out.println("What is the APR on the card(as a percent)?");
        double apr = in.nextDouble()/100;
        System.out.println("What is the monthly payment you can make?");
        double p = in.nextDouble();

        double i =  (apr/365);
        double x = b/p;
        double y = 1+i;

       double n = -(1/30) * (Math.log(1 + (x) *((1-Math.pow((y),30))))/ (Math.log(y)));
        System.out.println(b);
        System.out.println(apr);
        System.out.println(p);
        System.out.println(i);
        System.out.println(n);
        return n;
    }

}
