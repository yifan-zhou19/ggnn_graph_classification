package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[99];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int max;
		int e;
		max = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (sz[i] > sz[max])
			{
				max = i;
			}
		}
		if (max != n - 1)
		{
			e = sz[max];
			sz[max] = sz[n - 1];
			sz[n - 1] = e;
		}
		max = 0;
		for (i = 0;i <= n - 2;i++)
		{
			if (sz[i] > sz[max])
			{
				max = i;
			}
		}
		if (max != n - 2)
		{
			e = sz[max];
			sz[max] = sz[n - 2];
			sz[n - 2] = e;
		}
		System.out.printf("%d\n",sz[n - 1]);
		System.out.printf("%d\n",sz[n - 2]);
		return 0;
	}
}

