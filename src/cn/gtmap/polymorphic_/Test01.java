package cn.gtmap.polymorphic_;

/**
 * 操作符的多态
 * @author Administrator
 *	同一个操作符在不同情境下，具备不同的作用
 *	如果+号两侧都是整型，那么+代表 数字相加
 *	如果+号两侧，任意一个是字符串，那么+代表字符串连接
 */
public class Test01 {
	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		int k = i + j;//如果+号两侧都是整型，那么+代表 数字相加
		
		System.out.println(k);
		
		int a = 5;
		String b = "5";
		String c = a + b;//如果+号两侧，任意一个是字符串，那么+代表字符串连接
		System.out.println(c);
		
		int d = 5;
		char e = '5';
		int f = d + e;//53
		System.out.println(f);//58
	}
}
