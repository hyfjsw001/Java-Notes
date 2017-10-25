class  Test003
{
	public static void main(String[] args) 
	{
		//对两个变量进行互换 。（不用第三方变量）
		int a=3,b=5;
		System.out.println("a="+a+",b="+b);
		/*（不用第三方变量）所以不行
		int c;
		c=a;
		a=b;
		b=c;
		*/
		//这种方式不要用，两数过大，会超出int范围，会强制转换，精度会误差。
		/*开发用这种比较好，阅读性比较好
		a=a+b;//a=3+5;a=8;
		b=a-b;//3+5-5=3;b=3;
		a=a-b;//3+5-3=5;c=5;
		*/

		//^异或 面试用，阅读性差
		a=a^b;//a=3^5;
		b=a^b;//b=(3^5)^5;b=3
		a=a^b;//a=(3^5)^3;a=5
		System.out.println("a="+a+",b="+b);
	}
}
