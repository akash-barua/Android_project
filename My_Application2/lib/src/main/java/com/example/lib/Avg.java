package com.example.lib;

import java.util.Scanner;

public class Avg{
        public static void main(String[] args)
        {
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter the size of the array: ");
                    int size = scanner.nextInt();

                    int[] array = new int[size];
                    System.out.println("Enter element ");
                    for (int i = 0; i < size; i++) {

                        array[i] = scanner.nextInt();
                    }

                    // Calculate the sum of all even array elements.
                    int sumOfEvenElements = 0;
                    int countOfEvenElements = 0;

                    for (int i = 0; i < size; i++) {
                        if (array[i] % 2 == 0) {
                            sumOfEvenElements += array[i];
                            countOfEvenElements++;
                        }
                    }

                    // Calculate the average of the even array elements.
                    float average = (float) sumOfEvenElements / countOfEvenElements;

                    System.out.println("The average of the even array elements is: " + average);
                }
            }



