package <missing>;

public class GlobalMembers
{
	public static int comp(int center,int up,int left,int down,int right)
	{
		if ((center >= up) && (center >= left) && (center >= down) && (center >= right))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] a = new int[22][22];
		int m;
		int n;
		int i;
		int j;
		int k;
		int r;
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
		for (i = 0;i <= m + 1;i++)
		{
			a[i][0] = -1;
			a[i][n + 1] = -1;
		}
		for (i = 0;i <= n + 1;i++)
		{
			a[0][i] = -1;
			a[m + 1][i] = -1;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (r = 1;r < n + 1;r++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][r] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 1;j < m + 1;j++) //????????
		{
			for (k = 1;k < n + 1;k++)
			{
				if (comp(a[j][k], a[j - 1][k], a[j][k - 1], a[j + 1][k], a[j][k + 1]) != 0)
				{
					System.out.printf("%d %d\n",j - 1,k - 1);
				}
			}
		}
		return 0;
	}
}

