class  While1026
{
	public static void main(String[] args) 
	{
		
		/*
		while(�������ʽ)
		{
			ִ�����;
		}
		
			int a=1;
		while (a<4)
		{
			System.out.println("a="+a);
			a++;
		}
		*/
//do while ��while �е�����˳��һ����do while ������ζ�������һ�εģ�

/*
	int x=1;
	do
	{
		System.out.println("x="+x);
		x++;
	}
	while (x<3);*/
	//��ϰ����ȡ1-10 10�����ĺ͡�
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

 //��ϰ��1~100֮�� 6�ı������ֵĴ�����
	/*	1.
		int n=0, s;
		do
		{
			n++;
			s=6*n;
			
		}
		while (s<100);
		System.out.println("6�ı������ֵĴ���n="+n);
		*/
   /*  // 2.
		int n=0;//����
		int s=1;
		while (s<100)
		{
			n++;
			s=6*n;
		}
		System.out.println("6�ı������ֵĴ���n="+n);
		*/
//3.��ʦ�ķ����ð�������������˼�� ����ĳһ���� ����
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
