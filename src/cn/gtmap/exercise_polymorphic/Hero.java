package cn.gtmap.exercise_polymorphic;

/**
 * immortal�ǲ���ģ���������˼
	mortal��������һ���ģ����˵���˼
	 
	
	1. ���һ���ӿ�
	�ӿڽ���Mortal,������һ����������die
	2. ʵ�ֽӿ�
	�ֱ���ADHero,APHero,ADAPHero�������࣬ʵ��Mortal�ӿڣ���ͬ����ʵ��die������ʱ�򣬶���ӡ����һ�����ַ���
	3. ΪHero�࣬���һ������,����������е��� m��die������
	 
	public void kill(Mortal m)
	 
	
	4. ����������
	����ʵ������һ��Hero����:����
	Ȼ��ʵ������3�����󣬷ֱ���ADHero,APHero,ADAPHero��ʵ��
	Ȼ���ø��� kill ��3������
 *
 */
public class Hero {
    String name; //����
    
    float hp; //Ѫ��
     
    float armor; //����
     
    int moveSpeed; //�ƶ��ٶ�	
    
    
    public void kill(Mortal m){
    	System.out.println(this.name + "����һ������");
    	m.die();
    }
    
    public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		
		ADHero aixi = new ADHero();
		aixi.name = "��ϣ";
		
		APHero annie = new APHero();
		annie.name = "����";
		
		ADAPHero kuqi = new ADAPHero();
		kuqi.name = "����";
		
		garen.kill(aixi);
		garen.kill(annie);
		garen.kill(kuqi);
		
	}
    
}
