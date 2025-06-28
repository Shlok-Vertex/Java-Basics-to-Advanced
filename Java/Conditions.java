import java.util.*;

public class Conditions {
    public static void main(String[] args){
        // Input statement 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        // Condotion statements - if/else.
        if(age > 18){
            System.out.println("You can vote!.... " + name);
        }else{
            System.out.println("You cannot vote!... " + name);
        }

        // To check number is either even or odd.

        System.out.print("Enter number to check Even/Odd : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is Odd.");
        }

        System.out.print("Choose a number ( 1 - 3 ) : ");
        int button = sc.nextInt();
        // Condition statement - Switch
        switch(button){
            case 1 : System.out.println("Hello! " + name);
            break;
            case 2 : System.out.println("Namaste! " + name);
            break;
            case 3 : System.out.println("Bonjour! " + name);
            break;
            default: System.out.println("Invalid Button!...");
        }
    }
}
