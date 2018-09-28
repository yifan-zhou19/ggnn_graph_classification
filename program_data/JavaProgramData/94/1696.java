package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int k;
		int i;
		int n;
		int m = 1;
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

		for (k = 1;k < n + 1;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				if (m == 1)
				{
				System.out.printf("%d",sz[i]);
				}
				else
				{
					System.out.printf(",%d",sz[i]);
				}
			m = m + 1;
			}
		}
		return 0;
	}
}

