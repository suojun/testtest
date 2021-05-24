package ex.java.input;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		int want  = 0;
		int number[] = null;		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 합을 구하고 싶으세요?:");
		want = sc.nextInt();
		
		number = new int[want];
		for(int i=1; i <= number.length; i++) {
			System.out.println((i)+ "번째수=");
			number[i] = sc.nextInt();
		}
		


	}

}
