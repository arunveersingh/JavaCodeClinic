package com.oopsfeedmecode.example5.solution;

public class Example {
    // Refactored code is better as:
    // From OOP perspective
    // ====================
    // 1. Adherence to Single Responsibility Principle:
    //      By using method overloading in the Example, each display method variation
    //      handles a specific case. This aligns with the Single Responsibility Principle,
    //      making the class more modular and each method more focused.
    // 2. Improved Clarity and Simplicity:
    //      The overloaded methods clearly define what each method does based on the provided arguments.
    //      This improves clarity and simplicity, making the code easier to read and maintain.
    // 3. Avoidance of null Values:
    //      The improved design avoids the use of null as a way to determine behavior,
    //      thus reducing the risk of NullPointerExceptions and making the code more robust and intuitive.
    //
    // From good programming perspective
    // =================================
    // 1. Clarity and Simplicity:
    //      Each overloaded method has a clear purpose, enhancing readability
    //      and understandability. This simplicity makes it easier for others
    //      to read and use the code effectively.
    // 2. Strong Type Safety:
    //      By avoiding the use of null, the code becomes more type-safe, reducing the
    //      likelihood of runtime errors and increasing overall code robustness.
    // 3. Ease of Maintenance and Extension:
    //      The clear separation of concerns makes the code easier to maintain and extend.
    //      If new functionality needs to be added, it can be done without disturbing the existing logic,
    //      adhering to the Open/Closed Principle of OOP.
    // 4. Predictability:
    //      The behavior of each method is predictable based on its parameters.
    //      This predictability is crucial for good programming, as it ensures that other developers
    //      can use your methods without unexpected outcomes.

    // Main method with all arguments
    public void display(String message, int number) {
        System.out.println(message + ": " + number);
    }

    // Overloaded method with one default argument
    public void display(String message) {
        display(message, 0); // Default value for number is 0
    }

    // Overloaded method with both arguments as default
    public void display() {
        display("Default Message", 0); // Default values for both arguments
    }

    public static void main(String[] args) {
        Example obj = new Example();

        obj.display("Hello", 10); // Calls main method with specific values
        obj.display("Hello"); // Calls overloaded method with one default value
        obj.display(); // Calls overloaded method with all default values
    }
}


