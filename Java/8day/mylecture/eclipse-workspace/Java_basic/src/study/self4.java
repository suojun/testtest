package study;

import java.util.Scanner;

public class self4 {

	public static void main(String[] args) {
		Scanner sc =   new Scanner(System.in);
			
		
		while(true) {
		System.out.println("몸무게를 입력하세요.");
		
		String str1 = sc.nextLine();
		
		System.out.println("키를 입력하세요.");
		
		String str2 = sc.nextLine();
		
		int weight = Integer.parseInt(str1);
		int  height = Integer.parseInt(str2);
		
		int value = (weight + 100 - height );
		

		if(value > 0) {
			System.out.println("비만수치 : 비만");
		}
		else if( value < 0) {
			   System.out.println("정상");
			   
		   } 
	
			}
			}

	 
	}


