package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 99;i++)
		{
			sz[i] = 0;
		}
		sz[99] = 1;
		for (j = 1;j <= n;j++)
		{
			for (i = 0;i < 100;i++)
			{
				sz[i] = sz[i] * 2;
			}
			for (i = 0;i < 100;i++)
			{
				if (sz[i] >= 10)
				{
					sz[i] = sz[i] - 10;
					sz[i - 1] = sz[i - 1] + 1;
				}
			}
		}

		for (i = 0;i < 100;i++)
		{
			if (sz[i] != 0)
			{
				for (j = i;j < 100;j++)
				{
					System.out.printf("%d",sz[j]);
				}
				break;
			}
		}
		return 0;
	}
}

