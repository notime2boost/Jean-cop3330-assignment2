package oop.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class Solution32 {
    public static void main(String[] args){

        choosegame();

    }

    static void choosegame(){
        Scanner sc=new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Enter the difficulty level (1, 2, or 3):");
        int difchoice = sc.nextInt();

        if(difchoice == 1){
            int upperbound = 11;
            int randomNumber = rand.nextInt(upperbound);
            Userguess(randomNumber);
        }
        if(difchoice == 2){
            int upperbound =101;
            int randomNumber = rand.nextInt(upperbound);
            Userguess(randomNumber);
        }
        if(difchoice ==3){
            int upperbound =1001;
            int randomNumber = rand.nextInt(upperbound);
            Userguess(randomNumber);
        }
    }

    static void Userguess(int randomNumber){
        Scanner sc=new Scanner(System.in);

        System.out.println("I have my number. What's your guess?");
        int UserGinput = sc.nextInt();
        int Guesscounter =0;

        while(UserGinput != randomNumber){

            if(UserGinput < randomNumber){
                System.out.println("Too low. Guess again:");
                UserGinput = sc.nextInt();
                Guesscounter++;
            }
            if(UserGinput > randomNumber){
                System.out.println("Too high. Guess again:");
                UserGinput = sc.nextInt();
                Guesscounter++;
            }
        }
        System.out.println("You got it in "+Guesscounter+" guesses!");
        System.out.println("\nDo you wish to play again (Y/N)?\n");
        String goAgain = sc.next();
        if(goAgain.matches("Y")){
            choosegame();
        }
        if(goAgain.matches("N")){
            return;
        }
    }
}
