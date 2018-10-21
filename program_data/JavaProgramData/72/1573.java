package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[25][25];
		int m;
		int n;
		int i = 0;
		int t = 0;
		int x = 0;
		int y = 0;
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
		for (i = 0;i < (n + 2);i++)
		{
			a[0][i] = a[m + 1][i] = 0;
		}
		for (i = 0;i < (m + 2);i++)
		{
			a[i][0] = a[i][n + 1] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (t = 1;t <= n;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][t] = Integer.parseInt(tempVar3);
				}
			}

		}
		for (i = 1;i <= m;i++)
		{
			for (t = 1;t <= n;t++)
			{
				if (a[i][t] >= a[i - 1][t] != 0 && a[i][t] >= a[i + 1][t] != 0 && a[i][t] >= a[i][t - 1] != 0 && a[i][t] >= a[i][t + 1])
				{
					x = i - 1;
					y = t - 1;
					System.out.printf("%d %d\n",x,y);
				}
			}
		}
		return 0;

	}
}

