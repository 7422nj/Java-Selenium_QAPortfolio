package day04_POM;

public class SmartAssert {

    public static void assertEquals(String actual, String expected, String errorMessage) {
        if (actual.equals(expected)) {
            System.out.println("[PASS] Validation successful. Values match.");
        } else {
            System.out.println("[FAIL] " + errorMessage + " (Expected: " + expected + ", but got: " + actual);
        }
    }
}
