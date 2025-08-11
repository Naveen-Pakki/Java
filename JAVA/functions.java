//functions

// why functions give me some theory
// Functions are a fundamental building block in programming. They allow us to encapsulate code into reusable blocks, making our programs more modular and easier to understand. By using functions, we can break down complex problems into smaller, manageable pieces. This not only improves code readability but also facilitates easier debugging and testing. Additionally, functions promote code reusability, as we can call the same function multiple times with different inputs without rewriting the code.
// Functions can also help in organizing code logically, making it easier to maintain and update. They can take parameters, perform operations, and return results, allowing for dynamic behavior in our programs.

// function declaration
public static returntype functionName(parameters) {
    // function body
}

// basic function code
public static int add(int a, int b, int c) {
    return a + b + c;
}

public static int subtract(int a, int b) {
    return a - b;
}

public static int multiply(int a, int b) {
    return a * b;
}

public static void main(String[] args) {
    int addition = add(5, 3, 9);
    System.out.println("Sum: " + addition); // Output: Sum: 17

    int subtraction = subtract(10, 5);
    System.out.println("Difference: " + subtraction); // Output: Difference: 5

    int multiplication = multiply(4, 6);
    System.out.println("Product: " + multiplication); // Output: Product: 24
}

// function call with strings
public static String name(String s) {
    return "Name: " + s;
}

public static void main(String[] args) {
    String s = name("Hello, World!");
    System.out.println(s);
}


// function call with boolean

public static boolean validity(int a, int b) {
    return a > b; // output : true
}

public static void main(String[] args) {
    int check = validity(10,5);
    System.out.println(check); // output : true
}

// function call with void

public static void validity(int a, int b){
    if (a > b) {
        System.out.println("Valid");
    } else {
        System.out.println("Invalid");
    }
}
public static void main(String[] args) {
    validity(10,5);
}

// function call with parameters

public static int validity(int a, int b) {
    if (a > b) {
        return 1; // Valid
    } else {
        return 0; // Invalid
    }
}

public static void main(String[] args) {
    int check = validity(10,5);
    System.out.println(check); // output : 1
}

// function without parameters

public static void division() {
    int a = 10;
    int b = 2;
    if (b != 0) {
        System.out.println("Division: " + (a / b)); // Output: Division: 5
    } else {
        System.out.println("Cannot divide by zero");
    }
}
public static void main(String[] args) {
    division();
}


public static int reminder(){
    int a = 10;
    int b = 3;
    return a % b; // Returns the remainder of 10 divided by 3
}
public static void main(String[] args) {
    int ans = reminder();
    System.out.println("Reminder: " + ans);
}


// functions with return type
public static int square(int number) {
    return number * number; // Returns the square of the input number
}
public static void main(String args[]){
    int store = square(5);
    System.out.println("Square: " + store); // output: Square: 25
}

// function without return type

public static void printMessage() {
    System.out.println("This is a message from a void function.");
}
public static void main(String[] args) {
    printMessage(); // Calls the function to print the message
}

// all 4 combinations of functions
// No parameters, returns value

// With parameters, returns value

// No parameters, no return

// With parameters, no return

public class FunctionsDemo {
    
    // No return, no parameter
    static void greet() {
        System.out.println("Hello, Java!");
    }

    // Return with parameter
    static int square(int n) {
        return n * n;
    }

    // No return, with parameter
    static void printSum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Return with no parameter
    static double piValue() {
        return 3.1416;
    }

    public static void main(String[] args) {
        greet(); // calling method

        int sq = square(5); // calling and storing return
        System.out.println("Square: " + sq);

        printSum(10, 20); // calling void method with parameters

        double pi = piValue();
        System.out.println("PI: " + pi);
    }
}


/*
Practice Questions – Java Functions (Basic)
Write a method that prints "Hello World" 5 times.

Write a method that takes two numbers and returns their sum.

Write a method that returns the cube of a number.

Write a method that takes a number and prints whether it is even or odd.

Write a method to calculate the factorial of a number.

Write a method to check if a number is prime.

Write a method that returns the greatest of three numbers.

Write a method to convert Fahrenheit to Celsius.

Write a method that takes a string and returns it in reverse.

Write a method to check if a number is a palindrome. */