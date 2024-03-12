package com.poli.esc1y2;

import java.util.Scanner;

public class MultipleOf100Checker {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter an integer
            System.out.print("Enter an integer: ");

            // Read the entered integer
            int number = scanner.nextInt();

            // Check if the entered number is a multiple of 100
            if (isMultipleOf100(number)) {
                System.out.println("multiple of 100");
            } else {
                System.out.println("not multiple of 100");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            // Close the Scanner to avoid resource leaks
            scanner.close();
        }
    }

    /**
     * Check if a given number is a multiple of 100.
     *
     * @param num The number to be checked.
     * @return true if the number is a multiple of 100, false otherwise.
     */
    private static boolean isMultipleOf100(int num) {
        return num % 100 == 0;
    }
}
