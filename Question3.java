package ManiBhushan;
class Book{
    int bookId;
    double price;
    int quantity;
    static double totalAmount ;

    Book(int bookId, double price, int quantity){
        this.bookId=bookId;
        this.price=price;
        this.quantity=quantity;
    }
    void displayDetails(){
        System.out.println("Book ID : "+ bookId);
        System.out.println("Price : "+ price);
        System.out.println("Quantity : "+ quantity);
        System.out.println();
    }
    public double Calculate(double price, double quantity){
        totalAmount += price*quantity;
        return totalAmount;
    }
}
public class Main {
    public static void main(String[] args) {
        double totalCost;
        Book b1 = new Book(1001 , 150 , 2);
        b1.displayDetails();
        totalCost = b1.Calculate(150 , 2);

        Book b2 = new Book(1002 , 250 , 3);
        b2.displayDetails();
        totalCost = b1.Calculate(250 , 3);

        Book b3 = new Book(1003 , 50 , 4);
        b3.displayDetails();
        totalCost = b1.Calculate(50 , 4);

        Book b4 = new Book(1004 , 100 , 2);
        b4.displayDetails();
        totalCost = b1.Calculate(100 , 2);

        Book b5 = new Book(1005 , 500 , 1);
        b5.displayDetails();
        totalCost = b1.Calculate(500 , 1);
        System.out.println("The total Amount is "+ totalCost);
    }
}

