package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int N;
		int i;
		int j;
		int k;
		int m;
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i < N;i++)
		{
		if (sz[i] % 2 != 0)
		{
			a = a + 1;
		}
		}
			for (j = N - 1;j >= 0;j--)
			{
				for (k = 0;k < j;k++)
				{
					if (sz[k] > sz[k + 1])
					{
			int t;
			t = sz[k + 1];
			sz[k + 1] = sz[k];
			sz[k] = t;
					}
				}
			}
		m = 0;
		for (n = 0;n < N;n++)
		{
			if (sz[n] % 2 != 0)
			{
				m++;
				if (m < a)
				{
				   System.out.printf("%d,",sz[n]);
				}
				else
				{
					System.out.printf("%d",sz[n]);
					break;
				}
			}
		}

		return 0;
	}


}

