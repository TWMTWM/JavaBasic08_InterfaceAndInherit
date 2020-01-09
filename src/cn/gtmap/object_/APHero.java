package cn.gtmap.object_;

/**
 * equals()
 *	equals() 用于判断两个对象的内容是否相同
 *	假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同
 */
public class APHero {
	public String name;
	protected float hp;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(hp);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		APHero other = (APHero) obj;
		if (Float.floatToIntBits(hp) != Float.floatToIntBits(other.hp))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		APHero ap1 = new APHero();
		ap1.hp = 300;
		
		APHero ap2 = new APHero();
		ap2.hp = 400;
		
		APHero ap3 = new APHero();
		ap3.hp = 300;
		
		System.out.println(ap1.equals(ap2));
		
		System.out.println(ap1.equals(ap3));
	}
	
}
