package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[500];
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int e;
		int j;
		for (int p = 1;p <= N;p++)
		{
		   for (j = 0;j < N - p;j++)
		   {
				if (sz[j] > sz[j + 1])
				{
					e = sz[j + 1];
					sz[j + 1] = sz[j];
					sz[j] = e;
				}
		   }
		}
		int[] js = new int[500];
		int t = 0;
		j = 0;
		while (j < N)
		{
			if (sz[j] % 2 != 0)
			{
				js[t] = sz[j];
				t++;
			}
			j++;
		}
		for (int q = 0;q < t;q++)
		{
			if (q < t - 1)
			{
				System.out.printf("%d,",js[q]);
			}
			else
			{
				System.out.printf("%d",js[q]);
			}
		}
		return 0;
	}

}

