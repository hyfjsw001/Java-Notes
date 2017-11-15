/*封装：是指隐藏对象的属性和实现细节，仅对外提供公共访问方式。
好处：
将变化隔离
便于使用
提高重用性
提高安全性
封装的原则：将不需要对外提供的内容都隐藏起来。
			把属性都隐藏，提供公共方法对其访问
注意：私有仅仅是封装的一种体现而已。不私有也能封装

*/
//函数就是最小的封装
//对象：人  功能：说话
class Person 
{
	private int age;//private 私有的意思  是一个权限修饰符，用于修饰成员。私有的只在本类中有效。

	public void setAge(int a)//serXxx  getXxx
	{
		if(a>0&&a<155)
		{
			age=a;
			speak();
	     }
		else
			System.out.println("age错误");
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
			System.out.println("age错误");

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
