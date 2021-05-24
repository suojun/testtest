package ex.java.input;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		String num = sc.nextLine();
		
		int a = Integer.parseInt(num);
		
		if( 0  == -a) {
			System.out.println("안녕~");
			
		}
		else {
			System.out.println("값을 입력하세요.");
		}
		
}
}
