package day02_OOP;

public class BugReport {

        public int id;
        public String title;
        public String severity;

        public void printDetails() {
            System.out.println("-----------------------------------");
            System.out.println("🐛 BUG ID: " + id);
            System.out.println("📋 TITLE: " + title);
            System.out.println("🚨 SEVERITY: " + severity);
            System.out.println("-----------------------------------");
        }
    }
