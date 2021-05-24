package chapter3;

public class Bitoperation {

	public static void main(String[] args) {
		int num1 = 5;  //0101
		int num2 = 10; //1010
		
		int result = num1 & num2; //0000 
		
		System.out.println("num1 & num2= " + result);;
		
		result = num1 | num2; //1111 하나라도 1이면 결과값이 1
		System.out.println("num1 | num2= " + result);;
		
		result = num1 ^ num2;  //1111 같은값이면 0, 다른값이면 1
		System.out.println("num1 ^ num2= " + result);;
		
		
		result = ~num1;       // 0은 1로, 1은 0으로
		System.out.println("~num1= " + result);;
		
		// 논리 연산자와 비트 논리 연산자 차이
		boolean t = (num1 >= num2) && (num1 <= num2);
		
		// t = (num1 & num2) && (num1 ^ num2); 오류
		
		t= (5 > 10) & (10< 20); //false & true : 비트연산
		System.out.println(t);
		
		t= (5 < 10) & (10< 20); //false & true : 비트연산
		System.out.println(t);
		
		
		
		
		/** Shift operator
		 *  bit wise operation
		 *   - left, right, 채움
		 */
		
		int n1 = 5;
		int n2 = -5;
		
		System.out.println("5 << 2 =" + (n1 << 2)); //00010100 
		System.out.println("5 << 3 =" + (n1 << 3)); //00101000
		
		System.out.println("5 >> 1 =" + (n1 >> 1)); //00000010
		System.out.println("5 >> 2 =" + (n1 >> 2)); //00000001
		System.out.println("5 >> 3 =" + (n1 >> 3)); //00000000
		
		
		
		System.out.println("-5 << 2 =" + (n2 << 2)); 
		System.out.println("-5 << 3 =" + (n2 << 3));
		
		System.out.println("-5 >> 1 =" + (n2 >> 1));
		System.out.println("-5 >> 2 =" + (n2 >> 2));
		System.out.println("-5 >> 3 =" + (n2 >> 3));
		
		System.out.println("5 >>> 1 =" + (n1 >> 1)); 
		System.out.println("5 >>> 2 =" + (n1 >> 2)); 
		System.out.println("5 >>> 3 =" + (n1 >> 3)); 
		
		System.out.println("-5 >>> 1 =" + (n2 >> 1)); 
		System.out.println("-5 >>> 2 =" + (n2 >> 2)); 
		System.out.println("-5 >>> 3 =" + (n2 >> 3));
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
