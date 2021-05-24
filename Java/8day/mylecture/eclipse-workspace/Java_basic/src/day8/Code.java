package day8;

import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String word = sc.nextLine();
		
		String[] morse  = {
				".-", "-...","-.-.","-..",".",
				"..-.","--.","....","..",".---"
				,"-.-",".-..","--","-.","---"
				,".--.","--.-",".-.","...","-"
				,"..-","...-",".--","-..-"
				,"-.--","--..", "  "
		};
		String result =" ";
		
		for(int i  =0; i<word.length();  i++) {
			result += morse[word.charAt(i)-'A'];
		}
		
		System.out.println(result);
		

	}

}
