package chapter4;

public class IfExam {

	public static void main(String[] args) {
		
		int age = 10;
		//조건1
		if(age >= 8) 
		{
		    System.out.println("8살 이상이네요.");
		}
		else {
			System.out.println("8살 이하");
		}
		
		// 복합조건;
		int age2 = 10;
		// age1 8살 이상이고 10보다 큰거
		if((age >=8) && (age2 > 10)) {
			System.out.println("8살 이상이네요.");
		}
		else {
			System.out.println("8살 이하");
		}
		
		
		
	}

}
