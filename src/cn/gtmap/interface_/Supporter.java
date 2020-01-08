package cn.gtmap.interface_;

public class Supporter extends Hero implements Healer {

	@Override
	public void heal() {
		System.out.println("可以进行治疗的英雄");
	}

}
