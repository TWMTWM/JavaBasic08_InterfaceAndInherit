package cn.gtmap.interface_;

/**
 * 设计一类英雄，能够使用物理攻击
 * @author Administrator
 *
 */
public class ADHero extends Hero implements AD {

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

}
