package cn.gtmap.super_;

/**
 * ׼����ʽ�ṩ�޲ι��췽���ĸ��� 
 * 	��ʵ����Hero�����ʱ���乹�췽�����ӡ 
 * 	��Hero�Ĺ��췽�� "
 * @author Administrator
 *
 */
public class Hero {
    String name; //����
    
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
    
    public Hero(){
    	System.out.println("Hero�Ĺ��췽�� ");
    }
    
    public static void main(String[] args) {
		new Hero();
	}
}
