package chapter4;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int dan;
		
		System.out.println(" 단을 입력하세요.");
		dan = sc.nextInt();
		while(i <10) { 
			
			System.out.println(dan + " * " + i + "=" + i * dan);
			i++;
		}
		
		
		

	}

}
