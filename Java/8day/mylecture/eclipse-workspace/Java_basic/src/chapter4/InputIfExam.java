package chapter4;

import java.util.Scanner;

public class InputIfExam {

	public static void main(String[] args) {
		
		
		//실습
		// 숫자가 0, 부호 -가 아니면 숫자를추력
		//0,부호-면 경고 메시지 "양수를입력하세요!" 출력
		// 종료
		
		// Scanner, if statement 사용
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("숫자를 입력하세요:");
		 String str = scanner.nextLine();
		 
		 int num = Integer.parseInt(str);

		if(num > 0) {
			System.out.println(num);
		}
		else {
			System.out.println("안녕~");
		}

	}

}






         
















