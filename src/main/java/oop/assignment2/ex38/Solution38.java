package oop.assignment2.ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a list of numbers, separated by spaces: ");
            String data = in.nextLine();
            String list[] = data.split(" ");
            Integer evenList[] = filterEvenNumbers(list);
            System.out.print("The even numbers are ");
            for(int i=0; i<evenList.length; i++){
                if(i < evenList.length-1){
                    System.out.print(evenList[i] + " ");
                }
                else {
                    System.out.print(evenList[i] + ".");
                }
            }
        }


        public static Integer[] filterEvenNumbers(String list[]) {

            ArrayList<Integer> newList = new ArrayList<>();

            for(int i=0; i<list.length; i++){
                int num = Integer.parseInt(list[i]);
                if(num % 2 == 0){
                    newList.add(num);
                }
            }

            Integer[] arr = new Integer[newList.size()];
            arr = newList.toArray(arr);
            return arr;
        }
}
