package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int k = 0;
		int i = 0;
		int maxk = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] szsmall = new int[n];
		int[] szlarge = new int[n];
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				szlarge[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				szsmall[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (szsmall[i] <= 90 && szsmall[i] >= 60 && szlarge[i] <= 140 && szlarge[i] >= 90)
			{
				sz[i] = 1;
			}
			else
			{
				sz[i] = 0;
			}
		}
		while (true)
		{
			k = 0;
			for (i = m;i < n;i++)
			{
				if (sz[i] == 1)
				{
					k = k + 1;
					m = i + 1;
					if (k > maxk)
					{
						maxk = k;
					}
					if (m == n)
					{
						break;
					}
					if (sz[m] == 0)
					{
						break;
					}
				}
				else
				{
					continue;
				}
			}
			if (m == n || i == n)
			{
				break;
			}
		}
		System.out.printf("%d",maxk);
		return 0;
	}

}

