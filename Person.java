/*��װ����ָ���ض�������Ժ�ʵ��ϸ�ڣ��������ṩ�������ʷ�ʽ��
�ô���
���仯����
����ʹ��
���������
��߰�ȫ��
��װ��ԭ�򣺽�����Ҫ�����ṩ�����ݶ�����������
			�����Զ����أ��ṩ���������������
ע�⣺˽�н����Ƿ�װ��һ�����ֶ��ѡ���˽��Ҳ�ܷ�װ

*/
//����������С�ķ�װ
//������  ���ܣ�˵��
class Person 
{
	private int age;//private ˽�е���˼  ��һ��Ȩ�����η����������γ�Ա��˽�е�ֻ�ڱ�������Ч��

	public void setAge(int a)//serXxx  getXxx
	{
		if(a>0&&a<155)
		{
			age=a;
			speak();
	     }
		else
			System.out.println("age����");
	}
	public int getAge()
	{
		return age;
		
	}
	/*
		public void gaga(int a)
	{
		if(a>0&&a<155)
		{
			age=a;
			speak();
	     }
		else
			System.out.println("age����");

	}
	*/
	void speak()
		{
		System.out.println("age="+age);
		}
		
	
}

class PersonDemo
{
	public static void main (String[] args)
	{
		Person H=new Person();
		//H.age=-25;
		H.setAge(-25);
		
		
	}
}
