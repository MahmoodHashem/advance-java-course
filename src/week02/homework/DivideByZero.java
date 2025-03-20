package week02.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter first number: ");
                int n1 = sc.nextInt();
                System.out.print("Enter Second number: ");
                int n2 = sc.nextInt();
                System.out.println(sum(n1, n2));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalide input");
                sc.next();
            }
        }
        sc.close();

    }

    public static int sum(int num1, int num2) {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
            return Integer.MIN_VALUE;
        }
    }
}
