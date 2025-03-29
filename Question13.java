package assignment2HA;
import java.util.Scanner;

class Bank{
	String bankName;
	double depositAmount;
	static double totalAmount = 0;
	
	void setBankName() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter bank name : ");
		bankName = sc.nextLine();
		
	}
	void setAmount() {
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter the amount to be deposited : ");
			depositAmount = sc.nextDouble();
			if (depositAmount < 1000) {
		        System.out.println("Amount must be at least 1000. Deposit not accepted.");
		        depositAmount = 0; // Resetting depositAmount bcoz it's invalid
		    } else {
		        totalAmount += depositAmount;
		    }
	}
	void showData() {
		System.out.println("Bank name : "+bankName);
		System.out.println("Deposited amount : "+depositAmount);
	}
	
}

public class HA3 {
	public static void main(String[] args) {
		
		Bank [] bank = new Bank[5]; //Step 1: Create an array of references (all null)
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Detail of "+(i+1)+" Bank :- ");
			bank[i] = new Bank(); // Step 2: Create an object and assign it to the array index
			bank[i].setBankName(); // Step 3: Call methods on the object
			bank[i].setAmount();
		}
		
		System.out.println("\nBank Details :- ");
		for(int i=0;i<5;i++) {
			bank[i].showData();
			System.out.println();
		}
		System.out.println("Total Amount Deposited : "+ Bank.totalAmount);
		
		double minAmount = bank[0].depositAmount;
		String minBank = bank[0].bankName;
		for(int i=1 ; i<5 ; i++) {
			if(bank[i].depositAmount < minAmount) {
				minAmount = bank[i].depositAmount;
				minBank = bank[i].bankName;
			}
		}
		
		System.out.println("Minimum Deposit Details :- \nBank Name : "+minBank+"\nDeposited : "+minAmount);
		

	}

}
