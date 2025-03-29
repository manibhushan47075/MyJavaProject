package assignment2HA;

class PointType{
	double x;
	double y;
	
	//Parameterized constructor for setting circle center (x,y)
	PointType(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	//Default Constructor for center (0,0)
	PointType(){
		x = 0;
		y = 0;
	}
	
	/*The setPoint(double x, double y) method allows you
    to change the coordinates of a PointType object after
    it has been created.
    You want to update an existing point's position 
    without creating a new object.
    
    PointType p = new PointType(1, 2);
    p.printPoint();  // Output: Point: (1, 2)
    p.setPoint(5, 6);
    p.printPoint();  // Output: Point: (5, 6)
    */
	
//	void setPoint(double x, double y) {
//	    this.x = x;
//	    this.y = y;
//	}
	
	 public void printPoint() {
	        System.out.println("Point: (" + x + ", " + y + ")");
	    }
}

class CircleType extends PointType{
	double radius;

	CircleType() {
	     super();
	     this.radius = 0;
	 }
	
	CircleType(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }
	
	double calculateArea() {
	     return Math.PI * radius * radius;	
    }
	
	double calculateCircumference() {
	     return 2 * Math.PI * radius;
	}
	
	void displayCircle() {
	     System.out.println("Circle Details :- ");
	     printPoint();
	     System.out.println("Radius: " + radius);
	     System.out.println("Area: " + calculateArea());
	     System.out.println("Circumference: " + calculateCircumference());
	}
	
}

public class HA5 {
	public static void main(String[] args) {
		
		CircleType c1 = new CircleType(2,3,5);
		c1.displayCircle();
		System.out.println();
		
//		Testing the setPoint method (it outputs the same as before because it
//		only change the center, not radius
//		c1.setPoint(3,3);
//		c1.displayCircle();
		
		CircleType c2 = new CircleType();
		c2.displayCircle();
		
	}
}
