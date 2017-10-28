class  Forfor1027  
{
	public static void main(String[] args) 
	{
		/*//for语句的循环嵌套  
		for (int y=0;y<2 ;y++ )//外循环 代表执行几次内循环
		{
			for (int x=0;x<2 ;x++ )//内循环 跳出来后x就释放 
			{
				System.out.println("ojbk");
			}
		}*/


		/*应用场景：
打印下面图形
	*****
	*****
	*****
	*****
	
	*/
	/*1.
	System.out.println("*****");
	System.out.println("*****");
	System.out.println("*****");
	System.out.println("*****");
	*/
	//2.
	/*
	for (int x=0;x<4 ; x++)//外循环控制的行数
	{
		for (int y=0;y<5 ; y++)//内循环控制的是每行的个数
		{
			System.out.print("*");//没换行
		}
		System.out.println();//换行
		
	}
	*/

    /*
	*****
	****
	***
	**
	*

	*///the best!!!!
		
	for (int i=0;i<4 ;i++)
	{
		for (int x=i; x<4; x++)
		{
		System.out.print("*");
		}
		System.out.println();
	}

  //老师的1
  /*
		int z=5;
		for (int x=1;x<=5 ;x++ )
		{
			for (int y=1;y<=z ;y++ )
			{
			System.out.print("*");
			}
			z--;
			System.out.println();
		}
*/
/*
*
**
***
****
*****
*/
	/*	for (int i=4; i>-1;i-- )//缺点 最好这里不要动  看下面的吧
		{
			for (int x=i;x<5;x++ )
			{
			System.out.print("*");
			}
			System.out.println();
		}
*/	
	
		for (int i=0; i<4;i++ )
		{
			for (int x=0;x<=i;x++ )//实际上就是 x和i的距离 看定住哪个合适
			{
			System.out.print("*");
			}
			System.out.println();
		}

/*题：打印
54321
5432
543
54
5
1
22
333
4444
55555
*/
		for (int i=0;i<5 ;i++ )
		{
			for (int x=i;x<5 ;x++ )
			{
				System.out.print(5-x);
			}
			System.out.println();
		}

		for (int i=0;i<5 ;i++ )
		{
			for (int x=0;x<=i ;x++ )
			{
				System.out.print(i+1);
			}
			System.out.println();
		}

	//九九乘法表
/*	1*1=1
	1*2=2 2*2=4
	1*3=3 2*3=6 3*3=9  
		*/
		for (int i=1;i<=9 ;i++ )
		{
			for (int n=1;n<=i ;n++ )
			{
			System.out.print(i+"*"+n+"="+i*n);
			System.out.print(" \t");//  \n 代表回车符  转义字符  能在任意位置换行 但是要用到字符串中
			//  \t 制表格 相当于画表格 对齐 tab键  对齐了
			}
			System.out.println();
 		}
  /*重点转义字符：
	  \n:回车
	  \t：制表符
	  \b：退格
	  \r：按下回车键
	  Windows系统中回车符其实是由两个符号组成的  \r\n
	  linux中回车符是\n
	  打印带引号的字符串  \"字符串\"" 要把双引号转义*/
		



		System.out.println("\"hello\b world\"");// \b 退格 就是往左删除一位
/*
  * * * * *
   * * * *
    * * *
     * *
	  *
*/
   for (int i=1;i<=5 ;i++ )
		{
			for (int m=1;m<i ;m++ )
			{
				System.out.print(" ");
			}
			for (int n=i;n<=5 ;n++ )
			{
			System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
