package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '한';
		char ch2 = '\uD55C';
		char ch3 = '\uAE00';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3); 
		System.out.println("\\uAE00:" + ch3);

	}

}
