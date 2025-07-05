import java.util.*;

public class Function {

    public static int add(int a, int b){
        return a + b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static int diff(int a, int b){
        return a - b;
    }
    public static int div(int a, int b){
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
        return a / b;
    }
    public static int factorial(int n){
        if (n < 0) {
            System.out.println("Factorial of negative numbers is not defined.");
            return -1; // or throw an exception
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int fibonacci(int n){
        if (n < 0) {
            System.out.println("Fibonacci of negative numbers is not defined.");
            return -1; // or throw an exception
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Function Program!");
        System.out.println("--------------------");
        // Input statement
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = add(num1, num2);
        System.out.println("--------------------");
        System.out.println("The sum is: " + sum);
        System.out.println("--------------------");
        int product = mul(num1, num2);
        System.out.println("The product is: " + product);
        System.out.println("--------------------");
        int difference = diff(num1, num2);
        System.out.println("The difference is: " + difference);
        System.out.println("--------------------");
        int quotient = div(num1, num2);
        System.out.println("The quotient is: " + quotient);
        System.out.println("--------------------");
        System.out.print("Enter a number to calculate its factorial: ");
        int factNum = sc.nextInt();
        int factorial = factorial(factNum);
        System.out.println("The factorial is: " + factorial);
        System.out.println("--------------------");
        System.out.print("Enter a number to calculate its Fibonacci: ");
        int fibNum = sc.nextInt();
        int fibonacci = fibonacci(fibNum);
        if (fibonacci != -1) {
            System.out.println("The Fibonacci number is: " + fibonacci);
        }
        System.out.println("--------------------");
    }
}
