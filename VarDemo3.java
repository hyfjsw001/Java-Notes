class VarDemo2 
{
	public static void main(String[] args) 
	{
		//byte x=3;
	//	x=(byte)(x+4); 
	//	System.out.println('你'+0);//unicode国际标准码表
	 //byte b=129;精度损失，byte的取值范围为-128~127，占用1个字节（0000-0000），而int的取值范围为（-2147483648~2147483647），占用4个字节（-2的31次方到2的31次方-1）
	/*byte b=4;
	byte b1=3;
	byte b2=4;
	b=b1+b2;会报错，损失精度，因为b1 b2值不确定不是常量。*/



	//算术运算符+-*/ %（取余，模运算） 5%2=1  任何/2不是0就是1 开关运算
	//+（连接符） 任何数和字符串相加叫做相连接 3+'2'
	//int x=6370'
	//x=x/1000*1000

	// System.out.println("5+5="+(5+5));
	/*int a=3,b=6;

	System.out.println("a="+a+",+b="+b);*/
/*	//++自增   --自减
	int a=3,b;
	//a++;//a=a+1;
	//++a;
	//b=a++;//a=temp,a=a+1,b=a=temp;a4b3

	//b=++a;//a=a+1.b=a;a4b4
	a=a++;//a=temp,a++...a=temp 3
	b=1;

	System.out.println("a="+a+",b="+b);*/
/*	赋值运算符 = += - -= * *= / /= % %=
	int a,b,c;
	a=b=c=4;

	int a=4;
	a+=2//a=a+2;
	System.out.println(a);   */
	short s=3;
	s=+4;//s=(short)(s+4);
	//s=s+4;//编译失败,精度丢失
	System.out.println("s="+s);



	}
} 
