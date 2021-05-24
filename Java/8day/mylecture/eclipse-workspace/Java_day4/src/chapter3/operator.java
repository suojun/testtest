package chapter3;

public class operator {

	public static void main(String[] args) {
		int gameScore = 150;
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);
		
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);
		
		
		System.out.println((5 >3) && (5 > 2));
		System.out.println((5 >3) || (5 > 2));
		System.out.println(!(5 >3));

	}

}
