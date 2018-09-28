package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if ((n > 1) && (n < 100))
		{
			for (i = 0;i < n;i++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			}
		}
		int e;
		int k;
		int j;
		for (k = 1;k < n;k++)
		{
			for (j = 0;j < (n - k);j++)
			{
				if (sz[j] > sz[j + 1])
				{
					e = sz[j + 1];
						 sz[j + 1] = sz[j];
					sz[j] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",sz[n - 1],sz[n - 2]);
		return 0;
	}

}

