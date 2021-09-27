package org.example.ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 40
 *  Copyright 2021 Patrick Mac
 */

import java.util.*;


public class FilteringRecords
{
    public static List<Map<String, String>> records()
    {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();

        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("First Name", "Josh");
        map1.put("Last Name","Johnson");
        map1.put("Position","Manager");
        map1.put("Separation Date","2016-12-31");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("First Name", "Tou");
        map2.put("Last Name","Xiong");
        map2.put("Position","Software Engineer");
        map2.put("Separation Date","2016-10-05");

        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("First Name", "Michaela");
        map3.put("Last Name","Michaelson");
        map3.put("Position","District Manager");
        map3.put("Separation Date","2015-12-19");

        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("First Name", "Jake");
        map4.put("Last Name","Jacobson");
        map4.put("Position","Programmer");
        map4.put("Separation Date","");

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("First Name", "Jacquelyn");
        map5.put("Last Name","Jackson");
        map5.put("Position","DBA");
        map5.put("Separation Date","");

        Map<String, String> map6 = new HashMap<String, String>();
        map6.put("First Name", "Sally");
        map6.put("Last Name","Webber");
        map6.put("Position","Web Developer");
        map6.put("Separation Date","2015-12-18");


        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);

        return list;

    }

    public static void main(String[] args)
    {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        list = records();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String input = scanner.nextLine();

        Collections.sort(list, mapComparator);

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");


        Map<String, String> myMap ;

        for (int j=0; j<list.size(); j++)
        {
            myMap = list.get(j);
            String val1 = myMap.get("First Name");
            String val2 = myMap.get("Last Name");
            String fullName = val1 +" "+ val2;
            String val3 = myMap.get("Position");
            String val4 = myMap.get("Separation Date");
            if(val1.contains(input) || val2.contains(input))
            {
                System.out.format("%-20s| %-18s| %-20s\n", fullName, val3, val4);
            }

        }

        System.out.println("");



    }


    public static Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>()
    {
        public int compare(Map<String, String> map1, Map<String, String> map2)
        {
            return map1.get("Last Name").compareTo(map2.get("Last Name"));
        }
    };
}
