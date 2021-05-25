package chapter5;

import chapter5.info.person;

public class Chaper5Main {

	public static void main(String[] args) {
		Student st = new Student(); // chapter5
		 //chapter5.Student st2;
		
		 
		person p = new person();
		
		// . operator
		st.studentId = 1000;
		st.studentName = "홍길동";

		// 사용
		System.out.println(st.studentName);
		
		// 1. 반환형식 있다.
		String info = st.showStudentInfo();
		System.out.println(info);
		
		System.out.println(st.showStudentInfo());
		
		// 2. 반환형식 없다.
		st.println();
		
		// 3. 매개변수
		info = st.setScore(1000);
		System.out.println(info);
		
		st.setScore2(1000);
		System.out.println(st.showStudentInfo());

		// 다른패키지.
		chapter8.Student st3 = new chapter8.Student(); 
		
		
		
		
		
		
	}

}
