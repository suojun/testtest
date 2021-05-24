package chapter3;

import java.util.Scanner;

public class fwe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		String str = scanner.nextLine(); 
		
		
		int num = Integer.parseInt(str);
		
		if(num > 0) {
			System.out.println("양수");
			
		}
		else if (num < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0입니다.");
		}


	}

}
