package cn.gtmap.object_;

/**
 * toString
 * Object类提供一个toString方法，所以所有的类都有toString方法
 * 	toString()的意思是返回当前对象的字符串表达
 * 	通过 System.out.println 打印对象就是打印该对象的toString()返回值
 *
 */
public class ADHero extends Hero {
	
	@Override
	public String toString() {
		return "ADHero [name=" + name + ", hp=" + hp + ", armor=" + armor + ", moveSpeed=" + moveSpeed + "]";
	}
	
	public static void main(String[] args) {
		ADHero ad = new ADHero();
		ad.name = "物理英雄";
		System.out.println(ad.toString());
		System.out.println(ad);
	}
}
