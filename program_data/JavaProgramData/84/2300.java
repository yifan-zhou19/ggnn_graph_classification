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
		int[] sz = new int[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int maxIndex;
		int e;
	for (int k = 1 ; k <= n; k++)
	{
		maxIndex = 0;
		for (int i = 0; i <= n - k; i++)
		{
				if (sz[i] > sz[maxIndex])
				{
						maxIndex = i;
				}
		}
		if (maxIndex != n - k)
		{
			e = sz[maxIndex];
			sz[maxIndex] = sz[n - k];
			sz[n - k] = e;
		}
	}
	 System.out.printf("%d\n",sz[n - 1]);
			System.out.printf("%d\n",sz[n - 2]);
		return 0;
	}

}

