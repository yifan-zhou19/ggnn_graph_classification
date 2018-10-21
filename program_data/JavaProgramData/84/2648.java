package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int m;
		int[] sz = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		for (m = 0;m < i;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[m] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < 101;j++)
		{
			for (k = 0;k < 101;k++)
			{
				if (sz[k] < sz[k + 1])
				{
					t = sz[k];
					sz[k] = sz[k + 1];
					sz[k + 1] = t;
				}
			}
		}
		System.out.printf("%d\n%d\n",sz[0],sz[1]);
		return 0;
	}

}

