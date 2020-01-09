package cn.gtmap.exercise_polymorphic;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void die() {
		System.out.println("这个混合英雄挂了");
	}

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
}
