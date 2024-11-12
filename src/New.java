
//What is the difference between primitive and non-primitive data types?
//
//* Primitive data types are predefined by Java, representing simple values like numbers and characters
// (int, double, char, etc.).
//* Non-primitive data types (also called reference types) are created by the programmer and include classes,
// arrays, and interfaces.

//Data Types (Primitive and Non-Primitive)
//List the eight primitive data types in Java.
//1. byte
//2. short
//3. int
//4. long
//5. float
//6. double
//7. char
//8. boolean

public class New {

    //What is the main method in Java, and why is it important?
    //* The main method is the entry point of any Java application. It’s where the Java Virtual Machine (JVM) starts executing the program. The standard signature of the main method is: public static void main(String[] args) {
    //    // Code to be executed
    //}
    public static void main(String[] args) {
        //Explain each keyword in the main method signature public static void
        //main(String[] args).
        //A:
        //● public: The method is accessible from any other class.
        //● static: The method can be called without creating an instance of the class.
        //● void: The method does not return any value.
        //● main: The name of the method, which the JVM looks for as the starting point.
        //● String[] args: An array of strings passed as command-line arguments to the
        //program.

        //Question
      // Declare variables for the following data types and assign them values:
        //An integer for age
        //A double for height
        //A boolean for isStudent
        //A string for name
        //Print each variable’s value to the console.

       int age = 30;
       double height = 4.6;
       boolean isStudent = false;
       String name = "Hana";

        System.out.println("Age is" + age);
        System.out.println("This is the " + height);
        System.out.println("the isStudent is " + isStudent);
        System.out.println("The name is " + name);

    }
}

//: Explain the purpose of the modulus operator (%) in Java.
//The modulus operator (%) returns the remainder of the division of two numbers. For example:
//java
//Copy code
//int result = 10 % 3; // result is 1 because 10 divided by 3 leaves a
//remainder of 1
