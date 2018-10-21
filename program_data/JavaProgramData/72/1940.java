package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[22][22];
		int d;
		int j;
		int x;
		int y;
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
		for (d = 1;d <= m;d++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[d][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j <= n + 1;j++)
		{
			  a[0][j] = 0;
			  a[m + 1][j] = 0;
		}
		for (d = 1;d <= m;d++)
		{
			  a[d][0] = 0;
			  a[d][n + 1] = 0;
		}
		for (d = 1;d <= m;d++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[d][j] >= a[d - 1][j] != 0 && a[d][j] >= a[d + 1][j] != 0 && a[d][j] >= a[d][j - 1] != 0 && a[d][j] >= a[d][j + 1])
				{
					x = d - 1;
					y = j - 1;
					System.out.printf("%d %d\n", x, y);
				}
			}
		}
		return 0;
	}



}

