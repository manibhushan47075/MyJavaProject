package assignment2HA;
class Distance{
	int feet;
	int inches;
	
	Distance(int feet, int inches){
		this.feet = feet;
		this.inches = inches;
	}
	
	void displayDistance(){
		System.out.println("Distance : "+ feet + " feet "+ inches +" inches ");
	}
	
}
class Measurement extends Distance{
	double centimeters;
	
	Measurement(int feet,int inches,double centimeters){
		super(feet,inches);
		this.centimeters = centimeters;
	}
	
	void displayMeasurement(){
		super.displayDistance();
		System.out.println("and in centimeters is "+centimeters);
	}
}
public class HA4 {
	public static void main(String[] args) {
		Measurement m = new Measurement(3280,39370,100000);
		m.displayMeasurement();
		
	}
}
