package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		int[] sz = new int[501];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1;k <= N;k++)
		{
			for (int i = 0;i < N - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		int flag = 0;
		for (int i = 0;i < N;i++)
		{
			if (sz[i] % 2 != 0)
			{
				if (flag == 0)
				{
					System.out.printf("%d",sz[i]);
					flag = 1;
				}
				else
				{
					System.out.printf(",%d", sz[i]);
				}
			}
		}
		return 0;
	}

}

