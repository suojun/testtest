package chapter5.constructor;

public class CircleTest {

	public static void main(String[] args) {
		Circle cir1 = new Circle("νΌμ",10);
		Circle cir2 = new Circle("λλ",2);

		System.out.println( cir1.name + " :  " + cir1.getArea());
		System.out.println( cir2.name + " :  " + cir2.getArea());
	}

}
