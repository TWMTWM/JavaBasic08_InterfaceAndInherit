package cn.gtmap.object_;

/**
 * toString
 * Object���ṩһ��toString�������������е��඼��toString����
 * 	toString()����˼�Ƿ��ص�ǰ������ַ������
 * 	ͨ�� System.out.println ��ӡ������Ǵ�ӡ�ö����toString()����ֵ
 *
 */
public class ADHero extends Hero {
	
	@Override
	public String toString() {
		return "ADHero [name=" + name + ", hp=" + hp + ", armor=" + armor + ", moveSpeed=" + moveSpeed + "]";
	}
	
	public static void main(String[] args) {
		ADHero ad = new ADHero();
		ad.name = "����Ӣ��";
		System.out.println(ad.toString());
		System.out.println(ad);
	}
}
