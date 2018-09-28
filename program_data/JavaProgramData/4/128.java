package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		int k;
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
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			for (k = 0;;k++)
			{
				if (k >= n != 0 || j - k < 0)
				{
					break;
				}
				else
				{
					System.out.printf("%d\n",sz[k][j - k]);
				}
			}
		}
		for (i = 1;i < n;i++)
		{
			for (k = 0;;k++)
			{
				if (i + k > n - 1 || m - 1 - k < 0)
				{
					break;
				}
				else
				{
					System.out.printf("%d\n",sz[i + k][m - 1 - k]);
				}
			}
		}
		return 0;
	}

}

