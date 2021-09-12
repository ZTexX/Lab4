// Lab 4A

import java.util.Scanner;

public class Lab4A {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double grade;

        Object[][] letterGrades = {
                {"A+", 97, 100},
                {"A", 94, 97},
                {"A-", 91, 94},
                {"B+", 88, 91},
                {"B", 85, 88},
                {"B-", 82, 85},
                {"C+", 79, 82},
                {"C", 76, 79},
                {"C-", 73, 76},
                {"D+", 70, 73},
                {"D", 67, 70},
                {"D-", 64, 65},
                {"F", 0, 64}
        };

        System.out.print("Enter the score of your exam: ");
        grade = sc.nextDouble();

        for (int i = 0; i < letterGrades.length; i++) {
            if (grade > (int) letterGrades[i][1] && grade <= (int) letterGrades[i][2]) {
                System.out.println("Letter grade is: " + (String) letterGrades[i][0]);
                break;
            }
        }
    }
}