package cn.gtmap.override_;

/**
 * 如果没有重写这样的机制，也就是说LifePotion这个类，一旦继承了Item，所有方法都不能修改了。
 * 	但是LifePotion又希望提供一点不同的功能，为了达到这个目的，只能放弃继承Item,重新编写所有的属性和方法，然后在编写effect的时候，做一点小改动.
 * 	这样就增加了开发时间和维护成本
 *
 */
public class MagicPotion {
	String name;
	int price;
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("蓝瓶使用后，可以回蓝");
	}
	
}
