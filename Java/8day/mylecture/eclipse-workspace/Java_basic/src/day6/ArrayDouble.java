package day6;

import java.util.Arrays;

public class ArrayDouble {

	public static void main(String[] args) {
		
		String[] strArray = new  String[] {				
						"1", "2", "3", "4", "5",
						"6", "7", "8", "9", "10"
			
		};
		System.out.println(strArray.toString());
		System.out.println(strArray);		
	
		
		for(int i=0;  i < strArray.length; i++) {
			int t =  i *  Integer.parseInt(strArray[i]);
			strArray[i] = t + "";
			System.out.print(strArray[i]);
		}
		System.out.println("");
		
		strArray[5] = "Hello";
		Arrays.toString(strArray);
		System.out.println(Arrays.toString(strArray) );
	}

}
