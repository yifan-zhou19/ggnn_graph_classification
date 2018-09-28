package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int x;
	int y;
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= 2;i++)
	{
		if (i = 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
		}
		if (i = 2)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
		}
		if (a > b)
		{
			x = a;
			y = b;
		}
		if (a < b)
		{
			x = b;
			y = a;
		}
	}
	for (i = 3;i <= n;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	if (c > x)
	{
		y = x;
		x = c;
	}
	if (x > c && c > y)
	{
		y = c;
	}
	}
	System.out.printf("%d\n""%d\n",x,y);
	return 0;
	}
}

