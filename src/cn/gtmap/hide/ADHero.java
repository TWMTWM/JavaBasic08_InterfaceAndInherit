package cn.gtmap.hide;

/**
 * 子类隐藏父类的类方法
 *
 */
public class ADHero extends Hero implements AD {

	@Override
	public void attack() {
		System.out.println("进行物理攻击");
	}
	
	//隐藏父类的battleWin方法
	public static void battleWin(){
		System.out.println("adhero battle win");
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
	}
	
}
