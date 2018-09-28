package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] sz = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int e;
		int d;
		d = 0;
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= N;j++)
		{
			for (i = 0;i < N - j;i++)
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
				d = i;
				break;
			}
		}
		System.out.printf("%d",sz[d]);
		for (i = d + 1;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
				System.out.printf(",%d",sz[i]);
			}
		}
		return 0;
	}
}

