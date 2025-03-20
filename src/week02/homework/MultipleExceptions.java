package week02.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;

        // Step 1: Get valid array size
        while (true) {
            try {
                System.out.print("Enter the size of the array: ");
                size = scanner.nextInt();

                if (size < 0) {
                    throw new IllegalArgumentException("Array size cannot be negative!");
                }
                break; // Exit loop if size is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear invalid input
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Step 2: Initialize array
        int[] arr = new int[size];

        // Step 3: Take input for array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    arr[i] = scanner.nextInt();
                    break; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter an integer.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Step 4: Get valid index from user and display value
        while (true) {
            try {
                System.out.print("Enter an index to retrieve value: ");
                int index = scanner.nextInt();
                System.out.println("Value at index " + index + ": " + arr[index]);
                break; // Exit loop if index is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear invalid input
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds! Please enter a valid index.");
            }
        }


        valideAge(size); 
        
                // Step 5: Close the scanner
                scanner.close();
            }
        
            private static void valideAge(int size) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'valideAge'");
            }
}
