package cn.gtmap.exercise_polymorphic;

public class APHero extends Hero implements AP, Mortal {

	@Override
	public void die() {
		System.out.println(this.name + "���ħ��Ӣ�۹���");
	}

	@Override
	public void magicAttack() {
		System.out.println("ħ������");
	}

}
