class BreakContinue1028 
{
	public static void main(String[] args) 
	{
		/*
		break:������
		break���õķ�Χ ��������switch������ѭ�����
		������if����ʲôʱ����
		*/
		job:for (int x=0;x<3 ;x++ )
		{
			tom:for (int y=0;y<4 ;y++ )
			{
				System.out.println("Hello  feiji");
				break job ;//���Ը�forѭ������ Ȼ��ֱ������ָ����ѭ��
			}
		}
		System.out.println("Hello World!");
		//break������break���õķ�Χ ��������switch������ѭ�����
	
	
	/*continue������
	���ã���������ѭ���������´�ѭ����
		���õķ�Χ��ѭ���ṹ��

		*/
			job2:for (int x=0;x<3 ;x++ )
			{
				tom2:for (int y=0;y<4 ;y++ )
				{
					System.out.println("Hello  faker");
					//break ;//continue job2;//�൱��������job2�ټ�����break job2�൱������job2 job2ѭ������
				}
				
				
			
			}
			int a ;
			a=0%5;//С��5��ģ5�����ڱ���
			System.out.println(a);

	
	}
}
