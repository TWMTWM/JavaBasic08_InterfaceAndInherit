package cn.gtmap.super_;

/**
 * ������ʽ���ø�����ι��췽��
 * 	ʹ�ùؼ���super ��ʽ���ø�����εĹ��췽��
 *
 */
public class Armor extends Item{
	
	public Armor(String name){
		super(name);
		System.out.println("Armor�Ĺ��췽��");
	}
	
	public static void main(String[] args) {
		new Armor("����");
	}
	
	
}	
