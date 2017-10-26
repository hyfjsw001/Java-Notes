class  T1026
{
	public static void main(String[] args) 
	{
		/*三元运算符:  (条件表达式）？（表达式1）：（表达式2）；
		如果条件为真，运算后的结果为表达式1；为假，结果为表达式2；*/
/*
		int x=3,y;
		y=(x>1)?100:200;
		System.out.println("y="+y);
		*/
//用if语句表达三元运算符
/*
int x=3,y;
if (x>1)
	x=100;
else
	x=200;
System.out.println("y="+y);*/
//所以三元运算符是if else语句的简写形式   


//最大区别，三元运算符是运算符，必须有结果，if else 可以不是结果可以打印大屏幕上



		/*有两个数，我要取大的那个去运算
		int a,b;
		int max=a>b?a:b;*/
		//获取三个整数中的较大的整数
		/*
		int o,p,q;
		int temp=o>p?o:p;
		int max2=temp>q?temp:q;*/
		/*************************************************/
//程序流程控制
//顺序结构   判断结构    选择结构   循环结构
	
	/*
	if语句的第一种格式
	if (条件表达式)
	{
		执行语句；

	}    
	*/
	//if语句的第二种格式  else 否则
	/*if (条件表达式)
	{
		执行语句；

	} 
	else
	{
		执行语句；

	}

	System.out.println("跟他们无关，if成立不成立都输出");
	*/
/*
	int x=3;
	if(x<4)   //if 条件表达式为假 就不会执行{}里的了
		{    //执行语句是单条语句的时候{}可以省略
		System.out.println("yes");
		}

		if (x>4)//可以换成else形式 不过有点不同 x=4
		
		System.out.println("no");

		*/
/*
		if语句的第三种格式
			if(条件表达式)
			{执行语句；}
		else if(条件表达式)
		{执行语句}
		else if(条件表达式）
			{执行语句}
			...一直否才能继续else if
			*/
			{ //局部变量 出了这个{}就没用了 释放了  yongg用完就释放 优化内存即可用定义局部变量的声明周期

				int m=89;
		System.out.println("m="+m);
			}
			System.out.println(999);


//{代码块} 代码一定以}结尾或者；结尾 局部代码块里的只在这个{}里有用 就是变量的作用域


	} 
}
