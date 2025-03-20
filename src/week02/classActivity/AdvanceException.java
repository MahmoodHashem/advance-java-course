package week02.classActivity;

import java.util.Scanner;

public class AdvanceException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days;

        while (true) {

            try {
                System.out.print("Enter a day of Febrauray month: ");
                days = sc.nextInt();
                validateMonth(days);
                System.out.println("Got it, you entered " + days);
                break;
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
                sc.next();
            } finally {
                sc.close();
                System.out.println("Finally block");
            }
        }

    }

    private static void validateMonth(int days) {
        if (days > 28 || days < 0)
            throw new IllegalArgumentException("Febrauray is 28 days month!, Please Enter a valid day: ");
    }

}
