package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int a,b,c;
	//	}
	//	student_1;
		int x;
		int i = 0;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		int c1 = 0;
		int c2 = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student_1.a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student_1.b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student_1.c = tempVar4;
			}
			x = student_1.b + student_1.c;
				if (x > a2)
				{
					c1 = b1;
					c2 = b2;
					b1 = a1;
					b2 = a2;
					a1 = student_1.a;
					a2 = x;
				}
				else if (x == a2)
				{
					if (x > b2)
					{
						c1 = b1;
						c2 = b2;
						b1 = student_1.a;
						b2 = x;
					}
					else if (x > c2)
					{
						c1 = student_1.a;
						c2 = x;
					}
				}
				else if (x > b2)
				{
					c1 = b1;
					c2 = b2;
					b1 = student_1.a;
					b2 = x;
				}
				else if (x == b2)
				{
					if (x > c2)
					{
						c1 = student_1.a;
						c2 = x;
					}
				}
				else if (x > c2)
				{
					c1 = student_1.a;
					c2 = x;
				}
			i++;
		}
		System.out.printf("%d %d\n",a1,a2);
		System.out.printf("%d %d\n",b1,b2);
		System.out.printf("%d %d\n",c1,c2);
	}
}

