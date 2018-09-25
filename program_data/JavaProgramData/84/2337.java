package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int max;
	int sed;
	int t;
	int j;
	int r;
	int m;
	int c;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		max = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sed = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c = Integer.parseInt(tempVar4);
	}
	j = 3;
	while (j <= n)
	{
		if (max < c)
		{
		t = max;
		max = c;
		c = t;
		}
		if (sed < c)
		{
		r = sed;
		sed = c;
		}
		j++;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			c = Integer.parseInt(tempVar5);
		}

	}
	if (max < sed)
	{
	m = max;
	max = sed;
	sed = m;
	}
	System.out.printf("%d\n%d\n",max,sed);
	return 0;
	}
}

