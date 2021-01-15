package com.tts;

import com.tts.Calculator;
import com.tts.MagicCalculator;

public class Main {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;

        System.out.println("Welcome to the Calculator Plus\n" + "{Num1 = 4 , Num2 = 2} \n" + "Have Fun!\n");
        
        //Calc Class Prints

        //Addition
        System.out.println("Here we're adding 2 numbers together using Addition.");
        System.out.println("Adding num1 and num2:");
        System.out.println("Adding 4 + 2");
        System.out.println("Answer:" + Calculator.add(num1, num2));
        System.out.print("\n");

        //Subtraction
        System.out.println("Here we're subtracting 2 numbers together using Subtraction.");
        System.out.println("Subtracting num1 and num2:");
        System.out.println("4 - 2");
        System.out.println("Answer:" + Calculator.subtract(num1, num2));
        System.out.print("\n");

        //Multiplication
        System.out.println("Here we're multiplying 2 numbers together using Multiplication.");
        System.out.println("Multiplying num1 and num2:");
        System.out.println("4 * 2");
        System.out.println("Answer:" + Calculator.multiply(num1, num2));
        System.out.print("\n");

        //Division
        System.out.println("Here we're dividing one number from another using Division.");
        System.out.println("Dividing num1 and num2:");
        System.out.println("4 / 2");
        System.out.println("Answer:" + Calculator.divide(num1, num2));
        System.out.print("\n");

        //Squaring
        System.out.println("Here we're squaring a number to itself.");
        System.out.println("Squaring num1:");
        System.out.println("4 * 4");
        System.out.println("Answer:" + Calculator.square(num1));
        System.out.print("\n");

        //% Percent
        System.out.println("Here we're calculating the %  Percent of num1.");
        System.out.println("% of num1:");
        System.out.println("(4 / 2) * 100");
        System.out.println("Answer:" + Calculator.percent(num1, num2) + "%");
        System.out.print("\n");

        //Magic Calc Class Prints

        //Square Root
        System.out.println("Square Root");
        System.out.println("The Square Root of num1.");
        System.out.println("The Square Root of 4.");
        System.out.println("Answer:" + MagicCalculator.squareRoot(num1));
        System.out.print("\n");

        //Sin
        System.out.println("Sin");
        System.out.println("The Sin of num1.");
        System.out.println("The Sin of 4.");
        System.out.println("Answer:" + MagicCalculator.sin(num1));
        System.out.print("\n");

        //Cosine
        System.out.println("Cosine");
        System.out.println("The Cosine of num1.");
        System.out.println("The Cosine of 4.");
        System.out.println("Answer:" + MagicCalculator.cosine(num1));
        System.out.print("\n");

        //Tangent
        System.out.println("Tangent");
        System.out.println("The Tangent of num1.");
        System.out.println("The Tangent of 4.");
        System.out.println("Answer:" + MagicCalculator.tangent(num1));
        System.out.print("\n");

        //Exponent
        System.out.println("Exponent");
        System.out.println("The exponent of 10 and num1.");
        System.out.println("10 to the 4th power.");
        System.out.println("Answer:" + MagicCalculator.power(num1));
        System.out.println("\n");

        //Reciprocal
        System.out.println("Reciprocal");
        System.out.println("The Reciprocal/Inverse of num1.");
        System.out.println("1 divided by 4 (num1).");
        System.out.println("Answer:" + MagicCalculator.reciprocal(num1));
        System.out.println("\n");


        //Factorial
        System.out.println("Factorial");
        System.out.println("The Factorial of 4 (num1).");
        System.out.println("Answer:" + MagicCalculator.factorial(num1));
        System.out.print("\n");


    }
}

//unused code
//System.out.println("please enter number");
