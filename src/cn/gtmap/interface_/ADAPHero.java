package cn.gtmap.interface_;

/**
 * ���һ��Ӣ�ۣ����ܽ��������������ܽ���ħ������
 * @author Administrator
 *
 */
public class ADAPHero extends Hero implements AD,AP{

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

}
