class  While1026
{
	public static void main(String[] args) 
	{
		
		/*
		while(条件表达式)
		{
			执行语句;
		}
		
			int a=1;
		while (a<4)
		{
			System.out.println("a="+a);
			a++;
		}
		*/
//do while 和while 有点区别，顺序不一样；do while 无论如何都会先做一次的；

/*
	int x=1;
	do
	{
		System.out.println("x="+x);
		x++;
	}
	while (x<3);*/
	//练习：获取1-10 10个数的和。
/*
	int h=1;
	int s=0;
	while (h<11)
	{
		System.out.println("s="+s+"+"+h);
		s=s+h;
		h=h+1;
	}
		System.out.println("s="+s);
		*/

 //练习：1~100之间 6的倍数出现的次数。
	/*	1.
		int n=0, s;
		do
		{
			n++;
			s=6*n;
			
		}
		while (s<100);
		System.out.println("6的倍数出现的次数n="+n);
		*/
   /*  // 2.
		int n=0;//次数
		int s=1;
		while (s<100)
		{
			n++;
			s=6*n;
		}
		System.out.println("6的倍数出现的次数n="+n);
		*/
//3.老师的方法好啊！！！计数器思想 满足某一条件 计数
	int x=1;
	int count=0;
	while (x<=100)
	{
		if (x%6==0)
		{
			count++;
			System.out.println("x="+x);
		}
		x++;
	}
	System.out.println("count+"+count);


	}
}
