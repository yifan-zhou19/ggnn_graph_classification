package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int n;
		int i;
		int e;
		int k;
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
		for (k = n;k > 1;k--)
		{
			for (i = 0;i < k - 1;i++)
			{
				if (sz[i] < sz[i + 1])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}
		System.out.printf("%d\n%d\n",sz[0],sz[1]);
		return 0;
	}

}

