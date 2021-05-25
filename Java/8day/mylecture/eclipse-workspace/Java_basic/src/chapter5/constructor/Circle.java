package chapter5.constructor;

public class Circle {

	String name;
	double radius;
	
	public Circle (String n, double r) {
		name = n;
		radius = r;
		System.out.println( name +
                "   r: "+ radius );
	}
	public double getArea() {
		double result = 3.14*radius*radius;
		return result;
	}
}
