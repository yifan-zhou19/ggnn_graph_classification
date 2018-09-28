package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int ans;
	int i;
	int j;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	while (k-- != 0)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	ans = 0;
	for (i = 1;i <= n;i++)
	{
	if (i == 1 || i == n)
	{
	for (j = 1;j <= m;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		ans += x;
	}
	}
	else
	{
	for (j = 1;j <= m;j++)
	{
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x = Integer.parseInt(tempVar5);
		}
		if (j == 1 || j == m)
		{
			ans += x;
		}
	}
	}
	}
	System.out.printf("%d\n",ans);
	}
	return 0;
	}
}

