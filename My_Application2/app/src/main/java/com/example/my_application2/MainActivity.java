package com.example.my_application2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        int division = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

    }
}