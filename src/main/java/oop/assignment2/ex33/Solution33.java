package oop.assignment2.ex33;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static void main(String[] args){
        Magic8ball();
    }
    static void Magic8ball(){
        Random rand = new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("What's your question?");
        String ques = sc.nextLine();

        int num = rand.nextInt(4)+1;
        switch(num){
            case 1:
                System.out.println("Yes");
                break;

            case 2:
                System.out.println("No");
                break;

            case 3:
                System.out.println("Maybe");
                break;

            case 4:
                System.out.println("Ask again later");
                break;
        }
    }
}
