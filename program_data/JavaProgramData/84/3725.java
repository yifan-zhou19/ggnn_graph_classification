package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int x;
	int max;
	int cmax;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	if (a >= b)
	{
		max = a;
	cmax = b;
	}
	else
	{
		max = b;
	cmax = a;
	}
	i = 1;
	while (i <= n - 2)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		i = i + 1;
		if (x >= cmax != 0 && x >= max)
		{
			cmax = max;
		max = x;
		}

	else
	{
		if (x <= cmax != 0 && x <= max)
		{
			max = max;
		cmax = cmax;
		}
		else
		{
			cmax = x;
		max = max;
		}
	}
	}
	System.out.printf("%d\n%d\n",max,cmax);
	return 0;
	}

}

