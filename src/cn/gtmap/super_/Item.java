package cn.gtmap.super_;

/**
 * 父类显式提供两个构造方法
 * 	分别是无参的构造方法和带一个参数的构造方法
 *
 */
public class Item {
	String name;
	int price;
	
	public Item(){
		 System.out.println("Item的无参的构造方法 ");
	}
	
	public Item(String name){
		System.out.println("Item的有一个参数的构造方法");
		this.name = name;
	}
	
	public static void main(String[] args) {
		new Item();
	}
	
}
