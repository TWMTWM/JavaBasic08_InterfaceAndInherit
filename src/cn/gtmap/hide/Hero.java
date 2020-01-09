package cn.gtmap.hide;

/**
 * 父类有一个类方法 ：battleWin
 * @author Administrator
 *
 */
public class Hero {
	public String name;
	protected float hp;
	
	//类方法，静态方法
	//通过类就可以直接调用
	public static void battleWin(){
		System.out.println("hero battle win");
	}
	
}
