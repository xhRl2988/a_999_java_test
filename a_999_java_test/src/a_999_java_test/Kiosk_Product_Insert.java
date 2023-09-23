package a_999_java_test;

import java.util.*;

class Product{
	private int 	pdt_id; 			//상품코드 PK
	private String 	pdt_id_name; 			//상품이름
	private int 	pdt_unit_price; 	//단가
	private int 	pdt_order_method; 	//1단품 2세트 3추가
	public 	int 	cnt;
	
	public int getPdt_id() {
		return pdt_id;
	}
	public void setPdt_id(int pdt_id) {
		this.pdt_id = pdt_id;
	}
	
	public String getPdt_id_name() {
		return pdt_id_name;
	}
	public void setPdt_id_name(String pdt_id_name) {
		this.pdt_id_name = pdt_id_name;
	}
	
	public int getPdt_unit_price() {
		return pdt_unit_price;
	}
	public void setPdt_unit_price(int pdt_unit_price) {
		this.pdt_unit_price = pdt_unit_price;
	}
	
	public int getPdt_order_method() {
		return pdt_order_method;
	}
	public void setPdt_order_method(int pdt_order_method) {
		this.pdt_order_method = pdt_order_method;
	} 
	
	void printScore() {
		System.out.printf("%3d %5d %5d %4d %5s \n",
				cnt, pdt_id, pdt_unit_price, pdt_order_method, pdt_id_name);
	}
}

public class Kiosk_Product_Insert {
	public static void main(String[] args) {
		String buffer;
		Scanner input = new Scanner(System.in);
		
		System.out.print("상품코드 입력은 몇 건 입니까: ");
		int num = input.nextInt();
		Product p[] = new Product[num];
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Product();
			
			buffer = input.nextLine();
			System.out.print("상품명을 입력하세요 : ");
			p[i].setPdt_id_name(input.nextLine());
			System.out.print("상품코드를 입력하세요 : ");
			p[i].setPdt_id(input.nextInt());
			System.out.print("삼품단가를 입력하세요 : ");
			p[i].setPdt_unit_price(input.nextInt());
			System.out.print("주문방법을 입력하세요 : ");
			p[i].setPdt_order_method(input.nextInt());
		}
		
	}
}
