package study;

import java.util.Scanner;

public class self5 {

	public static void main(String[] args) {
		
		while(true) {
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("몸무게를 입력하세요.");
		int weight = sc.nextInt();

		System.out.println("키를 입력하세요.");
		int height = sc.nextInt();
		
		int value = weight +  100 - height;
		
		String results = (value > 0) ? "비만" : "정상";
		
		System.out.println("비만 : " + results);
		
		System.out.println("o 입력시 종료");
		String restart = sc.nextLine();
		
		if (restart == "o") {
			break;
		}
		}
		

	}

}
