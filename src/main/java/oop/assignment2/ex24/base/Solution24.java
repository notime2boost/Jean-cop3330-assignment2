package oop.assignment2.ex24.base;


import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;
    public static void main(String[] args){

      new Solution24().readUserInput();
      new Solution24().anagramcheck();




    }

    public void anagramcheck(){
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();

            if(word1.length() == word2.length()){
                char[] word1Array = word1.toCharArray();
                char[] word2Array = word2.toCharArray();

                Arrays.sort(word1Array);
                Arrays.sort(word2Array);

                boolean result = Arrays.equals(word1Array,word2Array );

                if(result){
                    System.out.println(word1 + " and "+ word2 +" are anagram.");
                }
                else{
                    System.out.println(word1 + " and "+ word2 + " are not anagram.");
                }

            }
            else{
                System.out.println(word1 + " and " + word2 + " are not anagram.");
            }
    }

    public void readUserInput(){
        System.out.println("Enter word 1");
        word1 = in.next();

        System.out.println("Enter word 2");
        word2 = in.next();
    }
}

