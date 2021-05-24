package chapter4;

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int dan;
		
		System.out.println(" 단을 입력하세요.");
		dan = sc.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + "=" + i * dan);
			
		}
		
	}

}
