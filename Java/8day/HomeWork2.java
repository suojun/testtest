package self;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하시오.");
		int n = sc.nextInt();
		int num  = 1;
		
		int[][] arr = new int[n][n];
		
		
		for(int i = 0; i<n; i++) {
			for(int j =0; j<n; j++) {
				arr[i][j]  = num;
				num =num+2;
				if(num  > 10)
					num = 1;
				
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
