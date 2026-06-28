package day02_OOP;

import java.util.Scanner;

public class BugReport_TestSuite {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean keepRunning = true;

            System.out.println("====== WELCOME TO DAY 2: OOP PORTFOLIO ======");

            while (keepRunning) {
                System.out.println("\nSelect an Option:");
                System.out.println("1. Log a new software bug report");
                System.out.println("2. Exit program");
                System.out.print("Choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                if (choice == 1) {
                    BugReport myBug = new BugReport();

                    myBug.id = 101;

                    System.out.print("Enter Bug Title (e.g., Login button broken): ");
                    myBug.title = scanner.nextLine();

                    System.out.print("Enter Severity (High/Medium/Low): ");
                    myBug.severity = scanner.nextLine();

                    System.out.println("\n🎉 Object created successfully! Printing details:");
                    myBug.printDetails();
                }
                else if (choice == 2) {
                    System.out.println("Closing Day 2 environment.");
                    keepRunning = false;
                }
            }
            scanner.close();
        }
    }
