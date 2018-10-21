package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][][] b = new int[5][11][11];
		int i;
		int j;
		int k;
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
		b[0][5][5] = m;
		for (i = 1;i < n + 1;i++)
		{
			for (j = 5 - i;j <= 5 + i;j++)
			{
				for (k = 5 - i;k <= 5 + i;k++)
				{
					b[i][j][k] = 2 * b[i - 1][j][k] + b[i - 1][j][k - 1] + b[i - 1][j][k + 1] + b[i - 1][j - 1][k - 1] + b[i - 1][j - 1][k + 1] + b[i - 1][j - 1][k] + b[i - 1][j + 1][k] + b[i - 1][j + 1][k - 1] + b[i - 1][j + 1][k + 1];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
		System.out.printf("%d",b[n][i][1]);
		for (j = 2;j < 10;j++)
		{
		System.out.printf(" %d",b[n][i][j]);
		}
		System.out.print("\n");
		}
	}


}

