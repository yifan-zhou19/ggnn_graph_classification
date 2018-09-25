package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int e;
		int n;
		int k;
		int t;
		int m = 1;
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
		for (k = 1;k <= n;k++)
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
			a[i] = 2 * (sz[i] / 2);
			if (a[i] != sz[i])
			{
				b[m] = sz[i];
				t = m;
				m = m + 1;
			}
		}
		for (m = 1;m < t;m++)
		{
			System.out.printf("%d,",b[m]);
		}
		System.out.printf("%d",b[t]);
		return 0;
	}


}

