package cn.gtmap.override_;

/**
 * Item
 *	����Item��һ������������effect
 */
public class Item {
	String name;
	int price;
	
	public void buy(){
		System.out.println("����");
	}
	
	public void effect(){
		System.out.println("��Ʒʹ�ú󣬿�����Ч��");
	}
	
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp =new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
