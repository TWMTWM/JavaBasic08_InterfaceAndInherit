package cn.gtmap.super_;

/**
 * 准备显式提供无参构造方法的父类 
 * 	在实例化Hero对象的时候，其构造方法会打印 
 * 	“Hero的构造方法 "
 * @author Administrator
 *
 */
public class Hero {
    String name; //姓名
    
    float hp; //血量
        
    float armor; //护甲
        
    int moveSpeed; //移动速度
    
    public Hero(){
    	System.out.println("Hero的构造方法 ");
    }
    
    public static void main(String[] args) {
		new Hero();
	}
}
