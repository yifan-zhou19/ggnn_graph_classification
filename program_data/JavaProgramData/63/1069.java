package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110];
		int[][] b = new int[110][110];
		int[][] c =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int x;
		int y;
		int z;
		int i = 0;
		int j = 0;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= x - 1;i++)
		{
			for (j = 0;j <= y - 1;j++)
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
			y = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			z = Integer.parseInt(tempVar5);
		}
		for (i = 0;i <= y - 1;i++)
		{
			for (j = 0;j <= z - 1;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		if (z == 1)
		{
			for (i = 0;i <= x - 1;i++)
			{
				for (j = 0;j <= y - 1;j++)
				{
					c[i][0] = c[i][0] + a[i][j] * b[j][0];
				}
				System.out.printf("%d\n",c[i][0]);
			}
		}
		if (z != 1)
		{
			for (i = 0;i <= x - 1;i++)
			{
				for (j = 0;j <= z - 2;j++)
				{
					for (k = 0;k <= y - 1;k++)
					{
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
					System.out.printf("%d ",c[i][j]);
				}
				if (j == z - 1)
				{
					for (t = 0;t <= y - 1;t++)
					{
						c[i][j] = c[i][j] + a[i][t] * b[t][j];
					}
					System.out.printf("%d\n",c[i][j]);
				}
			}
		}
	}

}

