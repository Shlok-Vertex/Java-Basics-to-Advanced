class Pen{
    String color;
    String type;

    public void sketch(){
        System.out.println("Sketch");
    }

    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Student Name : "+ this.name);
        System.out.println("Student Age : "+ this.age);
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    
    Student(){
        System.out.println("---Constructor called---");
    }
}


public class OOPS {
    public static void main(String[] args) {
        System.out.println("-----------OOPS STARTED-----------");

        // Pen pen1 = new Pen();
        // pen1.color = "black";
        // pen1.type = "gel";
        // pen1.sketch();

        // Pen pen2 = new Pen();
        // pen2.color = "blue";
        // pen2.type = "ball";

        // pen1.printColor();
        // pen1.printType();
        // pen2.printColor();
        // pen2.printType();

        Student s1 = new Student();
        s1.name = "Shlok srivastava";
        s1.age = 19;

        s1.printInfo();
    }
}
