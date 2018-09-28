package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105];
	public static int[][] b = new int[105][105];
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int x;
		int y;
		int c;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y1 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		if (x1 > x2)
		{
			x = x1;
		}
		else
		{
			x = x2;
		}
		if (y1 > y2)
		{
			y = y1;
		}
		else
		{
			y = y2;
		}
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				c = 0;
				for (k = 0;k < y1;k++)
				{
					c = c + a[i][k] * b[k][j];
				}
				if (i < x1 && j < y2)
				{
					if (j == 0)
					{
						System.out.printf("%d",c);
					}
					else
					{
						System.out.printf(" %d",c);
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

