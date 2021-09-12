// Lab 4C

import java.util.Scanner;

public class Lab4C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num;
        int choice = -1;

        System.out.println("Welcome!");
        System.out.print("Please input a number: ");
        num = sc.nextInt();

        Object[][] choices = {
                {0, "The additive inverse of " + num + " is " + (num * -1)},
                {1, "The reciprocal of " + num + " is " + 1/num},
                {2, "The square of " + num + " is " + Math.pow(num, 2)},
                {3, "The cube of " + num + " is " + Math.pow(num, 3)},
        };

        System.out.println("\nWhat would you like to do to this number:");
        System.out.println("0- Get the additive inverse of the number");
        System.out.println("1- Get the reciprocal of the number");
        System.out.println("2- Square the number");
        System.out.println("3- Cube the number");
        System.out.println("4- Exit the program");
        while (choice < 0 || choice > 4) {
            choice = sc.nextInt();
        }

        if (choice == 4) {
            System.out.println("Thank you, goodbye!");
            System.exit(0);
        }

        for (int i = 0; i < choices.length; i++) {
            if (choice == (int) choices[i][0]) {
                System.out.println((String) choices[i][1]);
                break;
            }
        }
    }
}

