package Homework;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  intArray[] = new int[100];
		
		//배열의 갯수만큼 입력받기
		for(int i= 0; i < intArray.length; i++) {
			intArray[i] = sc.nextInt();
			//0입력 검증
			if(intArray[i] == 0	) {
				//배열바꾸기
				int Temp  =  0;
				//0을 제외한 배열의 갯수 저장 (출력을위함)
				int count = i-1;
				//상반된 위치에 있는배열을 바꿈
				for(int j=0; j<=((i-1)/2); j++) {
					Temp =  intArray[j];    //잠시 다른 변수에 첫번째 배열 저장
					intArray[j] = intArray[i-1]; //0을 제외한 마지막배열을 첫번째 배열로 이동
					intArray[i-1] = Temp;        // 잠시 저장했던 첫번째 배열을 마지막 배열로  이동
					i--;
				}
				//배열 정리가 끝낫으면 출력하고 종료하기
				for(int j=0; j <= count; j++) {
					System.out.println(j == count ? intArray[j]:intArray[j]+ " ");
				}
				break;
			}
		}
 
	}

}
