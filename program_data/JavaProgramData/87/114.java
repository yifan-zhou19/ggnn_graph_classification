package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[5];
		int n = 43201;
		int i;
		int m = 0;
		int[] sz1 = new int[100];
		int a = 1;
		while (a > 0)
		{
			for (i = 0;i < 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i] = Integer.parseInt(tempVar);
				}
			}
			if (sz[0] != 0)
			{
				n = 60 * 60 * (12 + sz[3] - sz[0]) + 60 * (sz[4] - sz[1]) + sz[5] - sz[2];
				sz1[m] = n;
				m = m + 1;
			}
			else
			{
				a = 0;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d\n",sz1[i]);
		}
		System.out.printf("%d",sz1[m - 1]);
		return 0;
	}
}

