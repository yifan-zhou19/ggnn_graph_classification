package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] sf = new int[500];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				sf[k] = sz[i];
				k++;
			}
		}
		for (j = 1;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (sf[i] < sf[i + 1])
				{
					e = sf[i];
					sf[i] = sf[i + 1];
					sf[i + 1] = e;
				}
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			if (i > 0)
			{
				System.out.printf("%d,",sf[i]);
			}
			if (i == 0)
			{
				System.out.printf("%d",sf[i]);
			}
		}
		return 0;
	}
}

