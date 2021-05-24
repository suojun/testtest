package Homework;

import java.util.Scanner;

public class Work3 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아 숫자 삼각형 출력
		//숫자사이공백으로 구분
		Scanner sc = new Scanner(System.in);
		
		int n  =sc.nextInt();
		
		for(int  i = 0; i < n; i++) {
			int printNum=  1;
			
		for(int z = n-1-i; z>0; z--) {
			System.out.println("  ");
		}	
		for(int j = 0; j < i+ 1;j++) {
			System.out.println(printNum +  " ");
			printNum++;
		}
		System.out.println();
		}

	}

}
