import java.util.*;

public class CSE {
    public static void main(String[] args) {
        // System.out.println("Hello world...");
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hello " + name + "!");

        //concatenation
        String firstName = "Shlok";
        String lastName = "srivastava";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name : " + fullName);
        System.out.println("Length : " + fullName.length());

        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println("Character at index " + i + " : " + fullName.charAt(i));
        }

        if(firstName.compareTo(lastName) < 0) {
            System.out.println(firstName + " comes before " + lastName);
        } else if(firstName.compareTo(lastName) > 0) {
            System.out.println(firstName + " comes after " + lastName);
        } else {
            System.out.println(firstName + " is equal to " + lastName);
        }

        String subString = fullName.substring(6,fullName.length());
        System.out.println(subString);

    }
}