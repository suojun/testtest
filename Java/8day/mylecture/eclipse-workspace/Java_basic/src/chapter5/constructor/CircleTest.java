package chapter5.constructor;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir1 = new Circle("피자",10);
		Circle cir2 = new Circle("도넛",2);

		System.out.println( cir1.name + " :  " + cir1.getArea());
		System.out.println( cir2.name + " :  " + cir2.getArea());
	}

}
