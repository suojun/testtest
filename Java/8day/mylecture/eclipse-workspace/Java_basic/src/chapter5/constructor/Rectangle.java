package chapter5.constructor;

public class Rectangle {

	String name;
	float width;
	float height;
	
	
	
	public Rectangle() {

		height = 0;
		width = 0;
		
		System.out.println("Rectangle 생성자 :"+ name +
	                          "   w: " + width + "       h:" + height);
		
	
	}
	
	public Rectangle (String n) {
		name = n;
		System.out.println("Rectangle 생성자 :"+ name +
                "   w: " + width + "       h:" + height);
	}
	public Rectangle (String n, float w, float h) {
		name = n;
		width = w;
		height = h;
		System.out.println("Rectangle 생성자 :" + name +
                "   w: " + width + "       h:" + height);
		
	}




	
	}
	


