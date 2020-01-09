package cn.gtmap.exercise_polymorphic;

public class APHero extends Hero implements AP, Mortal {

	@Override
	public void die() {
		System.out.println(this.name + "这个魔法英雄挂了");
	}

	@Override
	public void magicAttack() {
		System.out.println("魔法攻击");
	}

}
