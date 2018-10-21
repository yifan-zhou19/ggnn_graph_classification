package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int d;
	int e;
	int i;
	i = 1;
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
			b = Integer.parseInt(tempVar2);
		}
	if (i == 1)
	{
	c = b;
	d = b;
	}
		if (b > c)
		{
	e = c;
	c = b;
	if (e > d)
	{
	d = e;
	}
		}
	else if (b > d)
	{
	d = b;
	}
	i = i + 1;
	}
	System.out.printf("%d\n%d\n",c,d);

	return 0;
	}


}

