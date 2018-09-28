package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[] sz = new int[100];
	for (int i = m;i <= n - 1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar3);
		}
	}
	for (int j = 0;j <= m - 1;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(sz[j]) = Integer.parseInt(tempVar4);
		}
	}
	for (int p = 0;p <= n - 1;p++)
	{
		if (p == n - 1)
		{
			System.out.printf("%d",sz[p]);
		}
		else
		{
			System.out.printf("%d ",sz[p]);
		}
	}
	return 0;
	}
}

