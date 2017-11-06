class Shuzu1102 
{
	public static void main(String[] args) 
	{
		//元素类型[] 数组名= new 元素类型 [元素个数或数组长度]
		int[] hyf=new int[3];//数组交表没编译没影响，运行有影响：即当访问数组中不存在的角标时，就会发生异常。
		int[] yf=new int[5];
		hyf[2]=99;
		yf[2]=88;
		
		hyf=null;//空 hyf成为垃圾，hyf不指向这个内存地址了：即当引用变量没有任何实体指向时，还在用其操作实体。就会发生异常。
		hyf=yf;
		System.out.println(hyf[2]);
		System.out.println(hyf);//  出现[I@16b4a017 16进制地址
//数据一多 最好用数组容器存起来
		
		//数组第二种格式：元素类型[] 数组名=new 元素类型[]{元素，元素，...};
		//int[] arr=new int[]{2,8,56,99};
		int[] arr={2,8,56,99};//跟上面一样效果
		System.out.println("length:"+arr.length);
		for (int x=0;x<arr.length ;x++ )//4=arr.length
		{
			System.out.println("arr["+x+"]="+arr[x]);//666666
		}

		for (int x=arr.length-1;x>=0 ;x-- )//4=arr.length
		{
			System.out.println("arr["+x+"]="+arr[x]);
		}
		
		


		

		/*
		对数组的操作最基本的就是存和取。
		核心思想：就是对角标的操作。
		*/
	
	}

	
}
/*
内存的划分：
1.寄存器
2.本地方法区
3.方法区
4.栈内存：
	存储的都是局部变量，而且变量所属的 作用域一旦结束，该变量就自动释放。
	
5.堆内存。
	存储的是数组和对象（其实数组就是对象）  反是new建立的都在堆里。
	特点：
	1，每一个实体都有首地地址。
	2.堆内存中的每一个变量都有默认初始化值，根据类型的不同而不同。整数是0 小数是0.0或者0.0f  Boolean是false char '\u0000'
	3.垃圾回收机制。

*/