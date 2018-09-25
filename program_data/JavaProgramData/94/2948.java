package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s;
		int maxIndex;
		int N;
		int e;
		int m;
		int[] sz = new int[500];
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
		for (k = 1;k <= N;k++)
		{
			maxIndex = 0;
			for (j = 0;j <= N - k;j++)
			{
				if (sz[j] > sz[maxIndex])
				{
						maxIndex = j;
				}
			}
			if (maxIndex != N - k)
			{
			e = sz[maxIndex];
			sz[maxIndex] = sz[N - k];
			sz[N - k] = e;
			}
		}
		for (s = 0;s < N;s++)
		{
			if (sz[s] % 2 != 0)
			{
				System.out.printf("%d",sz[s]);
				break;
			}
		}
		for (m = s + 1;m < N;m++)
		{
			if (sz[m] % 2 != 0)
			{
				System.out.printf(",%d",sz[m]);
			}
		}
			return 0;
	}

}

