package chapter5;

public class MethodClass {
	
	public int add(int i1, int i2) {
		int result;
		result = i1 + i2;
		return result;
		
//		return i1 + i2;
	}
	
	public int getTentotal() {
		
		return 10*10;  // 1. 값을반환
	}
	
	
     public void prinTentotal() {
		int total = getTentotal();
		System.out.println(total);
	}
     
     public void printGreeting(String name) {
    	 System.out.println(name + "Hello...");
    	 return;  // 2. void 반환
     }
     
       public void divide(int num1, int num22) {
    	 if(num22 == 0) {
    		 System.out.println("0일수 없음...");
    		 return;  // 3. code break 의미
    	 } else {
    		 //....
    	 }
     }
     
       public void test(int num1, int num22) {
    	   for( int i = 0; i < 100; i++) {
    		   if(i == 0) {
    			   return;
    		   }
    	   }
       }

}
