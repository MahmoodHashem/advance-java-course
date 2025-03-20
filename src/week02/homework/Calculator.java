package week02.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    // ANSI color codes
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;
        
        System.out.println(BLUE + "╔══════════════════════════════════════╗" + RESET);
        System.out.println(
        BLUE + "║" + BOLD + PURPLE + "       ADVANCED JAVA CALCULATOR       " + RESET + BLUE + "║" + RESET);
        System.out.println(BLUE + "╚══════════════════════════════════════╝" + RESET);
        
        while (continueCalculating) {
            try {
                displayPrompt("Enter first number");
                int a = sc.nextInt();
                
                displayPrompt("Enter second number");
                int b = sc.nextInt();
                
                displayPrompt("Enter operator (+, -, *, /)");
                char operator = sc.next().charAt(0);
                
                int result = calculator(a, b, operator);
                System.out.println("\n" + GREEN + "╔══════════════════════════════════════╗" + RESET);
                System.out.println(GREEN + "║ " + BOLD + "Result: " + formatEquation(a, operator, b, result) + RESET + GREEN + " ║" + RESET);
                System.out.println(GREEN + "╚══════════════════════════════════════╝" + RESET);
                
            } catch (InputMismatchException e) {
                displayError("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear the scanner buffer
            } catch (IllegalArgumentException e) {
                displayError(e.getMessage());
            } catch (ArithmeticException e) {
                displayError("Cannot divide by zero!");
            } catch (Exception e) {
                displayError("An error occurred: " + e.getMessage());
            } finally {
                sc.nextLine(); // Clear any remaining input
                continueCalculating = askToContinue(sc);
            }
        }
        
        System.out.println("\n" + CYAN + "╔══════════════════════════════════════╗" + RESET);
        System.out.println(CYAN + "║" + YELLOW + BOLD + "      Thank you for calculating!      " + RESET + CYAN + "║" + RESET);
        System.out.println(CYAN + "╚══════════════════════════════════════╝" + RESET);
        sc.close();
    }
    
    private static void displayPrompt(String message) {
        System.out.print("\n" + CYAN + "» " + RESET + YELLOW + message + ": " + RESET);
    }
    
    private static void displayError(String message) {
        System.out.println("\n" + RED + BOLD + "X ERROR: " + message + RESET);
    }
    
    private static String formatEquation(int a, char operator, int b, int result) {
        return a + " " + operator + " " + b + " = " + YELLOW + result + RESET + GREEN;
    }
    
    private static boolean askToContinue(Scanner sc) {
        while (true) {
            System.out.print("\n" + PURPLE + "Continue calculating? (y/n): " + RESET);
            String response = sc.nextLine().trim().toLowerCase();
            if (response.equals("y")) return true;
            if (response.equals("n")) return false;
            System.out.println(YELLOW + "Please enter 'y' or 'n'" + RESET);
        }
    }

    public static int calculator(int a, int b, char operator) {
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return subtract(a, b);
            case '*':
                return multiply(a, b);
            case '/':
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
