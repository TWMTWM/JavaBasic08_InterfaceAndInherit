package cn.gtmap.interface_;

/**
 * ���һ��Ӣ�ۣ��ܹ�ʹ��������
 * @author Administrator
 *
 */
public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}

}
