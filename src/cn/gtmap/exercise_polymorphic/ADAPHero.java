package cn.gtmap.exercise_polymorphic;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void die() {
		System.out.println("������Ӣ�۹���");
	}

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
}
