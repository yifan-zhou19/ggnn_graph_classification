package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int g;
		int i;
		int c;
		int[][] a = new int[20][20];
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
		for (k = 0;k <= m - 1;k++)
		{
			for (g = 0;g <= n - 1;g++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k][g] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (c = 0;c <= n - 1;c++)
			{
				if (i == 0 && c == 0)
				{
					if (a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c + 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (i == 0 && c != 0 && c != n - 1)
				{
					if (a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c - 1] != 0 && a[i][c] >= a[i][c + 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (i == 0 && c == n - 1)
				{
					if (a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c - 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (i != 0 && i != m - 1 && c == 0)
				{
					if (a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c + 1] != 0 && a[i][c] >= a[i - 1][c])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (i == m - 1 && c == 0)
				{
					if (a[i][c] >= a[i - 1][c] != 0 && a[i][c] >= a[i][c + 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (i == m - 1 && c != 0 && c != n - 1)
				{
					if (a[i][c] >= a[i - 1][c] != 0 && a[i][c] >= a[i][c + 1] != 0 && a[i][c] >= a[i][c - 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (c == n - 1 && i != 0 && i != m - 1)
				{
					if (a[i][c] >= a[i - 1][c] != 0 && a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c - 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (c == n - 1 && i == m - 1)
				{
					if (a[i][c] >= a[i - 1][c] != 0 && a[i][c] >= a[i][c - 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
				if (c != 0 && c != n - 1 && i != 0 && i != m - 1)
				{
					if (a[i][c] >= a[i - 1][c] != 0 && a[i][c] >= a[i + 1][c] != 0 && a[i][c] >= a[i][c - 1] != 0 && a[i][c] >= a[i][c + 1])
					{
						System.out.printf("%d %d\n",i,c);
					}
				}
			}
		}
		return 0;
	}

}

