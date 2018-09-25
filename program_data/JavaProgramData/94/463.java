package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[1000];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int k = N - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
				m = i;
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (sz[i] % 2 != 0 && i < m)
			{
				System.out.printf("%d,",sz[i]);
			}
			if (i == m)
			{
				System.out.printf("%d",sz[m]);
			}
		}




		return 0;
	}






}

