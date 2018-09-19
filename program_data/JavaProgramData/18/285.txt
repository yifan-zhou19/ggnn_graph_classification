package <missing>;

public class GlobalMembers
{
	public static void guiling(int[][] a, int n)
	{
		int i;
		int j;
		int min;
		for (i = 0;i <= n;i++)
		{
			min = a[i][0];
			for (j = 0;j <= n;j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0;j <= n;j++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
		for (j = 0;j <= n;j++)
		{
			min = a[0][j];
			for (i = 0;i <= n;i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 0;i <= n;i++)
			{
				a[i][j] = a[i][j] - min;
			}
		}
	}
	public static void shanchu(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 0;i <= n;i++)
		{
			for (j = 1;j < n;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0;j <= (n - 1);j++)
		{
			for (i = 1;i < n;i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static int Main()
	{
		int[][][] a = new int[100][100][100];
		int i;
		int j;
		int k;
		int sum;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i][j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			for (j = n - 1;j >= 1;j--)
			{
				guiling(a[i], j);
				sum = sum + a[i][1][1];
				shanchu(a[i], j);
			}
			System.out.printf("%d\n",sum);
		}
	}
}

