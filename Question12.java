package Manibhushan;

class Person{
	String name;
	int age;
	
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
}
class Employee extends Person{
	int Eid;
	double salary;
	Employee(String name, int age, int Eid, double salary){
		super(name,age);
		this.Eid = Eid;
		this.salary = salary;
	}
	void  empDisplay() {
		System.out.println("Employee name : "+name);
		System.out.println("Employee age : "+age);
		System.out.println("Employee eid : "+Eid);
		System.out.println("Employee salary : "+salary);
	}
}

public class HA2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Mani",20,5001,125000);
		e1.empDisplay();
		System.out.println();
		
		Employee e2 = new Employee("Manav",22,3001,50000);
		e2.empDisplay();
		

	}
}
