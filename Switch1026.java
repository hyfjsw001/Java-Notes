class Switch1026 
{
	public static void main(String[] args) 
	{
		/*
		switch(���ʽ)
		{
			case ȡֵ1��
			ִ����䣻
			break;
			case ȡֵ2��
			ִ����䣻
			break;
			......
			default;
			ִ����䣻
			break��
		}//����{}��break����ʡ���м�Ĳ���ʡ����ʡ���м��ƥ��ͻ�ִ����һ������Ϊû��break����˳��ִ�������case�µ�ִ����䣨���ж��ˣ�ֱ������}

		*/
		/*
		int a=4;
		switch (a)//byte,short,int,char.
		{
		case 22:
			System.out.println("a");
		break;
		case 4:
			System.out.println("b");
		break;
		case 3:
			System.out.println("c");
		break;
		default:
		System.out.println("d");
		break;
		
		}//case˳������ң�default���Էŵ�һ�������������ǻ���ִ������case���ִ��default
		*/
		
		int month=15;
		switch (month)
		{
		case 3:
		case 4:
		case 5://ԭ�����û��break�������ִ�ж��Ҳ��жϣ�����break��}��������
			System.out.println(month+"�¶�Ӧ���Ǵ���");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"�¶�Ӧ�����ļ�");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"�¶�Ӧ�����＾");
			break;
		
		case 12:
			case 1:
			case 2:
			
		
			System.out.println(month+"�¶�Ӧ���Ƕ���");
			break;
		default:
				System.out.println(month+"��û�ж�Ӧ�ļ���");
		}
		
		System.out.println("Hello World!");
	}
}
