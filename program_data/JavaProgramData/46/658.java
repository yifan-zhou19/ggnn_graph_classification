package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int min = 1;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (m > n)
		{
			min = n;
		}
		else
		{
			min = m;
		}
		for (i = 0;i < min;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > -1000)
				{
					System.out.printf("%d\n",a[i][j]);
					a[i][j] = -10000;
				}
				else
				{
					continue;
				}
			}
			for (j = 0;j < m;j++)
			{
				if (a[j][n - 1 - i] > -1000)
				{
					System.out.printf("%d\n",a[j][n - 1 - i]);
					a[j][n - 1 - i] = -10000;
				}
				else
				{
					continue;
				}
			}
			for (j = n - 1;j >= 0;j--)
			{
				if (a[m - 1 - i][j] > -1000)
				{
					System.out.printf("%d\n",a[m - 1 - i][j]);
					a[m - 1 - i][j] = -10000;
				}
				else
				{
					continue;
				}
			}
			for (j = m - 1;j >= 0;j--)
			{
				if (a[j][i] > -1000)
				{
					System.out.printf("%d\n",a[j][i]);
					a[j][i] = -10000;
				}
				else
				{
					continue;
				}
			}
		}
	}
}

