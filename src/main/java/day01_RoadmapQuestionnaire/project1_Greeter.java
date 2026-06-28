package day01_RoadmapQuestionnaire;

import java.util.Scanner;

public class project1_Greeter {

    public static void calculateTimeline(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        System.out.println("👉 That is exactly " + weeks + " weeks and " + remainingDays + " days of focused execution!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\"Hello! Your IDE setup is officially complete.\"");
        System.out.println("\"What project are we going to automate first? \"");

        String projectID = sc.nextLine();

        System.out.println("\nFantastic choice! '" + projectID + "' sounds like an incredible project.");
        System.out.println("Let's get to work!");

        boolean keepRunning = true;

        System.out.println("====== WELCOME BACK TO YOUR JAVA SANDBOX ======");

        while (keepRunning) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Calculate a dynamic automation timeline");
            System.out.println("2. Get a motivational coding boost");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice (1-3): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Clear the scanner buffer

            if (choice == 1) {
                System.out.print("How many days is your automation roadmap plan? ");
                int days = sc.nextInt();
                int weeks = days / 7;
                int remainingDays = days % 7;
                System.out.println("👉 That is exactly " + weeks + " weeks and " + remainingDays + " days of focused execution!");
            } else if (choice == 2) {
                System.out.println("🚀 'Every master was once a beginner. Keep compiling, keep testing, and don't fear the red text!'");
            } else if (choice == 3) {
                System.out.println("Closing the environment. Great session today!");
                keepRunning = false;
            } else {
                System.out.println("❌ Invalid choice. Please pick a number from 1 to 3.");
            }
            while (keepRunning) {
                if (choice == 1) {
                    System.out.println("How many days is your automation roadmap plan? ");
                    int days = sc.nextInt();

                    calculateTimeline(days);
                }
            }
        }

        sc.close();
    }
}
