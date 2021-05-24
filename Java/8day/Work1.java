package self;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("자연수 3~10을 입력해주세요.");
		int n = sc.nextInt();
		
		char alpha = 'A';
		
		for(int i =  n; i >0; i--) {
			//자연수 범위 검증
			if(n<3 || n >10) {
				System.out.println("입력한 자연수는 범위를 벗러났습니다.");
				break;
			}
			//알파벳 피라미드
			//입력받은 자연수 n만큼 반복.
			for(int j = i; j >= 1; j--) {
				System.out.println(alpha);
				alpha++;
				//Z를 넘어가면 다시A로
				if(alpha == 'Z'+1) alpha = 'A';
			}
			System.out.println();
		}

	}

}
