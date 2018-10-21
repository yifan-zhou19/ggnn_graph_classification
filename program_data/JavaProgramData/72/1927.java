package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int x;
		int y;
		int i;
		int k;
		int[][] z = new int[m + 2][n + 2];
		for (i = 0;i < m + 2;i++)
		{
		for (k = 0;k < n + 2;k++)
		{
			z[i][k] = 0;
		}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (k = 1;k < n + 1;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(z[i][k]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
		for (k = 1;k < n + 1;k++)
		{
		if (z[i][k] >= z[i - 1][k] != 0 && z[i][k] >= z[i + 1][k] != 0 && z[i][k] >= z[i][k - 1] != 0 && z[i][k] >= z[i][k + 1])
		{
		System.out.printf("%d %d\n",i - 1,k - 1);
		}
		}
		}
		return 0;
	}

}

