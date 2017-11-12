import java.util.*;//java排序
class Shuzu1112
{
	public static void main(String[] args) 
	{
		//int hyf[]=new hyf[5];  这个如果在下面的就不行 会编译错误
		int[] hyf={25,9,1595,5555,999,6513,96,1,99995};
		
			int max=getmax2(hyf);
			/*for (int x=0;x<hyf.length; x++)
		{
			System.out.print(hyf[x]+",");
		}*/
			kuo(hyf);
			daxiao(hyf);
			kuo(hyf);
			daxiao2(hyf);
			//Arrays.sort(hyf);   Java 写好的排序
			kuo(hyf);
			
		/*System.out.println("max="+max);
		for (int x=0;x<hyf.length; x++)
		{
			System.out.print(hyf[x]+",");
		}*/
		
	}
	//加中括号并打印
	public static void kuo(int[] hyf)
		{
		System.out.print("[");
	for (int x=0;x<hyf.length ;x++ )
	{
		if (x!=hyf.length-1)
		{
			System.out.print(hyf[x]+",");
			
		}
		else
				System.out.println(hyf[x]+"]");
	}
	}

	//取最大1
	public static int getmax(int[] hyf)
	{
		int max=0; 
		for (int x=1;x<hyf.length ;x++ )
		{
			if (max<hyf[x])
			max=hyf[x];
		}
		return max;
	}
	//取最大2
	public static int getmax2(int[] hyf)
	{
		int z=0; 
		for (int x=1;x<hyf.length ;x++ )
		{
			if (hyf[z]<hyf[x])
			z=x;
		}
		return hyf[z];
			}


		//排下序 从小到大1
		public static void daxiao(int[] hyf)
		{
			
			for (int x=0;x<hyf.length-1 ;x++)
			{
				for (int y=x+1;y<hyf.length ; y++)
				{
					
					if (hyf[x]>hyf[y])
					{
					int temp=hyf[x];
					hyf[x]=hyf[y];
					hyf[y]=temp;}
				}
			}
			
		}
		//mao冒泡比较 是从左往右比
		public static void daxiao2(int[] hyf)
		{
			for (int x=0;x<hyf.length-1 ;x++ )
			{
				for (int y=0; y<hyf.length-1-x;y++ )
				{
				
				
					if (hyf[y]<hyf[y+1])
					{
						int c=hyf[y];
						hyf[y]=hyf[y+1];
						hyf[y+1]=c;
					}   
				}
			
		}
		}

}
