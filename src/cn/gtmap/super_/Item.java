package cn.gtmap.super_;

/**
 * ������ʽ�ṩ�������췽��
 * 	�ֱ����޲εĹ��췽���ʹ�һ�������Ĺ��췽��
 *
 */
public class Item {
	String name;
	int price;
	
	public Item(){
		 System.out.println("Item���޲εĹ��췽�� ");
	}
	
	public Item(String name){
		System.out.println("Item����һ�������Ĺ��췽��");
		this.name = name;
	}
	
	public static void main(String[] args) {
		new Item();
	}
	
}
