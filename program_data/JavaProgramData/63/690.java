package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x;
		int y;
		int i;
		int j;
		int k;
		int x1;
		int y1;
		int x2;
		int y2;
		for (k = 1;k <= 2;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			if (k == 1)
			{
				x1 = x,y1 = y;
			}
			if (k == 2)
			{
				x2 = x,y2 = y;
			}
			for (i = 0;i <= x - 1;i++)
			{
				for (j = 0;j <= y - 1;j++)
				{
					if (k == 1)
					{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							a[i][j] = Integer.parseInt(tempVar3);
						}
					}
					if (k == 2)
					{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							b[i][j] = Integer.parseInt(tempVar4);
						}
					}
				}
			}
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				c[i][j] = 0;
				for (k = 0;k <= y1 - 1;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (i = 0;i <= x1 - 1;i++)
		{
			for (j = 0;j <= y2 - 1;j++)
			{
				if (j == 0)
				{
					System.out.printf("%d",c[i][j]);
				}
				else
				{
					System.out.printf(" %d",c[i][j]);
				}
				if (j == y2 - 1)
				{
					System.out.print("\n");
				}
			}
		}
	}

}

