package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct line
	//	{
	//		 char x[10];
	//		 double y;
	//	};
		int n;
		int a;
		int b;
		int m;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		line p = (line)malloc(n * sizeof(line));
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				((p + a).x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				((p + a).y) = tempVar3;
			}
		}
		for (a = 0;a <= n - 2;a++)
		{
			if (*((p + a).x) == 'm')
			{
				for (b = a + 1;b <= n - 1;b++)
				{
					if (*((p + b).x) == 'm')
					{
						if (((p + b).y) < ((p + a).y))
						{
							c = (p + b).y;
							((p + b).y) = ((p + a).y);
							((p + a).y) = c;
						}
						else
						{
							;
						}
					}
					else
					{
						;
					}
				}
			}
			else
			{
				 for (b = a + 1;b <= n - 1;b++)
				 {
					if (*((p + b).x) == 'f')
					{
						if (((p + b).y) > ((p + a).y))
						{
							c = (p + b).y;
							((p + b).y) = ((p + a).y);
							((p + a).y) = c;
						}
						else
						{
							;
						}
					}
					else
					{
						;
					}
				 }
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			if (*((p + a).x) == 'm')
			{
			System.out.printf("%.2lf ",((p + a).y));
			}
			else
			{
				;
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			if (*((p + a).x) == 'f')
			{
			m = a;
			}
			else
			{
				;
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			if (*((p + a).x) == 'f')
			{
				if (a != m)
				{
				System.out.printf("%.2lf ",((p + a).y));
				}
				else
				{
				System.out.printf("%.2lf",((p + a).y));
				}
			}
			else
			{
				;
			}
		}
	}
}

