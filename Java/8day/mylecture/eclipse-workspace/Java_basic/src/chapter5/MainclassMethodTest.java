package chapter5;

public class MainclassMethodTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
	}
	
	
	// 매개변수에 인수 2개를 받아서 계산결과를 반환
	public static int add(int i1, int i2) {
		int result = i1 + i2;
		return result;
	}

}
