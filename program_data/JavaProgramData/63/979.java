package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int n;
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
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
		for (int i1 = 0;i1 <= x1 - 1;i1++)
		{
			for (int i2 = 0;i2 <= y1 - 1;i2++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i1][i2] = Integer.parseInt(tempVar3);
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
		for (int i3 = 0;i3 <= x2 - 1;i3++)
		{
			for (int i4 = 0;i4 <= y2 - 1;i4++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i3][i4] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (int i = 0;i <= x1 - 1;i++)
		{
			for (int j = 0;j <= y2 - 1;j++)
			{
				for (int k = 0;k <= x2 - 1;k++)
				{
					c[i][j] = a[i][k] * b[k][j] + c[i][j];
				}
			}
		}
		for (int q = 0;q <= x1 - 1;q++)
		{
			for (int w = 0;w <= y2 - 2;w++)
			{
				System.out.printf("%d ",c[q][w]);
			}
			System.out.printf("%d\n",c[q][y2 - 1]);
		}
		return 0;
	}

}

