package cn.gtmap.override_;

/**
 * 子类LifePotion
 *	子类LifePotion继承Item,同时也提供了方法effect
 */
public class LifePotion extends Item {
	public void effect(){
		System.out.println("血瓶使用后，可以回血");
	}
}
