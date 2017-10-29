class Hshu1029 
{
	//定义函数1
	static int add(int a,int b)//函数名 可以由几个单词组成，第一个单词小写 下面的单词都要大写，用于区分 类和函数；add DEMO
	{
		int sum=a+b;	//return 还有结束函数的作用
		return sum;
	}
//功能 所以函数
/*
	需求1：定义一个功能，完成两个整数的和的获取。
	思路：既然定义功能，就是可以用函数来体现。
		如何定义一个函数呢？
		通过两个明确来完成。

			明确一：这个功能的结果是什么？
				是和。所以该功能的返回值类型是int 。
				其实就是明确函数的返回值类型。


			明确二：
			这个功能实现过程中是否需要未知内容参与运算？
			需要。加数和被加数。这就是函数的参数列表（参数的个数，参数的类型）
				其实就是在明确参数列表。
			注意：返回值类型跟参数类型没有直接关系。
				

*/
			//练习1
	/*		需求2：定义一个功能，画一个矩形在控制台。
				明确一 没有结果，因为直接打印到控制台，并未返回给调用者。
				明确二  有未知内容，行和列。两个 整数 int。*/

				static void jx(int a,int b)
	{
			for (int i=0;i<b ;i++ )
			{
				for (int x=0;x<a ;x++ )
				{
					System.out.print("*");
				}
				System.out.println();
			}
			return;//可以省略
	}
	//练习2 需求3 定义一个功能，比较两数大小是否相等。
/*	明确一 结果是 是或者否 Boolean类型
	明确二 两个整数未知 int */
	//练习2
	static boolean Daxiao(int a ,int b)
	{
		//return a==b?true:false;
		return a==b;
			
	}
//需求3 根据考生成绩获取学生分数对应的等级
/*  90~100  A
    80~89   B
    80以下  C*/
	/*
	明确1 结果？ char
	明确2 参数是学生成绩 类型int
*///练习3
	public static char fenshu(int x)
	{
		char level;
		
		if (0<=x&&x<80)
		level= 'C';
		else if (x<90)
		level='B';
		else if (x<=100)
		level='A'	;
		
		else    //必须有这个
		level='F';
		
		return level;
	/*  if 
	else if 
	else if
	else
	;    必须else才能结束 */
	
		
		
		
	}

	public static void main(String[] args) 
	{
		//将功能代码封装便于复用。函数就是定义在类中的具有特定功能的一段独立小程序，函数也称为方法
/*定义函数的格式：
	修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2，参数类型 形式参数3，....）
	{
	执行语句；
	return 返回值；
	}

	特殊情况：
	功能没有具体的返回值，这时候return后面直接用分号结束
	返回值的类型怎么体现呢？因为没有具体值，所以不可以写具体的数据类型。
	在java中只能用一个关键字来表示这种情况，  关键字是： void

	总结：没有具体的返回值时，返回值类型用void来表示。
	注意：如果返回值类型是void，那么函数中的return语句可以省略不写。
注意；
1.函数中只能调用函数，不可以在函数中定义函数。
2.定义函数时，函数的结果应该返回给调用者，交由调用者处理。比如下面这种错误
	public static void add(int a,int b)
		{
			System.out.println(a+b);
			return;
	}
	//虽然编译没错但是他把数值输出打印了，应该交给调用者处理使用

	*/
	int a=4,b=7;
	int c=add(a,b);//调用函数1
	
		System.out.println("Hello World!"+c);
		hello();
		hello();
		hello();//调用函数2
   System.out.println(add(6,9));//这种调用操作也是可以的 
	jx(8,6);//调用需求2
	Daxiao(9,9);//没有任何输出
	System.out.println(Daxiao(9,9));//调用函数练习2
	fenshu(89);
	System.out.println(fenshu(99));//调用函数练习3




	}

	//定义函数2
	static void hello()
	{
	System.out.println("Hello World!jiji");
	return;//可以省略
	
	}

}
/*
栈 先进后出 ***
重载的概念：载同一个类中，允许存在一个以上的同名函数只要他们的参数个数或者类型不同即可


*/
