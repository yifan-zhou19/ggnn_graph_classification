package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[100][100];
		for (int i = 0;i <= x1 - 1;i++)
		{
			for (int j = 0;j <= y1 - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		int[][] b = new int[100][100];
		for (int k = 0;k <= x2 - 1;k++)
		{
			for (int l = 0;l <= y2 - 1;l++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[k][l] = Integer.parseInt(tempVar6);
				}
			}
		}
		int[][] c = new int[100][100];
		for (int m = 0;m <= x1 - 1;m++)
		{
			for (int n = 0;n <= y2 - 1;n++)
			{
				c[m][n] = 0;
				for (int o = 0;o <= x2 - 1;o++)
				{
					c[m][n] = c[m][n] + a[m][o] * b[o][n];
				}
			}
		}
		for (int p = 0;p <= x1 - 1;p++)
		{
			for (int q = 0;q <= y2 - 2;q++)
			{
				System.out.printf("%d ",c[p][q]);
			}
			System.out.printf("%d\n",c[p][y2 - 1]);
		}
		return 0;
	}
}

