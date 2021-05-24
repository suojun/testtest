package self;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		
		int mathSum = 0;
		int sciSum = 0;
		int engSum = 0;
		int avg = 0;
		int cnt = 0;
		
		Student22 students[] = new Student22[10];
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("학생 성적 입력 (이름/학년/주소/수학/과학/영어)");
			String result = sc.nextLine();
			
			if(result.equals("/sum")) {
				System.out.println("수학: "+ mathSum + "/" + mathSum /  cnt);
				System.out.println("과학: "+ sciSum + "/" + sciSum /  cnt);
				System.out.println("영어: "+ engSum + "/" + engSum /  cnt);
				break;
				
				
			}
			
			name [i] = result;
			String[] data = name[i].split("/");
			students[i] = new Student22();
			students[i].studentName = data[0];
			students[i].grade = Integer.parseInt(data[1]);
			students[i].address = data[2];
			
			students[i].subj =  new Score[3];
			for(int j = 0; j<3; j++) {
				students[i].subj[j] = new Score();
				students[i].subj[j].subject = data[3+j];
				students[i].subj[j].score = Integer.parseInt(data[3+j]);
			}
			
			System.out.println(i+1+"/10");
			mathSum += Integer.parseInt(data[3]);
			sciSum += Integer.parseInt(data[4]);
			engSum += Integer.parseInt(data[5]);
			
			System.out.println();
			cnt++;
		}

	}

}
