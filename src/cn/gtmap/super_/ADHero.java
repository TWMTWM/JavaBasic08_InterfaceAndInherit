package cn.gtmap.super_;

/**
 * 实例化一个ADHero(), 其构造方法会被调用 
 * 	其父类的构造方法也会被调用 
 * 	并且是父类构造方法先调用 
 * 	子类构造方法会默认调用父类的 无参的构造方法
 * @author Administrator
 *
 */
public class ADHero extends Hero {
	public ADHero(){
		System.out.println("ADHero 的构造方法");
	}
	
	public static void main(String[] args) {
		new ADHero();
	}
}
