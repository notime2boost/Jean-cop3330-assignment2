package oop.assignment2.ex34;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Solution34 {
    public static void main(String[] args){

        employeeList();
    }

    static void employeeList(){
        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.add("John Smith");
        employeeList.add("Jackie Jackson");
        employeeList.add("Chris Jones");
        employeeList.add("Amanda Cullen");
        employeeList.add("Jeremy Goodwin");
        System.out.println("There are 5 employees:");
        System.out.println(employeeList);
        employeeremove(employeeList);
    }

    static void employeeremove(ArrayList<String> employeeList){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an employee name to remove:");
        String removename = sc.next();
        System.out.println("There are 4 employees:");
        Iterator i = employeeList.iterator();
        String str = "";
        while(i.hasNext()){
            str = (String) i.next();
            if(str.equals(removename)){
                i.remove();
                break;
            }
        }
        for (String s: employeeList){
            System.out.println(s);
        }
    }
}

