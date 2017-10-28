class BreakContinue1028 
{
	public static void main(String[] args) 
	{
		/*
		break:跳出。
		break作用的范围 必须用在switch语句或者循环语句
		可以用if控制什么时候跳
		*/
		job:for (int x=0;x<3 ;x++ )
		{
			tom:for (int y=0;y<4 ;y++ )
			{
				System.out.println("Hello  feiji");
				break job ;//可以给for循环命名 然后直接跳出指定的循环
			}
		}
		System.out.println("Hello World!");
		//break；报错。break作用的范围 必须用在switch语句或者循环语句
	
	
	/*continue：继续
	作用：结束本次循环，继续下次循环。
		作用的范围：循环结构。

		*/
			job2:for (int x=0;x<3 ;x++ )
			{
				tom2:for (int y=0;y<4 ;y++ )
				{
					System.out.println("Hello  faker");
					//break ;//continue job2;//相当于跳到了job2再继续；break job2相当于跳出job2 job2循环结束
				}
				
				
			
			}
			int a ;
			a=0%5;//小于5的模5还等于本身
			System.out.println(a);

	
	}
}
