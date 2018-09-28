package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		int e;
		int[] sz = new int[LEN];

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
		}

		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 0)
			{
				sz[i] = 0;
			}
		}

		for (x = 0;x < n;x++)
		{
			for (i = 0;i < n - x;i++)
			{
				if (sz[i] >= sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				continue;
			}
			System.out.printf("%d,",sz[i]);
		}
	System.out.printf("%d",sz[n]);
		return 0;
	}

}

