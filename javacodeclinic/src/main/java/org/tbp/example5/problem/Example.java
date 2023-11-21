package org.tbp.example5.problem;

public class Example {

    // Problem explanation:
    // Issues from OOP perspective
    // ===========================
    // 1. Violation of Single Responsibility Principle:
    // ------------------------------------------------
    //      The display method is trying to handle multiple
    //      responsibilities (different ways of displaying messages) within a single method.
    //      This violates the Single Responsibility Principle, a core concept of
    //      object-oriented programming (OOP), which states that a class or method
    //      should have only one reason to change.
    // 2. Poor Readability and Maintainability:
    // ----------------------------------------
    //      The use of conditional statements to handle different cases within the same
    //      method leads to poor readability. This makes the code harder to understand and maintain.
    // 3. Use of null as Default Values:
    // ---------------------------------
    //      Relying on null values to trigger default behavior is not a clean or intuitive approach.
    //      It can lead to NullPointerExceptions and makes the code less robust.
    //
    // Issues from good programming perspective
    // ========================================
    // 1. Complexity and Confusion:
    // ----------------------------
    //      The use of if-else statements to handle different argument combinations in display
    //      adds unnecessary complexity. This can confuse other developers or even the original
    //      author when revisiting the code.
    // 2. Error-Prone Design:
    // ---------------------
    //      Utilizing null to denote the absence of parameters increases the risk of errors
    //      such as NullPointerExceptions. This practice makes the code less reliable and safe.
    // 3. Lack of Scalability:
    // ----------------------
    //      If additional parameters or cases need to be handled in the future,
    //      the complexity of the method increases significantly.
    //      This lack of scalability makes the code less adaptable to change.


    // A method that tries to handle multiple cases with if-else conditions
    public void display(String message, Integer number) {
        if (message == null && number == null) {
            System.out.println("Default Message: 0");
        } else if (number == null) {
            System.out.println(message + ": 0");
        } else if (message == null) {
            System.out.println("Default Message: " + number);
        } else {
            System.out.println(message + ": " + number);
        }
    }

    public static void main(String[] args) {
        Example obj = new Example();

        obj.display("Hello", 10); // Prints "Hello: 10"
        obj.display("Hello", null); // Prints "Hello: 0"
        obj.display(null, 10); // Prints "Default Message: 10"
        obj.display(null, null); // Prints "Default Message: 0"
    }
}


