package cn.gtmap.exercise_polymorphic;

public class ADHero extends Hero implements AD,Mortal{

	@Override
	public void die() {
		System.out.println(this.name + "�������Ӣ�۹���");
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
}
