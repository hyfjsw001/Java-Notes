class  Forfor1027  
{
	public static void main(String[] args) 
	{
		/*//for����ѭ��Ƕ��  
		for (int y=0;y<2 ;y++ )//��ѭ�� ����ִ�м�����ѭ��
		{
			for (int x=0;x<2 ;x++ )//��ѭ�� ��������x���ͷ� 
			{
				System.out.println("ojbk");
			}
		}*/


		/*Ӧ�ó�����
��ӡ����ͼ��
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
	for (int x=0;x<4 ; x++)//��ѭ�����Ƶ�����
	{
		for (int y=0;y<5 ; y++)//��ѭ�����Ƶ���ÿ�еĸ���
		{
			System.out.print("*");//û����
		}
		System.out.println();//����
		
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

  //��ʦ��1
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
	/*	for (int i=4; i>-1;i-- )//ȱ�� ������ﲻҪ��  ������İ�
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
			for (int x=0;x<=i;x++ )//ʵ���Ͼ��� x��i�ľ��� ����ס�ĸ�����
			{
			System.out.print("*");
			}
			System.out.println();
		}

/*�⣺��ӡ
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

	//�žų˷���
/*	1*1=1
	1*2=2 2*2=4
	1*3=3 2*3=6 3*3=9  
		*/
		for (int i=1;i<=9 ;i++ )
		{
			for (int n=1;n<=i ;n++ )
			{
			System.out.print(i+"*"+n+"="+i*n);
			System.out.print(" \t");//  \n ����س���  ת���ַ�  ��������λ�û��� ����Ҫ�õ��ַ�����
			//  \t �Ʊ�� �൱�ڻ���� ���� tab��  ������
			}
			System.out.println();
 		}
  /*�ص�ת���ַ���
	  \n:�س�
	  \t���Ʊ��
	  \b���˸�
	  \r�����»س���
	  Windowsϵͳ�лس�����ʵ��������������ɵ�  \r\n
	  linux�лس�����\n
	  ��ӡ�����ŵ��ַ���  \"�ַ���\"" Ҫ��˫����ת��*/
		



		System.out.println("\"hello\b world\"");// \b �˸� ��������ɾ��һλ
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
