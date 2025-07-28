
interface Animal{
    int eyes = 2;
    public void walk();
    void eat();
}

interface Herbivore{
    
}

class Horse implements Animal, Herbivore {
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
    public void eat(){
        System.out.println("Horse eats grass");
    }
}


public class Interface {
    public static void main(String[] args) {
        System.out.println("-----------Interface Example-----------");

    }
}
