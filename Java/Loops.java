import java.util.*;

public class Loops {
    public static void main(String[] args){
        // Input statement 
        Scanner sc = new Scanner(System.in);

        // Loops statement - for, while, do-while
        System.out.println("--------------------");

        String name = "Shlok srivastava";

        for(int i=0;i<name.length();i++){
            System.out.println("Character at index " + i + " : " + name.charAt(i));
        }
        System.out.println("--------------------");
        // For Loop
        for(int i=0; i < 5; i++) {
            System.out.println("For Loop : " + i);
        }

        System.out.println("--------------------");

        // While Loop
        int i = 0;
        while(i<11){
            System.out.println("While Loop : " + i);
            i++;
        }

        System.out.println("--------------------");

        // Do-While Loop
        int j = 0;
        do {
            System.out.println("Do-While Loop : " + j);
            j++;
        } while(j < 5);

        System.out.println("--------------------");

        // Sum of n natural numbers
        System.out.print("Enter numbers for sum of natural number : ");
        int nt = sc.nextInt();
        int sum = 0;
        for(int k=1; k <=nt; k++){
            sum += k;
        }
        System.out.println("Sum of first " + nt + " natural numbers is : " + sum);

    }
}
