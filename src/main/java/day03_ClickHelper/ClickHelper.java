package day03_ClickHelper;

public class ClickHelper {

    //MethodOverloading
    //Three methods with the exact same name (clickElement)
    // but because their parameter lists are different
    // Java knows exactly which one to execute.
    // That is compile-time polymorphism in action.

    public void clickElement(String element) {
        System.out.println("clicking on element " + element);
    }

    ////Using same method in the same class using different parameters
    public void clickElement(String element, int timeoutSeconds) {
        System.out.println("clicking on element " + element + " with timeout " + timeoutSeconds);
        //// Calling Version 1 so we don't duplicate the print statement!
        clickElement(element);
    }

    public void clickElement(String element, Boolean forceClick) {
       //If condition is met -> goes onto next step
        if (forceClick == true) {
            System.out.println("Executing JavaScript Force-Click on: " + element);
        } else {
            //// Reusing Version 1 here too!
            clickElement(element);
        }
    }
}
