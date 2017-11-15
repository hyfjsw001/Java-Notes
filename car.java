

/*
定义类其实就是在定义类中的成员
成员：成员变量<-->属性。成员函数<-->行为。

成员变量和局部变量的区别：

1.
成员变量定义在类中，整个类中都可以访问。
局部变量定义在函数，语句，局部代码块中，只在所属区域有效。

2.
成员变量存在堆内存的对象中。
局部变量定义在栈内存的方法中。

3.
成员变量睡着对象的创建而存在，随着对象的消失而消失。
局部变量随着所属区域的执行而存在，所属区域的结束而释放。

4.
成员变量都有默认初始化值。
局部变量没有默认初始化值。（需要初始化）
*/
class Car
{
	int num;//成员变量即属性 堆里有默认值 为o
	String color;//成员变量   堆里有默认值 为null
	void run()//成员函数即事物的行为
	{
		System.out.println(num+"..."+color);
	}
}

//有new

class  CarDemo
{
	public static void main(String[] args) 
	{
		Car c=new Car();//new 写的都在堆里
		c.num=4;
		c.color="blue";
		c.run();
		
		Car d=new Car();
		show (d);

		//show(Car d);
		//new Car(); 1.匿名对象 
		//new Car().run();当对象 对方法  仅进行 一次调用 的时候，就可以简化成匿名对象。
		//new Car().color="green";
		//2.匿名对象可以作为时间参数进行传递 
		new Car().num=5;
		show (new Car());
		show (c);


	}
	//汽车改装厂
	public static void show(Car d)
	{
		d.num=3;
		d.color="red";
		System.out.println(d.num+"..."+d.color);
	}
}
