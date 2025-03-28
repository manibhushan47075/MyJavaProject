package assignment2HA;
class Vehicle {
    String model;
    int year;

    Vehicle(String model , int year ) {
        this.model = model;
        this.year = year;
    }
}
class Car extends Vehicle {
    int carId;
    double price;

    Car( String model, int year, int carId, double price) {
        super(model,year);
        this.carId = carId;
        this.price = price;
    }

    void carDisplay() {
        System.out.println("Car Model : " + model);
        System.out.println("year : " + year);
        System.out.println("Car ID : " + carId);
        System.out.println("Price : " + price);

    }
}
public class VehicleDemoQ6 {
    public static void main(String[] args) {
        Car c = new Car("Volkswagen Virtus",2025,2201,1850000);
        c.carDisplay();

    }
}

