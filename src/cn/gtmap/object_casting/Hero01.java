package cn.gtmap.object_casting;

/**
 * 明确引用类型与对象类型的概念
 * 	首先，明确引用类型与对象类型的概念
 * 	在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
 * 	对象是有类型的， 是ADHero
 * 	引用也是有类型的，是ADHero
 * 	通常情况下，引用类型和对象类型是一样的
 * 	接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题
 * @author Administrator
 *
 */
public class Hero01 {
	public String name;
	protected float hp;
	
	public static void main(String[] args) {
		ADHero ad = new ADHero();
	}
}
