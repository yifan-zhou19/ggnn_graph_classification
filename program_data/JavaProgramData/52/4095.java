package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] sz = new int[102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
			sz[0] = 0;
			sz[n + 1] = 0;
		}
		for (j = 0;j < m;j++)
		{
			for (i = n + 1;i > 0;i--)
			{
				sz[i] = sz[i - 1];
			}
				sz[1] = sz[n + 1];
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",sz[i]);
		}
		System.out.printf("%d",sz[n]);
		return 0;
	}

}

