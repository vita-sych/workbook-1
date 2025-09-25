package exercises;

import java.util.Scanner;

public class IfStatementExercise {
    public static void main(String[] args) {
//    Positive number Write a program that checks if a number is greater than 0.
//    👉 If yes, print "Positive number", otherwise "Not positive".

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1 = scanner1.nextInt();

        if (num1 > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not positive");
        }

//    Even or odd Given an integer, check if it’s even or odd.
//    👉 Print "Even" if divisible by 2, otherwise "Odd".

        if (num1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

//    Temperature check Check if the temperature is higher than 25.
//    👉 Print "Hot" if true, otherwise "Not hot".

        System.out.println("Please enter the temperature:");
        int temp = scanner1.nextInt();

        if (temp > 25) {
            System.out.println("Hot");
        } else {
            System.out.println("Not hot");
        }

//    Teenager check Given an age, check if it is between 13 and 19 (inclusive).
//    👉 Print "Teenager" or "Not a teenager".

        System.out.println("Please enter the age:");
        int age = scanner1.nextInt();

        if (age > 13 && age < 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not a teenager");
        }

//    Voting age Given an age, check if the person is allowed to vote (18 or older).
//    👉 Print "Can vote" or "Too young to vote".

        if (age > 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Too young to vote");
        }

//    Divisible by 3 and 5 Given a number, check if it is divisible by both 3 and 5.
//    👉 Print "Divisible by 3 and 5" or "Not divisible by 3 and 5".

        System.out.println("Please enter the number:");
        int num2 = scanner1.nextInt();

        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Divisible by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }

//    Safe speed Given a speed, check if it is below 30 or above 100.
//    👉 If true, print "Unsafe speed", otherwise "Safe speed".

        System.out.println("Please enter the speed:");
        int num3 = scanner1.nextInt();

        if (num3 < 30 || num3 > 100) {
            System.out.println("Unsafe speed");
        } else {
            System.out.println("Safe speed");
        }

//    Leap year (simple version) Given a year, check if it is divisible by 4 and not divisible by 100.
//    👉 Print "Leap year" or "Not leap year". (We’ll ignore the full leap-year rules for now.)

        System.out.println("Please enter the year:");
        int num4 = scanner1.nextInt();

        if (num4 % 4 == 0 && num4 % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

//    Which number is bigger? Given two numbers a and b, print which one is bigger.
//    👉 Print "a is bigger" or "b is bigger".

        System.out.println("Please enter the number a:");
        int a = scanner1.nextInt();
        System.out.println("Please enter the number b:");
        int b = scanner1.nextInt();

        if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }

//    Pass or fail Given a score, check if it is at least 50.
//    👉 Print "Pass" or "Fail".

        System.out.println("Please enter the score value:");
        int num5 = scanner1.nextInt();

        if (num5 >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("PassFail");
        }
    }
}
