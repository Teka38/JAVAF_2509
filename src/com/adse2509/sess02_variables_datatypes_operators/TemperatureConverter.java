package com.adse2509.sess02_variables_datatypes_operators;

import java.util.Scanner;

/**
 * Java Program that accepts the temperature in Degrees Fahrenheit
 * and converts it to Degrees Celsius.
 *
 * @author Teka
 */
public class TemperatureConverter {

    static Scanner sc;

    public static void main(String[] args) {

        // Declare the variables
        float fahrenheit, celsius;

        // Initialize Scanner
        sc = new Scanner(System.in);

        System.out.println("=".repeat(70));
        System.out.println("Degrees Fahrenheit to Degrees Celsius Converter");
        System.out.println("=".repeat(70));

        // Prompt the user
        System.out.print("Please enter the temperature in Degrees Fahrenheit: ");
        fahrenheit = sc.nextFloat();

        // Convert Fahrenheit to Celsius
        celsius = (fahrenheit - 32) / (9.0f / 5.0f);

        // Display the results
        System.out.printf("Degrees Fahrenheit : %.2f °F%n", fahrenheit);
        System.out.printf("Degrees Celsius    : %.2f °C%n", celsius);

        sc.close();
    }
}