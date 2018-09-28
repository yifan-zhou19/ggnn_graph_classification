package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int maxlndex;
		int e;
		int i;
		int k;
		int n;
		int t = 0;
		int[] sz = new int[500];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (k = 1;k < n + 1; k++)
		{
		maxlndex = 0;
		for (i = 0;i < n - k + 1;i++)
		{
			if (sz[i] > sz[maxlndex])
			{
				maxlndex = i;
			}
		}

		if (maxlndex != n - k)
		{
			e = sz[maxlndex];
			sz[maxlndex] = sz[n - k];
			sz[n - k] = e;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				t = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				if (i != t)
				{
				System.out.printf("%d,",sz[i]);
				}
			else
			{
				System.out.printf("%d",sz[i]);
			}
			}
		}
		return 0;
	}
}

