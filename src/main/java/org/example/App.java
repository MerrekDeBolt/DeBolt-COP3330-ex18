package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 18 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double totalDegrees, inputVal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter C to convert from Fahrenheit to Celsius.\nEnter F to concert from Celsius to Fahrenheit.\nYour choice: ");
        input = scanner.nextLine();

        if (input.equals("C") || input.equals("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            inputVal = scanner.nextDouble();
            totalDegrees = (inputVal - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + totalDegrees + ".");
        }
        else if (input.equals("F") || input.equals("f"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            inputVal = scanner.nextDouble();
            totalDegrees = (inputVal * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + totalDegrees + ".");
        }
    }
}