package com.woori.edu;
/*
 * �ʵ�� Local ������ ���еǴ� ������ ����� ��ġ
 * �ʵ庯���� static������ ������.....
 * �ʵ庯�� | static����
 * 		   
 * �ʵ� :: Ŭ���� �ٷ� �Ʒ�, �� �޼ҵ� ���� �ܺ�
 * 		--> �⺻ ���� ������
 * 		--> Heap(��ü ������ Heap������ �Բ� �ö󰣴�)
 * 
 * Local Value :: �޼ҵ� �� �ȿ��� ����
 * 		--> �⺻���� ������ �ʴ´�. ��� �� �ݵ�� �ʱ�ȭ �۾��� ����Ǿ�� �Ѵ�.(������ ���� �߻�)
 * 		--> Stack�� ������.
 * 
*/
public class Shirt {
	// �ʵ�
	public float price;
	public String brandName;
	public boolean longSleeved;
	public char color;
	public int size;
	
	// Default constructor...
	/*
	 * ���ڰ� ����, { ������ �ȿ��� nothing working
	 * ������ ���� Access Modifier�� Ŭ������ ���󰣴�.
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
