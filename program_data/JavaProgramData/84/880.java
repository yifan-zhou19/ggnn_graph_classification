package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int n;
		int i;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (int k = 1;k <= n;k++)
		{
			for (i = 1;i <= k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",sz[n],sz[n - 1]);
		return 0;
	}
}

