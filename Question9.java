package ManiBhushan;
class Employee{
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name,salary);
        this.department = department;
    }

    void displayManagerDetails(){
        super.displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Mani Bhushan", 125000, "Income Tax Department");
        m.displayManagerDetails();
    }
}
