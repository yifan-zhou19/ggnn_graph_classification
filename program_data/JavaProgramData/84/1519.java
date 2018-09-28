package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= 2;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}
		System.out.printf("%d\n%d",sz[n - 1],sz[n - 2]);
		return 0;
	}

}

