import java.util.*;//java����
class Shuzu1112
{
	public static void main(String[] args) 
	{
		//int hyf[]=new hyf[5];  ������������ľͲ��� ��������
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
			//Arrays.sort(hyf);   Java д�õ�����
			kuo(hyf);
			
		/*System.out.println("max="+max);
		for (int x=0;x<hyf.length; x++)
		{
			System.out.print(hyf[x]+",");
		}*/
		
	}
	//�������Ų���ӡ
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

	//ȡ���1
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
	//ȡ���2
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


		//������ ��С����1
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
		//maoð�ݱȽ� �Ǵ������ұ�
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
