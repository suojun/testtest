package chapter5;

public class Order {
	long number;
	String ID;
	String day;
	String name;
	String ordernumber;
	String address;
	
	public void print() {
		
		System.out.println("주문번호 :" + number);
		System.out.println("주문자 아이디 :" + ID);
		System.out.println("주문 날짜 :" + day);
		System.out.println("주문자 이름 :" + name);
		System.out.println("주문 상품 번호 :" + ordernumber);
		System.out.println("배송주소 :" + address);
	}

}
