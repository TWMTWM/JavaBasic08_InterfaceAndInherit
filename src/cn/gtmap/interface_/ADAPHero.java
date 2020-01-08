package cn.gtmap.interface_;

/**
 * 设计一类英雄，既能进行物理攻击，又能进行魔法攻击
 * @author Administrator
 *
 */
public class ADAPHero extends Hero implements AD,AP{

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

}
