package String;

import java.util.Scanner;

public class feww {

	public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
		
		while(true) {
		int count=0;
		System.out.println(" 수 입력 하세요 ");
		int num = scan.nextInt();
		
		if(num < 1) {
			System.out.println("다시 입력하세요:");
			continue;
		}
		
		for(int i = 1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			
			
		}
	
		
		if(count == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수아닙니다.");
		}
		
		
	
		}
		


	}

}
