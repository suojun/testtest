package self;

import java.util.Scanner;

public class word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
       
		String[] petkor = {"곰돌이","복돌이","흰둥이","깨소금","까만콩"};
		String[] peteng = {"Bear","Gift","White","Sesami","black"};
		
		System.out.println("강아지 이름을 입력해주세요");
		String  str  = sc.nextLine();
		
		
		for(int i =0; i<5; i++) {
			
				if(str.equals(petkor[i])) {
					System.out.println("> "+peteng[i]);
					
				}
				else {
					System.out.println("오류");
					
				}
			
		}
		

	}

}
