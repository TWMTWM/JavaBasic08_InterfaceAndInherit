package cn.gtmap.polymorphic_;

/**
 * �������Ķ�̬
 * @author Administrator
 *	ͬһ���������ڲ�ͬ�龳�£��߱���ͬ������
 *	���+�����඼�����ͣ���ô+���� �������
 *	���+�����࣬����һ�����ַ�������ô+�����ַ�������
 */
public class Test01 {
	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		int k = i + j;//���+�����඼�����ͣ���ô+���� �������
		
		System.out.println(k);
		
		int a = 5;
		String b = "5";
		String c = a + b;//���+�����࣬����һ�����ַ�������ô+�����ַ�������
		System.out.println(c);
		
		int d = 5;
		char e = '5';
		int f = d + e;//53
		System.out.println(f);//58
	}
}
