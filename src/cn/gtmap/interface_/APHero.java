package cn.gtmap.interface_;

/**
 * ���һ��Ӣ�ۣ�ֻ��ʹ��ħ������
 * @author Administrator
 *
 */
public class APHero extends Hero implements AP{

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
}
