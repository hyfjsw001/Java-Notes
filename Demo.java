//两道题  要看懂过程
/*
//基本数据类型参数传递
class  Demo
{
	public static void main(String[] args) 
	{
		int x=3;
		show(x);
		System.out.println("x="+x);//打印x=3
	}
	public static void show(int x)
	{
		x=4;
		return;
	}
}

*/
//引用数据类型参数传递
class Demo
{
	int x=3;
	public static void main(String[] args)
	{
		Demo d=new Demo();//定义一个类参数Demo class Demo x=3
		d.x=9;//赋值Demo.x=9
		show(d);//把堆里的Demo传递给函数里的d 并且函数把d.x=4  他们的操作都是指向堆里的块地址 
		System.out.println(d.x);//打印是4

	}
	public static void show (Demo d)
	{
		d.x=4;
	}
}
