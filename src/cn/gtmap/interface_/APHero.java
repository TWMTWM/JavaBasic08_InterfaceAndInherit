package cn.gtmap.interface_;

/**
 * 设计一类英雄，只能使用魔法攻击
 * @author Administrator
 *
 */
public class APHero extends Hero implements AP{

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
}
