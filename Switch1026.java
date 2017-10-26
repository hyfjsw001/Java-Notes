class Switch1026 
{
	public static void main(String[] args) 
	{
		/*
		switch(表达式)
		{
			case 取值1；
			执行语句；
			break;
			case 取值2；
			执行语句；
			break;
			......
			default;
			执行语句；
			break；
		}//挨着{}的break可用省，中间的不能省，若省，中间的匹配就会执行者一条，因为没有break他会顺序执行下面的case下的执行语句（不判断了）直到遇到}

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
		
		}//case顺序可以乱，default可以放第一个，但是他还是会先执行其他case最后执行default
		*/
		
		int month=15;
		switch (month)
		{
		case 3:
		case 4:
		case 5://原理就是没有break，会继续执行而且不判断，遇到break或}才跳出来
			System.out.println(month+"月对应的是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month+"月对应的是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month+"月对应的是秋季");
			break;
		
		case 12:
			case 1:
			case 2:
			
		
			System.out.println(month+"月对应的是冬季");
			break;
		default:
				System.out.println(month+"月没有对应的季节");
		}
		
		System.out.println("Hello World!");
	}
}
