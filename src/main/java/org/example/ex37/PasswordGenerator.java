package org.example.ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 37
 *  Copyright 2021 Patrick Mac
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator
{
    public static ArrayList randomChar(int number)
    {
        int index = 0;
        Random rand = new Random();
        ArrayList<String> chars = new ArrayList<String>();
        ArrayList<String> newChars = new ArrayList<String>();
        chars.add("!"); chars.add("@"); chars.add("#");
        chars.add("$"); chars.add("%"); chars.add("^");
        chars.add("&"); chars.add("*"); chars.add("+");

        for(int i = 0;i < number; i++)
        {
            index = rand.nextInt(9);;
            newChars.add(chars.get(index));
        }
        return newChars;
    }

    public static ArrayList randomNum(int number)
    {
        int index = 0;
        Random rand = new Random();
        ArrayList<String> num = new ArrayList<String>();
        ArrayList<String> newNum = new ArrayList<String>();
        num.add("1"); num.add("2"); num.add("3");
        num.add("4"); num.add("5"); num.add("6");
        num.add("7"); num.add("8"); num.add("9");

        for(int i = 0;i < number; i++)
        {
            index = rand.nextInt(9);;
            newNum.add(num.get(index));
        }
        return newNum;
    }

        public static ArrayList randomLetters(int number)
        {
            int index = 0;
            Random rand = new Random();
            ArrayList<String> letters = new ArrayList<String>();
            ArrayList<String> newletters = new ArrayList<String>();
            letters.add("a"); letters.add("b"); letters.add("c");
            letters.add("d"); letters.add("e"); letters.add("f");
            letters.add("g"); letters.add("h"); letters.add("i");
            letters.add("j"); letters.add("k"); letters.add("l");
            letters.add("m"); letters.add("n"); letters.add("o");
            letters.add("p"); letters.add("q"); letters.add("r");
            letters.add("s"); letters.add("t"); letters.add("u");
            letters.add("v"); letters.add("w"); letters.add("x");
            letters.add("y"); letters.add("z");

            for(int i = 0;i < number; i++)
            {
                index = rand.nextInt(26);;
                newletters.add(letters.get(index));
            }
            return newletters;
        }
    public static ArrayList randomize(ArrayList<String> charList,ArrayList<String> numList,ArrayList<String> letterList)
    {

        ArrayList<String> password = new ArrayList<String>();
        password.addAll(charList);
        password.addAll(numList);
        password.addAll(letterList);
        Collections.shuffle(password);
        return password;
    }
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        String lengthString = scanner.nextLine();
        System.out.print("How many special characters? ");
        String spCharstring = scanner.nextLine();
        System.out.print("How many numbers? ");
        String numberString = scanner.nextLine();

        int length = Integer.parseInt(lengthString);
        int spChar = Integer.parseInt(spCharstring);
        int number = Integer.parseInt(numberString);

        int total = spChar + number;
        if(length > total)
        {
            total = length - total;
        }
        else if(total > length)
        {
            total = spChar + number;
        }
        total = total + rand.nextInt(6);;

        ArrayList<String> charList = new ArrayList<String>();
        charList = randomChar(spChar);

        ArrayList<String> numList = new ArrayList<String>();
        numList = randomNum(number);

        ArrayList<String> letterList = new ArrayList<String>();
        letterList = randomLetters(total);

        ArrayList<String>password = new ArrayList<String>();
        password = randomize(charList,numList,letterList);

        String strList = password.toString();
        strList = strList.replace("[", "").replace("]", "").replace(",","").replace(" ","");

        System.out.println("Your password is "+strList);

    }
}
