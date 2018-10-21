package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[400];
		int j;
		int n;
		int m;
		int i;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			sz[200 + j] = sz[j];
		}

		for (i = 0;i < m;i++)
		{
			sz[i] = sz[200 + n - m + i];
		}
		for (i = 0;i < n - m;i++)
		{
			sz[m + i] = sz[200 + i];
		}

		System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",sz[i]);
		}
		return 0;
	}



}

