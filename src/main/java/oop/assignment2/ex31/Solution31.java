package oop.assignment2.ex31;

import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {

    UserInput();


    }

    static void UserInput(){
        Scanner sc=new Scanner(System.in);
            int age = 0;
            int restingPulse =0;

            while(age < 1 || age > 118 ) {
                System.out.print("Enter your age: ");
                 age = sc.nextInt();
            }
            while(restingPulse < 30 || restingPulse > 120) {
                System.out.print("Enter your resting heart rate: ");
                restingPulse = sc.nextInt();
            }

        tableMaker(age, restingPulse);
    }

    static void tableMaker(int age, int restingPulse){

        System.out.println("Resting Pulse : "+restingPulse+" Age: "+age);
        System.out.println("Intensity \t"+ "| Rate");
        System.out.println("------------|---------");
        for(int i=55;i<=95;i+=5) {
            int heartRate=(int)Math.round((((220-age)-restingPulse)*(i/100.0))+restingPulse);
            System.out.println(i+"%\t\t\t| "+heartRate+" bpm");
        }
    }
}
