package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int t;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = x;i < 100;i++)
		{
		sz[i] = 0;
		}
		for (j = 0;j < 99;j++)
		{
			for (i = 0;i < 99 - j;i++)
			{
				if (sz[i] > sz[i + 1])
				{
			t = sz[i];
			sz[i] = sz[i + 1];
			sz[i + 1] = t;
				}
			}
		}
			System.out.printf("%d\n%d\n",sz[99],sz[98]);
		return 0;
	}
}

