package ex.java.input;

import java.util.Scanner;

public class WhileFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dan;
		
		while(true) {
			System.out.println("단을 입력해주세요.");
			dan = sc.nextInt();
			if( dan == -9) {
				System.out.println("~끝~");
				break;
				
			}
			for(int i= 0; i < 10; i++) {
				System.out.println( dan + "*" + i + "=" + i*dan
						);
			}
			dan= 0;
		}
	}

}
