package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[1000][1000];
		int[][] b = new int[1000][2];
		int i;
		int j;
		int x = 0;
		int e;
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
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			for (j = 0;j <= n + 1;j++)
			{
				a[0][j] = a[m + 1][j] = a[i][0] = a[0][n + 1] = 0;
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
				{
					b[x][0] = i - 1;
					b[x][1] = j - 1;
					x++;
				}

			}
		}

		for (i = 0;i < x;i++)
		{
			System.out.printf("%d %d\n",b[i][0],b[i][1]);
		}
	}
}

