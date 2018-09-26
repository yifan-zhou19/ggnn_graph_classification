package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	t = 1;
	b = 0;
	c = 0;
	while (t <= n)
	{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				if (a >= b)
				{
						 c = b;
						 b = a;
						 t = t + 1;
				}
				else if ((a < b) && (a >= c))
				{
					 c = a;
					 t = t + 1;
				}
				else
				{
					 t = t + 1;
				}

	}
				System.out.printf("%d\n%d",b,c);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}
				return 0;
	}


}

