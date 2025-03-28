package Manibhushan;

import java.util.Scanner;

class Student{
	int roll;
	String name;
	int DSA_Mark;
	
	void getdata() {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Roll : ");
		roll = sc.nextInt();
		System.out.print("Enter DSA_Mark : ");
		DSA_Mark = sc.nextInt();
	}
	void showdata() {
		System.out.println("Student Name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("DSA Mark : "+DSA_Mark);
	}
}

public class HA1 {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.getdata();
//		s1.showdata();
//		System.out.println();
//		
//		Student s2 = new Student();
//		s2.getdata();
//		s2.showdata();
//		System.out.println();
//		
//		Student s3 = new Student();
//		s3.getdata();
//		s3.showdata();
//		System.out.println();
//		
//		Student s4 = new Student();
//		s4.getdata();
//		s4.showdata();
//		System.out.println();
//		
//		Student s5 = new Student();
//		s5.getdata();
//		s5.showdata();
//		System.out.println();
//		
//		int a =s1.DSA_Mark;
//		int b =s2.DSA_Mark;
//		int c =s3.DSA_Mark;
//		int d =s4.DSA_Mark;
//		int e =s5.DSA_Mark;
//		
//		if(a>b && a>c && a>d && a>e) {
//			System.out.println("First Student Dsa mark is greater");
//		}
//		else if(b>c && b>d && b>e) {
//			System.out.println("Second Student Dsa mark is greater");
//		}
//		else if(c>d && c>e) {
//			System.out.println("Third Student Dsa mark is greater");
//		}
//		else if(d>e) {
//			System.out.println("Fourth Student Dsa mark is greater");
//		}
//		else {
//			System.out.println("Fifth Student Dsa mark is greater");
//		}
		
		Student [] arr = new Student[5]; //Step 1: Create an array of references (all null)
		for(int i=0;i<5;i++) {
			System.out.println("Enter details of "+(i+1)+" student : ");
			arr[i] = new Student();// Step 2: Create an object and assign it to the array index 
			                      // and arr is the name of student  **Without it  accessing arr[i] would 
			                      // result in a NullPointerException.
			arr[i].getdata(); // Step 3: Call methods on the object
		}
		
		int maxDSAmark = arr[0].DSA_Mark;
		for(int i=0;i<5;i++) {
			if(arr[i].DSA_Mark > maxDSAmark) {
				maxDSAmark = arr[i].DSA_Mark;
			}
		}
		
		for(int i=0;i<5;i++) {
			if(arr[i].DSA_Mark == maxDSAmark) {
				System.out.println("This Student has highest dsa mark :");
				arr[i].showdata();
			}
			
		}
		
	}
	
}

