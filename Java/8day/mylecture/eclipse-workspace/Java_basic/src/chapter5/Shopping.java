package chapter5;

public class Shopping {

	public static void main(String[] args) {
		Order one = new Order();
	
		one.number = 201803120001L;
		one.ID = "abc123";
		one.day = "2018년 3월 12일";
		one.name = "홍길순";
		one.ordernumber = "PD0345-12";
		one.address = "서울시 영등포구 여의도동 20번지";
		
		
		one.print();
		

	}

}
