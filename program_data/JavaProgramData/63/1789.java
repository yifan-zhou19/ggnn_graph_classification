package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
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
		for (int i = 1;i <= x1;i++)
		{
			for (int j = 1;j <= y1;j++)
			{
				if (j != y1)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i][j] = Integer.parseInt(tempVar3);
					}
				}
				else
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			x2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			y2 = Integer.parseInt(tempVar6);
		}
		for (int i = 1;i <= x2;i++)
		{
			for (int j = 1;j <= y2;j++)
			{
				if (j != y2)
				{
					String tempVar7 = ConsoleInput.scanfRead();
					if (tempVar7 != null)
					{
						b[i][j] = Integer.parseInt(tempVar7);
					}
				}
				else
				{
					String tempVar8 = ConsoleInput.scanfRead();
					if (tempVar8 != null)
					{
						b[i][j] = Integer.parseInt(tempVar8);
					}
				}
			}
		}
		for (int i = 1;i <= x1;i++)
		{
			for (int j = 1;j <= y2;j++)
			{
				c[i][j] = 0;
			}
		}
		for (int i = 1;i <= x1;i++)
		{
			for (int j = 1;j <= y2;j++)
			{
				for (int k = 1;k <= y1;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 1;i <= x1;i++)
		{
			for (int j = 1;j <= y2;j++)
			{
				if (j != y2)
				{
					System.out.printf("%d ",c[i][j]);
				}
				else
				{
					System.out.printf("%d\n",c[i][j]);
				}
			}
		}
		return 0;
	}
}

