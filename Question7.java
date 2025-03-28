package Manibhushan;


class Shape{
    String color;
    Shape(String color){
        this.color = color;
    }
}
class Circle extends Shape{
    double radius;
    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    void Display(){
        System.out.println("Circle color: " + color);
        System.out.println("Circle radius: " + radius);
        System.out.println("Circle area: " + area());
    }
}
class Rectangle extends Shape{
    double length , width ;
    Rectangle(String color, double length,double width){
        super(color);
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }
    void Display(){
        System.out.println("Color of rectangle : " + color);
        System.out.println("Length of the rectangle : " + length);
        System.out.println("Width of rectangle : " + width);
        System.out.println("Area of rectangle : " + area());
    }
}

public class ShapeDemoQ7 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle("Black",10,5);
        r.Display();
        System.out.println();
        Circle c = new Circle("Blue",8);
        c.Display();

    }
}

