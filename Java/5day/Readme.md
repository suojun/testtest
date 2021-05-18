## 나혼자 코딩작성

1번문제

package study;

public class Self {

	public static void main(String[] args) {
		int score = 23;
		char grade;
		
		if(score >= 90) {
			
			System.out.println("A");
			
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

	}

}


2번문제

package study;

public class self2 {

	public static void main(String[] args) {
		String floor = "3F";
		
		switch(floor) {
		case "1F" :
			System.out.println("1층 약국입니다.");
			break;
		
		
	    case "2F" :
		System.out.println("2층 정형외과입니다.");
		break;
		
	    case "3F" :
			System.out.println("3층 피부과입니다.");
			break;
		
	    case "4F" :
			System.out.println("4층 치과입니다.");
			break;	
		
		default:
			System.out.println("5층 헬스클럽입니다.");
	}





	}

}

