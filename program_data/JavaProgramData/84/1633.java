package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b = 0;
	int c = 0;
	int d;
	int e;
	int i = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	while (i <= a)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}
		if (b <= d)
		{
			e = b;
			b = d;
		}
		if (b > d)
		{
			if (c < d)
			{
			c = d;
			}

		}
		i++;
	}
	if (e > c)
	{
		c = e;
	}
	System.out.printf("%d\n%d\n",b,c);
	return 0;
	}
}

