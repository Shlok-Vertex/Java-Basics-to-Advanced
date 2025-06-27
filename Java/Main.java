import java.util.*;


public class Main{
    public static void main(String[] args) {
        //Output statement
        System.out.println("Hello, World with Java!");
        System.out.println("Welcome to Java Programming!");

        //variable declaration and initialization
        int num = 10;
        String name = "Shlok srivastava";
        System.out.println("Value of num : " + num);
        System.out.println("Name : " + name);

        //Data types

        //int - Integer type
        int age = 25;
        //double - Floating point type
        double salary = 50000.50;
        //char - Character type
        char grade = 'A';
        //boolean - Boolean type
        boolean isEmployed = true;
        //String - String type
        String address = "123 Main St, Anytown, USA";

        //Data types (Primitive and Non-Primitive)
        // Primitive Data Types - int, double, char, boolean, byte, short, long, float
        // Non-Primitive Data Types - String, Arrays, Classes, Objects, Interfaces

        //Input statement
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Your Name : " + userName);

    }
}