package cn.gtmap.polymorphic_;

public class Item {
	String name;
	int price;
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
	public static void main(String[] args) {
		Item i1LifePotion = new LifePotion();
		Item i2MagicPotion = new MagicPotion();
		/**
		 * 观察类的多态现象：
		 * 1. i1和i2都是Item类型
		 * 2. 都调用effect方法
		 * 3. 输出不同的结果
		 * 多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态
		 */
		System.out.println("i1LifePotion 是Item类型，执行effect打印:");
		i1LifePotion.effect();
		System.out.println("i2MagicPotion 也是Item类型，执行effect打印:");
		i2MagicPotion.effect();
	}
	
}
