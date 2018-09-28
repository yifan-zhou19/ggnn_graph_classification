package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[500][500];
		int[][] b = new int[500][500];
		int[][] c = new int[500][500];
		int h;
		int j;
		int k;
		int x1;
		int y1;
		int x2;
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
		for (h = 0;h < x1;h++)
		{
			for (j = 0;j < y1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[h][j] = Integer.parseInt(tempVar3);
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
		for (h = 0;h < x2;h++)
		{
			for (j = 0;j < y2;j++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[h][j] = Integer.parseInt(tempVar6);
			}
			}
		}
		for (h = 0;h < x1;h++)
		{
			for (j = 0;j < y2;j++)
			{
				c[h][j] = 0;
				for (k = 0;k < y1;k++)
				{
					c[h][j] = c[h][j] + a[h][k] * b[k][j];
				}
				if (j == y2 - 1)
				{
				System.out.printf("%d\n",c[h][j]);
				}
				else
				{
				System.out.printf("%d ",c[h][j]);
				}
			}
		}
	}
}

