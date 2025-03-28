package ManiBhushan;

class Deposit {
    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    Deposit(){
        Principal=0;
        Time = 0;
        Rate = 0;
        Total_amt = 0;
    }

    Deposit(long Principal , int Time , double Rate){
        this.Principal = Principal;
        this.Time = Time ;
        this.Rate = Rate;
        calc_amt();
    }

    Deposit(long Principal, int Time){
        this.Principal = Principal;
        this.Time = Time;
        calc_amt();
    }

    Deposit(long Principal, double Rate){
        this.Principal = Principal;
        this.Rate = Rate;
        calc_amt();
    }

    void display(){
        System.out.println("Principal: " + Principal);
        System.out.println("Time: " + Time);
        System.out.println("Rate: " + Rate);
        System.out.println("Total Amount :"+ Total_amt);
    }

    public void calc_amt(){
        Total_amt = Principal+(Principal*Rate*Time)/100;
    }
}
public class DepositDemo {
    public static void main(String[] args) {
        Deposit d1 = new Deposit();
        d1.display();
        System.out.println();
        Deposit d2 = new Deposit(12000, 12, 9.8);
        d2.display();
        System.out.println();
        Deposit d3 = new Deposit(12000, 12);
        d3.display();
        System.out.println();
        Deposit d4 = new Deposit(12000, 13.5);
        d4.display();
    }
}
