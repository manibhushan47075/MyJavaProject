package ManiBhushan;
import java.util.Scanner;

class Complex {
    double imag;
    double real;

    void setData(double r , double i){
        this.imag = i;
        this.real = r;
    }
    void display (){
        System.out.println(real + "\t" + imag);
    }
    public Complex add(Complex c1,Complex c2){
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        System.out.println("Enter real and imaginary num of first complex");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        c1.setData(real1 , imag1);

        Complex c2 = new Complex();
        System.out.println("Enter real & imaginary num of second complex");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        c2.setData(real2 , imag2);

        Complex c3 = new Complex();
        c3 = c3.add(c1 , c2);

        System.out.println("First Complex num");
        c1.display();
        System.out.println("Second Complex num");
        c2.display();
        System.out.println("Third Complex num");
        c3.display();
    }
}















