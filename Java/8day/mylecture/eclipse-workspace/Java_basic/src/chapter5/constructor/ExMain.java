package chapter5.constructor;

public class ExMain {

	public static void main(String[] args) {
		Rectangle2 rect1 = new Rectangle2("사각", 20, 15);
		Rectangle2 rect2 = new Rectangle2("직사각", 19, 80);
		
		System.out.println( rect1.name + " :  " + rect1.getArea());
		System.out.println( rect2.name + " :  " + rect2.getArea());

	}

}
