class  Test003
{
	public static void main(String[] args) 
	{
		//�������������л��� �������õ�����������
		int a=3,b=5;
		System.out.println("a="+a+",b="+b);
		/*�����õ��������������Բ���
		int c;
		c=a;
		a=b;
		b=c;
		*/
		//���ַ�ʽ��Ҫ�ã��������󣬻ᳬ��int��Χ����ǿ��ת�������Ȼ���
		/*���������ֱȽϺã��Ķ��ԱȽϺ�
		a=a+b;//a=3+5;a=8;
		b=a-b;//3+5-5=3;b=3;
		a=a-b;//3+5-3=5;c=5;
		*/

		//^��� �����ã��Ķ��Բ�
		a=a^b;//a=3^5;
		b=a^b;//b=(3^5)^5;b=3
		a=a^b;//a=(3^5)^3;a=5
		System.out.println("a="+a+",b="+b);
	}
}