package cn.gtmap.inner_class;
/**
 * ������
 *	������ָ����������һ�����ͬʱʵ��������ʹ������Ӽ�ྫ��
 *	ͨ������£�Ҫʹ��һ���ӿڻ��߳����࣬�����봴��һ������
 *	�е�ʱ��Ϊ�˿���ʹ�ã�ֱ��ʵ����һ�������࣬����������ʵ������󷽷���
 *	��Ȼʵ���˳��󷽷�����ô����һ���µ��ֻ࣬������࣬û��������
 *	�������࣬����������
 */
public abstract class Hero {
    String name; //����
    
    float hp; //Ѫ��
          
    float armor; //����
          
    int moveSpeed; //�ƶ��ٶ�
	
    public abstract void attack();
    
    public static void main(String[] args) {
		Hero h= new Hero(){
			@Override
			public void attack() {
				System.out.println("�µĽ����ֶ�");
			}
		};
		h.attack();
		//ͨ����ӡh�����Կ���h�����������Hero$1��ôһ��ϵͳ�Զ����������
		System.out.println(h);
	}
}
