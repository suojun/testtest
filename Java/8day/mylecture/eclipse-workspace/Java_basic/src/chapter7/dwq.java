package chapter7;

import java.util.Scanner;

public class dwq {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] student = new String[5];
		int math = 0;
		int sci = 0;
		
		int find_id = -1;
				
		for(int i = 0; i < student.length; i++) {
			System.out.println("이름/과학/수학 점수를 입력해주세요.");
			student[i] = sc.next();
			String person = student[i];
			String[] data = person.split("/");
			
			/*if(data[0].contains("홍")) {
				find_id = i;
				break;
			}  */
						
			math += Integer.parseInt(data[1]);
			
			sci += Integer.parseInt(data[2]);			
		
		}
		System.out.println("---------");
		System.out.println("과학 :" + sci + "/" + sci / student.length);
		System.out.println("수학 :" + math + "/" + math / student.length);

		
		
		

	}

}
