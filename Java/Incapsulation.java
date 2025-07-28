// import java.util.*;

abstract class Animal{
    Animal(){
        System.out.println("Created an Animal");
    }
    abstract  void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends  Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Created a Chicken");
    }
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}



public class Incapsulation {
    public static void main(String[] args) {
        System.out.println("-----------Encapsulation Example-----------");

        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        // Chicken chicken = new Chicken();
        // chicken.walk();
    }
}
