//������  Ҫ��������
/*
//�����������Ͳ�������
class  Demo
{
	public static void main(String[] args) 
	{
		int x=3;
		show(x);
		System.out.println("x="+x);//��ӡx=3
	}
	public static void show(int x)
	{
		x=4;
		return;
	}
}

*/
//�����������Ͳ�������
class Demo
{
	int x=3;
	public static void main(String[] args)
	{
		Demo d=new Demo();//����һ�������Demo class Demo x=3
		d.x=9;//��ֵDemo.x=9
		show(d);//�Ѷ����Demo���ݸ��������d ���Һ�����d.x=4  ���ǵĲ�������ָ�����Ŀ��ַ 
		System.out.println(d.x);//��ӡ��4

	}
	public static void show (Demo d)
	{
		d.x=4;
	}
}
