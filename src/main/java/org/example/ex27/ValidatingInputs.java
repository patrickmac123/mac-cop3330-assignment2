package org.example.ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 27
 *  Copyright 2021 Patrick Mac
 */

public class ValidatingInputs {

    public static void validateInput(String firstName,String lastName,String zipCode,String employeeID)
    {
        String output = "";
        output = validateFirstname(firstName,output);
        output = validateLastname(lastName,output);
        output = validateZipcode(zipCode,output);
        output = validateEmployeeID(employeeID,output);
        if(output.equals(""))
        {
            output = "There were no errors found.";
        }
        System.out.println(output);
    }

    public static String validateFirstname(String firstName,String output)
    {
        boolean result;
        if(firstName.length() < 2)
        {
            output += "The first name must be at least 2 characters long.\n";
        }
        else if(firstName.equals(""))
        {
            output +="The first name must be filled in.\n";
        }
        return output;
    }

    public static String validateLastname(String lastName,String output)
    {
        if(lastName.length() < 2)
        {
            output += "The last name must be at least 2 characters long.\n";
        }
        else if(lastName.equals(""))
        {
            output +="The last name must be filled in.\n";
        }
        return output;
    }


    public static String validateZipcode(String zipCode,String output)
    {
        boolean hasNumber = true;

        for(char i : zipCode.toCharArray())
        {
            if(!Character.isDigit(i))
            {
                hasNumber = false;
            }

        }
        if(zipCode.length() != 5 || hasNumber == false)
        {
            output +="The zipcode must be a 5 digit number.\n";
        }
        return output;
    }


    public static String validateEmployeeID(String employeeID,String output)
    {
        if(!employeeID.matches("[A-Z]{2}-[0-9]{4}"))
        {
            output +="The employee ID must be in the format of AA-1234.\n";
        }
        return output;
    }

    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zipCode = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = scan.nextLine();

        validateInput(firstName,lastName,zipCode,employeeID);



    }
}


