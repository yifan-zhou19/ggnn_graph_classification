package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int m;
	int n;
	int i;
	int j;
	int l;
	int s;
	int x;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (l = 1;l <= k;l++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	s = 0;
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
	if (i == 1 || i == m | j == 1 || j == n)
	{
		s += x;
	}
		}
	}
	System.out.printf("%d\n",s);
	}
	return 0;
	}


}

