package String;

import java.util.Scanner;

public class dqwdqw {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int num =  sc.nextInt();
		int i=  2;
		
		boolean isPrime = true;
		
		while (i <=  num) {
			isPrime = true;
			for (int n =  2; n < i; n++) {
				if(i % n == 0) {
					isPrime = false;
					
				}
				continue;
			}
			if (isPrime == true) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("");

	}

}
