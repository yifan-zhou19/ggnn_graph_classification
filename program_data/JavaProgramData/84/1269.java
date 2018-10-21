package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int i;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead("\n");
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	i = 2;
	if (a < b)
	{
		m = a;
		a = b;
		b = m;
	}
	while (i < n)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Integer.parseInt(tempVar4);
		}
		i += 1;
		if (c >= a)
		{
			b = a;
			a = c;
		}
		else if (c >= b)
		{
			b = c;
		}
	}
	System.out.printf("%d\n%d\n",a,b);
		return 0;
	}
}

