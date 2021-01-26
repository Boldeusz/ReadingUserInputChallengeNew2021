package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);


        int x = 1;
        int count = 0;
        while (x <= 10) {
            System.out.println("Enter number #" + x);

            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                x++;
                count += number;
            } else {
                System.out.println("Invalid number");
  //              break;
            }
                scanner.nextLine();
        }
        System.out.println("Total of numbers: " + count);


        scanner.close();
    }
}
