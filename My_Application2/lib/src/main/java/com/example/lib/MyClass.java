package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();// taking input of 1st
        System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();
    float division = (float)num1 / (float)num2;
    int remainder = num1 % num2;
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);
    }

}