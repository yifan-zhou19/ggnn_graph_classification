package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
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
		int[][] xj = new int[50][9];
		xj[4][4] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					xj[i + k * 9][j] += xj[i + (k - 1) * 9][j] * 2;
					xj[i - 1 + k * 9][j - 1] += xj[i + (k - 1) * 9][j];
					xj[i - 1 + k * 9][j] += xj[i + (k - 1) * 9][j];
					xj[i - 1 + k * 9][j + 1] += xj[i + (k - 1) * 9][j];
					xj[i + k * 9][j - 1] += xj[i + (k - 1) * 9][j];
					xj[i + k * 9][j + 1] += xj[i + (k - 1) * 9][j];
					xj[i + 1 + k * 9][j - 1] += xj[i + (k - 1) * 9][j];
					xj[i + 1 + k * 9][j] += xj[i + (k - 1) * 9][j];
					xj[i + 1 + k * 9][j + 1] += xj[i + (k - 1) * 9][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			System.out.printf("%d %d %d %d %d %d %d %d %d\n",xj[i + 9 * n][0],xj[i + 9 * n][1],xj[i + 9 * n][2],xj[i + 9 * n][3],xj[i + 9 * n][4],xj[i + 9 * n][5],xj[i + 9 * n][6],xj[i + 9 * n][7],xj[i + 9 * n][8]);
		}
		return 0;
	}

}

