package ManiBhushan;
import java.util.Scanner;

abstract class Shape{
    abstract double area(); // Abstract method
}
class Square extends Shape{
    double side;

    Square(double side){
        this.side = side ;
    }
    double area(){
        return side*side;
    }
}
class Triangle extends Shape{
    double base , height;

    Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        return 0.5*base*height;
    }
}
class Circle extends Shape{
    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI*radius*radius;
    }

}
public class ShapeArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of the square");
        double s = sc.nextDouble();
        Square s1 = new Square(s);
        System.out.println("Area of the Square : "+s1.area());

        System.out.println("Enter the base & height of Triangle");
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Triangle t1 = new Triangle(b,h);
        System.out.println("Area of the Triangle : "+t1.area());

        System.out.println("Enter the radius of circle : ");
        double r = sc.nextDouble();
        Circle c1 = new Circle(r);
        System.out.println("Area of the Circle : "+c1.area());


    }
}
