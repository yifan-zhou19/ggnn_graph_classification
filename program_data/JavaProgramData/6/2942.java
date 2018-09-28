package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int y;
		int[][] z = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			y = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (int j = 0;j < m;j++)
			{
				for (int t = 0;t < n;t++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						z[j][t] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (int a = 0;a < m;a++)
			{
				y = y + z[a][0] + z[a][n - 1];
			}
			for (int b = 0;b < n;b++)
			{
				y = y + z[0][b] + z[m - 1][b];
			}
					  y = y - z[0][0] - z[0][n - 1] - z[m - 1][0] - z[m - 1][n - 1];
			System.out.printf("%d\n",y);
		}
		return 0;
	}
}

