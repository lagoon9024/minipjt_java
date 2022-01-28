package com.woori.edu;
/*
 * 필드와 Local 변수가 구분되는 기준은 선언된 위치
 * 필드변수와 static변수의 차이점.....
 * 필드변수 | static변수
 * 		   
 * 필드 :: 클래스 바로 아래, 즉 메소드 영역 외부
 * 		--> 기본 값을 가진다
 * 		--> Heap(객체 생성시 Heap영역에 함께 올라간다)
 * 
 * Local Value :: 메소드 블럭 안에서 선언
 * 		--> 기본값을 가지지 않는다. 사용 전 반드시 초기화 작업이 선행되어야 한다.(컴파일 에러 발생)
 * 		--> Stack에 잡힌다.
 * 
*/
public class Shirt {
	// 필드
	public float price;
	public String brandName;
	public boolean longSleeved;
	public char color;
	public int size;
	
	// Default constructor...
	/*
	 * 인자값 없고, { 구현부 안에서 nothing working
	 * 생성자 앞의 Access Modifier는 클래스를 따라간다.
	 */
	
	public Shirt() {}
	public Shirt(float price, String brandName, boolean longSleeved, char color, int size) {
		this.price = price;
		this.brandName = brandName;
		this.longSleeved = longSleeved;
		this.color = color;
		this.size = size;
	}
	
	public void setShirtInfo(float price, String brandName, boolean longSleeved, char color, int size) {
		this.price = price;
		this.brandName = brandName;
		this.longSleeved = longSleeved;
		this.color = color;
		this.size = size;
	}
	
	public String getShirtInfo() {
		return price + ", " + brandName;
	}
	
	public void changeSize() {
		//Local Value, Temporary Value, Automatically Value
		int bigSize = 200;
		this.size = bigSize;
	}
}
