package com.bbc.romangenerator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creates a new instance of the RomanGenerator

        RomanGenerator converter = new RomanGenerator();

        Scanner scanner = new Scanner(System.in);

        // prints a call to action to the console

        System.out.print("Enter a number between 1 and 3999: ");
        int inputNumber = scanner.nextInt();

        // passes the user input to the roman generator method

        String result = converter.generate(inputNumber);

        // displays result in the console

        if (inputNumber < 1 || inputNumber > 3999) System.out.println(result);
        else System.out.println("The roman numeral equivalent for " + inputNumber + " is " + result);
    }

}

