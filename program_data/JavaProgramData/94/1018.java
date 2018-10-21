package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz1 = new int[500];
		int[] sz2 = new int[500];
		int i;
		int j;
		int k;
		int e;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		j = 0;
		sz2[500] = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (sz1[i] % 2 != 0)
			{
				sz2[j] = sz1[i];
				j++;
				m = m + 1;
			}
		}
		for (k = 1;k <= m - 1;k++)
		{
			for (j = 0;j <= m - k - 1;j++)
			{
				if (sz2[j] > sz2[j + 1])
				{
					e = sz2[j + 1];
					sz2[j + 1] = sz2[j];
					sz2[j] = e;
				}
			}
		}
		for (j = 0;j <= m - 1;j++)
		{
			if (j == m - 1)
			{
				System.out.printf("%d",sz2[j]);
			}
			else
			{
				System.out.printf("%d,",sz2[j]);
			}
		}
		return 0;
	}

}

