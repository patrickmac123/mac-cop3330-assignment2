package org.example.ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 34
 *  Copyright 2021 Patrick Mac
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeListRemoval
{
    public static void main(String[] args)
    {
        String input;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> employee = new ArrayList<String>();
        employee.add("John Smith");
        employee.add("Jackie Jackson");
        employee.add("Chris Jones");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");

        System.out.println("There are "+employee.size()+" employees:");

        for (String i : employee)
        {
            System.out.println(i);
        }
        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        input = scan.nextLine();
        System.out.println();

        employee.remove(input);

        System.out.println("There are "+employee.size()+" employees:");
        for (String i : employee)
        {
            System.out.println(i);
        }

    }

}
