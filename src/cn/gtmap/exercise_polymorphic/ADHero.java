package cn.gtmap.exercise_polymorphic;

public class ADHero extends Hero implements AD,Mortal{

	@Override
	public void die() {
		System.out.println(this.name + "这个物理英雄挂了");
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
}
