package self;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int heg = 0;
		int weh = 0;
		String exit = null;
		
		while(true)
		{
			System.out.println("키를 입력해주세요.");
			heg = sc.nextInt();
			System.out.println("몸무게를 입력해주세요.");
			weh = sc.nextInt();
			int pig = weh+100-heg;
			
			if(pig > 0)
			{
				System.out.println("비만수치 비만 입니다.");
				continue;
			}
			else
				System.out.println("비만이 아닙니다.");
			
			System.out.println("종료하시겠습니까?");
			exit = sc.next();
			if(exit.equals("q"))
				break;
					
		}
		



	}
	}


