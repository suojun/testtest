package self;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 =  2;
		Scanner sc = new Scanner(System.in);
		System.out.println("사칙연산 +,-,*,/를 입력해주세요.");
		char operator = sc.nextLine().charAt(0);
		
		switch(operator){
		
			case '+' :
				operator = '+';
				break;
			case '-' :
				operator = '-';
				break;
			case '*' :
				operator = '*';
				break;
			case '/' :
				operator = '/';
				break;
				
		}
		
		if(operator == '+')
		{
			System.out.println(num1 + num2);
		}
		else if(operator == '-')
		{
			System.out.println(num1 - num2);
		}
		else if(operator == '*')
		{
			System.out.println(num1 * num2);			
		}
		else  if(operator == '/')
		{
			System.out.println(num1 / num2);
		}
		else 
			System.out.println("사칙연산이 아닙니다.");

	}

}
