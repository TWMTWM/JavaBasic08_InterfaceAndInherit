package cn.gtmap.override_;

/**
 * ���û����д�����Ļ��ƣ�Ҳ����˵LifePotion����࣬һ���̳���Item�����з����������޸��ˡ�
 * 	����LifePotion��ϣ���ṩһ�㲻ͬ�Ĺ��ܣ�Ϊ�˴ﵽ���Ŀ�ģ�ֻ�ܷ����̳�Item,���±�д���е����Ժͷ�����Ȼ���ڱ�дeffect��ʱ����һ��С�Ķ�.
 * 	�����������˿���ʱ���ά���ɱ�
 *
 */
public class MagicPotion {
	String name;
	int price;
	
	public void buy(){
		System.out.println("����");
	}
	
	public void effect(){
		System.out.println("��ƿʹ�ú󣬿��Ի���");
	}
	
}
