package oop.assignment2.ex28;

import java.util.Scanner;

public class Solution28 {

    Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        loopcount();
    }
    static void loopcount(){
            Scanner in = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 5 ; i++){
            System.out.println("Enter a number: ");
            int num = in.nextInt();
             sum += num;
        }
    System.out.println("The total is "+ sum);
    }
}
