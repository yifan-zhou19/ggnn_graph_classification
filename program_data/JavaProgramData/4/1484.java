package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i = 0;
		int[][] an = new int[100][100];
		int j = 0;
		int k = 0;
		int s = 0;
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
					an[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < n + m - 1;k++)
		{
			if (n < m)
			{
				if (k < m - 1)
				{
					for (i = 0, j = 0;i < n && j <= k;i++, j++)
					{
						System.out.printf("%d\n",an[i][k - j]);
					}
				}
				else if (k >= m - 1)
				{
					for (i = m - 1,j = k - m + 1;j < n;i--,j++)
					{
						System.out.printf("%d\n",an[j][i]);
					}
				}
			}
			else
			{
				if (k < m - 1)
				{
					for (i = 0, j = 0;i < m && j <= k;i++, j++)
					{
						System.out.printf("%d\n",an[i][k - j]);
					}
				}
				else if (k >= m - 1)
				{
					for (i = m - 1, j = k - m + 1;i >= 0 && j < n;i--, j++)
					{
						System.out.printf("%d\n",an[j][i]);
					}
				}
			}
		}
		return 0;
	}
}

