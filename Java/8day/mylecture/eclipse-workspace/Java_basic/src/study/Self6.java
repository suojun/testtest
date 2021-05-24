package study;

import java.util.Scanner;

public class Self6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수를 입력하세요");
		
		int n = sc.nextInt();
		int oddNum = 0;
		int oddSum = 0;
		
		for(int i = 1; i <= n; i +=2) {
			oddSum += i;
			oddNum++;
			if(oddSum >= n) {
				System.out.println("더해진 홀수 개수: " + oddNum);
				System.out.println("더해진 홀수 합: " + oddSum);
				break;
			}
		}

	}

}
