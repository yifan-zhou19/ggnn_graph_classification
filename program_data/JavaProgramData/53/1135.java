package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		int[] sz = new int[300];
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
				sz[i] = Integer.parseInt(tempVar2);
			}

		}
		for (i = 0;i < n - m;i++)
		{
			for (j = i + 1;j < n - m;j++)
			{
				if (sz[j] == sz[i])
				{
					if (j == n - m)
					{
						m += 1;
					}
					else
					{
					for (k = j;k < n - m;k++)
					{

						sz[k] = sz[k + 1];
					}
					m += 1;
					}
					j -= 1;
				}
			}
		}
		for (i = 0;i < n - m - 1;i++)
		{

		System.out.printf("%d,",sz[i]);
		}
		System.out.printf("%d",sz[n - m - 1]);

		return 0;
	}

}

