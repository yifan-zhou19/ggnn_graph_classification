package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[100];
		int max;
		int max1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		}
		max = max1 = sz[0];
			for (i = 0; i < n; i++)
			{
				if (sz[i] > max)
				{
				max = sz[i];
				}
			}
			for (i = 0; i < n; i++)
			{
				if (sz[i] < max && sz[i]> max1)
				{
				max1 = sz[i];
				}
			}
		System.out.printf("%d\n%d", max, max1);
		return 0;
	}
}

