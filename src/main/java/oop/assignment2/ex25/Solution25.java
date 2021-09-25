package oop.assignment2.ex25;


import java.util.Scanner;

public class Solution25 {

    public static String password;
    public static int numcount;
    public static int Charcount;
    public static int Speicalcount;
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        passwordValidator();



    }
    public static void passwordValidator(){

        System.out.println("Please enter your password.");
        String password =in.next();
        password = password.toLowerCase();

        int Numcount = 0;
        int Charcount = 0;
        int Speicalcount =0;

        for(int i = 0, len = password.length(); i < len; i++){
            if(Character.isDigit(password.charAt(i))){
                Numcount++;
            }
            if(Character.isAlphabetic(password.charAt(i))){
                Charcount++;
            }
            else{
                Speicalcount++;
            }

        }

        char[] passwordArray = password.toCharArray();

        if(password.length() < 8 ){
            if(Charcount == 0 && Speicalcount == 0){
                System.out.println("The password "+password +" is a very weak password");
            }
            if(numcount == 0 && Speicalcount ==0){
                System.out.println("The password "+password +" is a weak password");
            }

        }
        else{
            if(Charcount > 0 && numcount > 0 && Speicalcount == 0){
                System.out.println("The password "+password +" is a strong password");
            }
            else{
                System.out.println("The password "+password +" is a very strong password");
            }
        }
    }

}
