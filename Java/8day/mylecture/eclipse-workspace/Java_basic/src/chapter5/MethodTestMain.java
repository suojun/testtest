package chapter5;

public class MethodTestMain {

	//멤버 변수/필드/속성...
	String name;
	
	// 멤버 메소드 들...
	public static void main(String[] args) {
		
		MethodClass m = new MethodClass();
		
		MethodClass m1;
		m1 = new MethodClass();
		
		int r = m.add(10, 100);
		m.add(10, 100);
//		
		m.prinTentotal();
//		
//		m.getTentotal();
//		
		m.printGreeting("hahaha");
//		
		m.divide(100, 1);
//		
		m.divide(100, 0);
		
				
				

	}

}
