package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] an = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int k;
		int s;
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
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					an[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		s = 0;
		for (k = 0;k < m / 2 && k < n / 2;k++)
		{
				for (i = k;i < m - k - 1;i++)
				{
					System.out.printf("%d\n",an[i][k]);
				}
				for (j = k;j < n - k - 1;j++)
				{
					System.out.printf("%d\n",an[m - k - 1][j]);
				}
				for (i = m - k - 1;i > k;i--)
				{
					System.out.printf("%d\n",an[i][n - k - 1]);
				}
				for (j = n - k - 1;j > k;j--)
				{
					System.out.printf("%d\n",an[k][j]);
				}
				s = s + 2 * (m + n - 4 * k - 2);
		}
		if (s != m * n)
		{
			if (m < n)
			{
				for (j = k;j < n - k;j++)
				{
					System.out.printf("%d\n",an[k][j]);
				}
			}
			if (m > n)
			{
				for (i = k;i < m - k;i++)
				{
					System.out.printf("%d\n",an[i][k]);
				}
			}
			if (m == n)
			{
				System.out.printf("%d\n",an[k][k]);
			}
		}
		return 0;
	}
}

