package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[300];
		int i;
		int sj;
		int j;
		int m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sj = Integer.parseInt(tempVar2);
			}
			int pd = 0;
			for (j = 0;j < m;j++)
			{
				if (sj == sz[j])
				{
					pd = pd + 1;
				}
			}
			if (pd == 0)
			{
				sz[m] = sj;
				m = m + 1;
			}
		}
		for (int k = 0;k < m - 1;k++)
		{
			System.out.printf("%d,",sz[k]);
		}
		System.out.printf("%d",sz[m - 1]);
		return 0;
	}


}

