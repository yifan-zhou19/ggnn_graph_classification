package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[500];
	int e;
	int k;
	int i;
	int m;
	int n;
	int x;
	int a;
	int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (n = 1;n <= m;n++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if (a % 2 != 0)
		{
			sum += 1;
			sz[sum - 1] = a;
		}
	}
	for (k = 1;k <= sum;k++)
	{
		for (i = 0;i < sum - k;i++)
		{
				if (sz[i] > sz[i + 1])
				{
						e = sz[i + 1];
						sz[i + 1] = sz[i];
						sz[i] = e;
				}
		}
	}
	for (x = 1;x <= sum - 1;x++)
	{
		System.out.printf("%d,",sz[x - 1]);
	}
	System.out.printf("%d",sz[sum - 1]);
		return 0;
	}
}

