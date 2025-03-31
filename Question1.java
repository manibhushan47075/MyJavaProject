package ManiBhushan;
import java.util.Scanner;
class Car{
    String model;
    int year;

    void setDetails(String s,int x){
        model = s;
        year = x;
    }
    void displayDetails(){
        System.out.println("Model of the Car : "+model+" , Year : "+year);
    }
}
class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Car c1 = new Car();
        c1.model = "Toyota";
        c1.year = 2020;

        Car c2 = new Car();
        System.out.println("Enter model of car 2");
        String str = sc.nextLine();
        System.out.println("Enter the Year of car 2");
        int yr = sc.nextInt();

        // c2.model=str;
        // c2.year=yr;
        c2.setDetails(str, yr);

        c1.displayDetails();
        c2.displayDetails();

        if(c1.year>c2.year){
            System.out.println("First car is newer");
        }
        else if (c1.year==c2.year){
            System.out.println("Both have same year");
        }
        else{
            System.out.println("Second car is newer");
        }
    }
}

