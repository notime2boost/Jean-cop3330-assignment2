package oop.assignment2.ex27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class v {
    static void validateinput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name.");
        String UserFirstName = in.nextLine();
        System.out.println("Enter last name.");
        String UserLastName = in.nextLine();
        System.out.println("Enter Zip code:");
        String Userzip = in.nextLine();
        System.out.println("Enter the employee ID:");
        String UserID = in.nextLine();
        validateFirstName(UserFirstName);
        validateLastName(UserLastName);
        validatezipcode(Userzip);
        vliadateUserID(UserID);

    }

    static void validateFirstName(String UserFirstName) {
        if (UserFirstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
        } else {
            System.out.println("Enter first name:" + UserFirstName);
        }
    }

    static void validateLastName(String UserLastName) {
        if (UserLastName.length() < 2) {
            System.out.println("The last name must be greater than 2 characters long.");
        }
        if (UserLastName.length() == 0) {
            System.out.println("The last name must be filled in.");
        } else {
            System.out.println("Enter last name:" + UserLastName);
        }
    }

    static void validatezipcode(String Userzip) {
        if (Userzip.length() < 5) {
            System.out.println("The zip code must be a 5 digit number");
        } else {
            System.out.println("Enter Zip code:" + Userzip);
        }

    }

    static void vliadateUserID(String UserID) {

        Pattern pattern = Pattern.compile("[a-z]" + "[a-z]" + "-" + "[0-9]" + "[0-9]" + "[0-9]" + "[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(UserID);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Enter the employee ID:" + UserID);
        } else {
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
    }
}
