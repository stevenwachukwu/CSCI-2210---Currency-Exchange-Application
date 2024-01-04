/*
University of New Haven
CSCI 2210 S01 Fall 2022
Java Programming
Steve Nwachukwu
snwac1@unh.newhaven.edu
Instructor: Sheehan

CurrencyExchangeApplicationClass.java
This java class is used to convert a specified amount of currency into another currency from the user.
 */

import java.util.Scanner;
public class CurrencyExchangeApplicationClass {
    public static void main(String[] args) {
        //Creating the scanner object for the user
        Scanner input = new Scanner(System.in);
        //Welcome message of the Currency Exchange Application
        System.out.print("Hi and welcome to my Currency Exchange Application!");

            //Another message that asks what source currency does the user want to convert from
            System.out.print("\nWhich of the following currencies do you want to convert from?");
            System.out.print("\n1: USD, 2: GBP, 3: CHF, 4: INR");

            //Variable for the user to choose what source currency they want to convert from
            int option = input.nextInt();

            if (option == 1) {
                System.out.print("\nOkay, your source currency is in USD.");
                System.out.print("\nWhat amount do you want to enter in?");
                //Variable for the user to put in the amount of money they want to convert
                double USD1 = input.nextDouble();
                if (USD1 <= 1000000) {
                    System.out.print("\nOkay, you did not exceeded the maximum amount.");
                } else {
                    System.out.print("Sorry but you exceeded the maximum amount, please try again.");
                }
                System.out.print("\nWhich of the following currencies do you want to convert to?");
                System.out.print("\n1: GBP, 2: CHF, 3: INR");
                //Variable for the user to choose what result currency they want to convert to
                int option2 = input.nextInt();

                if (option2 == 1) {
                    System.out.print("Okay, your result currency is in GBP.");
                    double pound1 = USD1 * 0.7722681; //formula used for the conversion
                    System.out.print("\nYour USD amount which was " +"$ "+ USD1 + " is " + String.format
                            ("%.2f",pound1) + " in GBP.");
                } else if (option2 == 2) {
                    System.out.print("Okay, your result currency is in CHF.");
                    double swiss1 = USD1 * 0.910585; //formula used for the conversion
                    System.out.print("\nYour USD amount which was " + "$ " + USD1 + " is " +
                            String.format("%.2f",swiss1) + " in CHF.");
                } else if (option2 == 3) {
                    System.out.print("Okay, your result currency is in INR.");
                    double rupees1 = USD1 * 73.4772; //formula used for the conversion
                    System.out.print("\nYour USD amount which was " + "$ " + USD1 + " is " +
                            String.format("%.2f",rupees1) + " in INR.");
                }



            } else if (option == 2) {
                System.out.print("\nOkay, your source currency is in GBP.");
                System.out.print("\nWhat amount do you want to enter in?");
                double GBP1 = input.nextDouble();
                if (GBP1 <= 1000000) {
                    System.out.print("\nOkay, you did not exceeded the maximum amount.");
                }
                else {
                    System.out.print("Sorry but you exceeded the maximum amount, please try again.");
                }
                System.out.print("\nWhich of the following currencies do you want to convert to?");
                System.out.print("\n1: USD, 2: CHF, 3: INR");
                //Variable for the user to choose what result currency they want to convert to
                int option3 = input.nextInt();

                if (option3 == 1) {
                    System.out.print("Okay, your result currency is in USD.");
                    double dollars2 = GBP1 * 129498; //formula used for the conversion
                    System.out.print("\nYour GBP amount which was " + GBP1 + "is " + "$ " +
                            String.format("%.2f",dollars2) + " in dollars.");
                } else if (option3 == 2) {
                    System.out.print("Okay, your result currency is in CHF.");
                    double swiss2 = GBP1 * 1.17887; //formula used for the conversion
                    System.out.print("\nYour GBP amount which was " + GBP1 + " is " +
                            String.format("%.2f",swiss2) + " in CHF.");
                } else if (option3 == 3) {
                    System.out.print("Okay, your result currency is in INR.");
                    double rupees2 = GBP1 * 95.1467; //formula used for the conversion
                    System.out.print("\nYour GBP amount which was " + GBP1 + " is " +
                            String.format("%.2f",rupees2) + " in INR.");
                }

            } else if (option == 3) {
                System.out.print("\nOkay, your source currency is in CHF");
                System.out.print("\nWhat amount do you want to enter in?");
                double CHF1 = input.nextDouble();
                if (CHF1 <= 1000000) {
                    System.out.print("\nOkay, you did not exceeded the maximum amount.");
                }
                else {
                    System.out.print("Sorry but you exceeded the maximum amount, please try again.");
                }
                System.out.print("\nWhich of the following currencies do you want to convert to?");
                System.out.print("\n1: USD, 2: GBP, 3: INR");
                //Variable for the user to choose what result currency they want to convert to
                int option4 = input.nextInt();

                if (option4 == 1) {
                    System.out.print("Okay, your result currency is in USD.");
                    double dollars3 = CHF1 * 1.09820; //formula used for the conversion
                    System.out.print("\nYour CHF amount which was " + CHF1 + " is " + "$ " +
                            String.format("%.2f",dollars3));
                } else if (option4 == 2) {
                    System.out.print("Okay, your result currency is in GBP.");
                    double pounds3 = CHF1 * 0.848271; //formula used for the conversion
                    System.out.print("\nYour CHF amount which was " + CHF1 + " is " + String.format("%.2f",pounds3));
                } else if (option4 == 3) {
                    System.out.print("Okay, your result currency is in INR.");
                    double rupees3 = CHF1 * 80.7070; //formula used for the conversion
                    System.out.print("\nYour CHF amount which was " + CHF1 + " is " +
                            String.format("%.2f",rupees3));
                }

            } else if (option == 4) {
                System.out.print("\nOkay, your source currency is in INR");
                System.out.print("\nWhat amount do you want to enter in?");
                double INR1 = input.nextDouble();
                if (INR1 <= 1000000) {
                    System.out.print("\nOkay, you did not exceeded the maximum amount.");
                }
                else {
                    System.out.print("Sorry but you exceeded the maximum amount, please try again.");
                }
                System.out.print("\nWhich of the following currencies do you want to convert to?");
                System.out.print("\n1: USD, 2: GBP, 3: CHF");
                //Variable for the user to choose what result currency they want to convert to
                int option5 = input.nextInt();

                if (option5 == 1) {
                    System.out.print("Okay, your result currency is in USD.");
                    double dollars4 = INR1 * 0.0136097; //formula used for the conversion
                    System.out.print("\nYour INR amount which was " + INR1 + " is " + "$ " +
                            String.format("%.2f",dollars4));
                } else if (option5 == 2) {
                    System.out.print("Okay, your result currency is in GBP.");
                    double pounds4 = INR1 * 0.0105101; //formula used for the conversion
                    System.out.print("\nYour INR amount which was " + INR1 + " is " +
                            String.format("%.2f",pounds4));
                } else if (option5 == 3) {
                    System.out.print("Okay, your result currency is in CHF.");
                    double rupees4 = INR1 * 0.0123905; //formula used for the conversion
                    System.out.print("\nYour INR amount which was " + INR1 + " is " +
                            String.format("%.2f",rupees4));
                }

            }
         }
    }


