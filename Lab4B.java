// Lab 4B

import java.util.Scanner;

public class Lab4B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String day;

        String[][] days = {
                {"Sunday", "I should use this time to do my homework."},
                {"Monday", "I have class today!"},
                {"Tuesday", "I should use this time to do my homework."},
                {"Wednesday", "I have class today!"},
                {"Thursday", "I should use this time to do my homework."},
                {"Friday", "It's Friday! Friday! Gotta get down on Friday!"},
                {"Saturday", "I should use this time to do my homework."}
        };

        System.out.print("Enter the day: ");
        day = sc.nextLine();

        for (int i = 0; i < days.length; i++) {
            if (day.toLowerCase().equals(days[i][0].toLowerCase())) {
                System.out.println(days[i][1]);
                break;
            }
        }
    }
}
