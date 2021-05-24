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
			break;
	}





	}

}
