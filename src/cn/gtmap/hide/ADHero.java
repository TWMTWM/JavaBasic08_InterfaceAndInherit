package cn.gtmap.hide;

/**
 * �������ظ�����෽��
 *
 */
public class ADHero extends Hero implements AD {

	@Override
	public void attack() {
		System.out.println("����������");
	}
	
	//���ظ����battleWin����
	public static void battleWin(){
		System.out.println("adhero battle win");
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
	}
	
}
