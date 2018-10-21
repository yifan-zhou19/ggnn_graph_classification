package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int e;
	int k;
	int h;
	int m = 0;
	int[] sz = new int[501];
	int[] b = new int[501];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		if (sz[i] % 2 != 0)
		{
		 b[m] = sz[i];
		 m++;
		}
	}
	for (k = 1;k <= m;k++)
	{
		for (j = 0;j < k;j++)
		{
			if (b[j] >= b[k])
			{
				e = b[j];
				b[j] = b[k];
				b[k] = e;
			}
		}
	}
	for (h = 1;h <= m - 1;h++)
	{
		System.out.printf("%d,",b[h]);
	}
	System.out.printf("%d",b[m]);
	return 0;
	}

}

