package cn.gtmap.super_;

/**
 * 子类显式调用父类带参构造方法
 * 	使用关键字super 显式调用父类带参的构造方法
 *
 */
public class Armor extends Item{
	
	public Armor(String name){
		super(name);
		System.out.println("Armor的构造方法");
	}
	
	public static void main(String[] args) {
		new Armor("布甲");
	}
	
	
}	
