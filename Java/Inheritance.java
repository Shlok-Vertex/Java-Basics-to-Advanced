class Shape{
    String color;
    String type;
}

class Triangle extends Shape{
    int base;
    int height;

    public void calculateArea(){
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}



public class Inheritance {
    public static void main(String[] args) {
        System.out.println("-----------Inheritance Example-----------");

        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.type = "Equilateral";
        t1.base = 5;
        t1.height = 10;
        t1.calculateArea();
    }
}
