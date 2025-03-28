package ManiBhushan;

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable , Swimmable {
     private String name;
     //By keeping name private, we ensure it can only
    // be set via the constructor or a controlled setter method.
    //Agar private nhi likhnge toh, main class se koi bhi change kr skta hai
    //Uska name like...  d.name = "Mango";
    //Concept of Encapsulation

    public void fly() {
        System.out.println(name + " not flying");
    }

    public void swim(){
        System.out.println(name + " is swimming");
    }

    Duck(String name){
        this.name = name;
    }
    void displayDetails(){
        System.out.println("Duck Name: " + name);
        fly();
        swim();
    }
}
public class DuckDemo {
    public static void main(String[] args) {
        Duck d = new Duck("Tom");
        d.displayDetails();

    }
}
