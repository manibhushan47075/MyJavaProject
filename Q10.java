package assignment2;
import java.util.Scanner;

class Student{
	String name;
	int roll;
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter Student Name: ");
	     name = sc.nextLine();
	     System.out.print("Enter Roll Number: ");
	     roll = sc.nextInt();
	}
	void showDetails(){
		System.out.println("Student Name: " + name);
	     System.out.println("Roll Number: " + roll);
	}	
}

class Test extends Student{
	int mark1 , mark2 ;
	
	void inputDetails() {
		Scanner sc = new Scanner(System.in);
		super.inputDetails();
	     System.out.print("Enter Mark 1: ");
	     mark1 = sc.nextInt();
	     System.out.print("Enter Mark 2: ");
	     mark2 = sc.nextInt();
	}
	void showDetails(){
		super.showDetails();
		System.out.println("Mark 1: " + mark1);
	    System.out.println("Mark 2: " + mark2);
	}
}

interface Sports{
	int score1 = 20;
	int score2 = 23;
}

public class Q10 extends Test implements Sports{
	public static void main(String[] args) {
		Test s = new Test();
		s.inputDetails();
		
		int tm = s.mark1+s.mark2; //tm = total marks
		int ts = score1 + score2; //ts = total score
		int gt = tm + ts; // gt = grand total
		
		s.showDetails();
		System.out.println("Total Marks : "+tm);
		System.out.println("Total Score : "+ts);
		System.out.println("Grand Total Marks : "+gt);
		
	}
}
