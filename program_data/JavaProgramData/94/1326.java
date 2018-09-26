package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[501];
		int i = 0;
		int j = 0;
		int e;
		int k = 1;
		int m;
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
			sz[i] = Integer.parseInt(tempVar2);
		}
		}
		for (k = 0;k <= N;k++)
		{
			for (j = 0;j < N;j++)
			{
				if (sz[j] > sz[j + 1])
				{
				e = sz[j + 1];
				sz[j + 1] = sz[j];
				sz[j] = e;
				}
			}
		}
		m = 0;
		for (j = 0;j <= N;j++)
		{
			if (sz[j] % 2 == 1)
			{
				if (m == 0)
				{
					System.out.printf("%d",sz[j]);
				}
				else
				{
				System.out.printf(",%d",sz[j]);
				}
			m++;
			}
		}
	return 0;
	}
}

