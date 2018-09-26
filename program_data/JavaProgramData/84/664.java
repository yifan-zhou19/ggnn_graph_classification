package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int count = 0;
	int a;
	int b;
	int c;
	int n;
	int i = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	b = 0;
	c = 0;
	while (i <= n)
	{
		i++;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a >= b)
		{
			c = b,b = a;
		}
		if (a > c && a < b)
		{
			c = a;
		}
	}
	System.out.printf("%d\n",b);
	System.out.printf("%d\n",c);
	return 0;
	}
}

