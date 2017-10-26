class  For1026
{
	public static void main(String[] args) 
	{
		/*
		for(初始化表达式；循环条件表达式；循环后的操作表达式；
		{
			执行语句；（循环体）
			}
		*/
/*
		for (int x=1;x<4 ;x++ )//顺序 x=1  x<4 打印屏幕 x++ x<4 打印屏幕 x++  ....当x<4不成立 就跳出来
		{
			System.out.println("Hello World!");
		}
		*/
		//for (int a=0,b=1;a<5 ;a++,b-- )  for的这一种形式也是可以的
		
	/*	
		int x=1;
		{
		}
		for (System.out.println("1");x<3;System.out.println("4") )
		{
			System.out.println("2");
			x++;
		}
		System.out.println("Hello World!");

		*/
/*
for 和while的特点：
	1.for和while可以互换。
	2.格式上的不同，在使用上有点小区别。
		如果需要通过变量来对循环进行控制，该变量只作为循环变量存在时，区别就出来了。
*/
//for的练习：for完成1-10累加
	
		int s=0;
		for (int i=1;i<=10 ;i++ )//这里的i是局部变量，用完就释放了。这就是所谓的小区别。
		{
			s=s+i;
			
		}
		System.out.println("s="+s);
//无限循环最简单的形式。
//while (true){}

//for (; ; ){}	  第二个，条件表达式默认为true 其他那两个真的可以没有	

	/*
	什么时候使用循环结构呢？
		当对某些代码执行很多次时，使用循环结构完成。
		当对一个条件进行一次判断时，可以用使用if语句。
		当对一个条件进行多次判断时，可以使用while语句。
		 
		 注意：
		 使用循环时，一定要明确哪些语句需要参与循环，哪些不需要。
		 循环通常情况下，需要定义条件，需要控制次数。


	}
}
