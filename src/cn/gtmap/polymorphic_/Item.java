package cn.gtmap.polymorphic_;

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
		Item i1LifePotion = new LifePotion();
		Item i2MagicPotion = new MagicPotion();
		/**
		 * �۲���Ķ�̬����
		 * 1. i1��i2����Item����
		 * 2. ������effect����
		 * 3. �����ͬ�Ľ��
		 * ��̬: ����ͬһ�����ͣ�����ͬһ��������ȴ�ܳ��ֲ�ͬ��״̬
		 */
		System.out.println("i1LifePotion ��Item���ͣ�ִ��effect��ӡ:");
		i1LifePotion.effect();
		System.out.println("i2MagicPotion Ҳ��Item���ͣ�ִ��effect��ӡ:");
		i2MagicPotion.effect();
	}
	
}
