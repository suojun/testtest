package Homework;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		// n(3 <= n <=10) 입력받아 영문자 삼각형 출력
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		char c  ='A';
		
		if(n < 3 || n > 10) {
			System.out.println("숫자 오류");
			return;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j< n-i; j++) {
				if(c == 91)
					c =  'A';
				System.out.println(c);
				c++;
			}
			System.out.println();
		}

	}

}
