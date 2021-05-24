package ex.java.input;

import java.util.Scanner;

public class fwe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1: ");
		String num1 = sc.nextLine();
		System.out.println("정수2: ");
		String num2 = sc.nextLine();
		System.out.println("정수3: ");
		String  num3 = sc.nextLine();
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int c = Integer.parseInt(num3);
		
		System.out.println("sum : " + (a + b +c) );
		System.out.println("avg : " + (a + b+ c)/3);
		

	}

}
