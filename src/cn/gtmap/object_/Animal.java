package cn.gtmap.object_;

/**
 * finalize()
 *��һ������û���κ�����ָ���ʱ�����������������յ�����
 *	�������������յ�ʱ������finalize() �����ͻᱻ���á�
 *	finalize() ���ǿ�����Ա�������õķ����������������JVM���õġ�
 */
public class Animal {
	
	public String name;
	protected float hp;
	
	public void finalize(){
		System.out.println("���Ӣ�����ڱ�����");
	}
	
	public static void main(String[] args) {
		Animal a;
		for (int i = 0; i < 100000; i++) {
            //���������µĶ���
            //ÿ����һ������ǰһ�����󣬾�û������ָ����
            //��Щ���󣬾������������յ�����
            //���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������
            //һ��������󱻻��գ�����finalize()�����ͻᱻ����
			a = new Animal();
		}
	}

}
