package chapter7;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 숫자를 100개를 담는 배열
		int[] array = new int[100];
		int array1[] = new int[100];
		
		/*int[] array2;
		
		while(true) {
			array2 = new int[100];
			for(int i =0; i < 100; i++) {
				
			}
		}*/
		
		// 학생 이름, 학번, 위치 정보르 100개 담음 자료를 선언
		// 예1) "홍길동, 1020, 구로구" --> "홍길동 - 1020 - 구로구"
		//     "," "-" : 구분자 Deilmeter , 븐리자 Seperator
		
		String[] info = new String[100];
		info[0] = "홍길동, 1020, 구로구";
		info[1] = "홍수달, 1021, 부산 기장구";
		//info[2] = "홍수달 - 1021 - 부산 기장구";
		
		for(int i =0; i < info.length; i++) {
			String person = info[i];
			String[] data = person.split(",");
			System.out.println("이름: " + data[0] 
					+ "학번: "+data[1] 
					+ "위치: "+ data[2]);
		}
		
		
		
		
		//예2)
		//이름: "홍길동"
		//학번: 1020
		//위치: 구로구
		
		String[] name = new String[100];
		String[] number = new String[100];
		String[] house = new String[100];
		name[0] = "홍길동"; number[0] = "1020"; house[0] = "시흥시";
		//name[1] = "이순신"; number[1] = "1030"; 
		
		for(int i =0; i < house.length; i++) {
			System.out.println("이름: " + name[i] 
					+ "학번: "+number[i] 
					+ "위치: "+ house[i]);
			
			
		}
		
		//
		String[] info2 = new String[] {"",""};

	}

}
