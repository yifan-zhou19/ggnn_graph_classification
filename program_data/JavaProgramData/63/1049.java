package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[105][105];
		int[][] b = new int[105][105];
		int ax;
		int ay;
		int bx;
		int by;
		int i;
		int j;
		int m;
		int[][] c = new int[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ax = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ay = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < ax;i++)
		{
			for (j = 0;j < ay;j++)
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
			bx = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			by = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < bx;i++)
		{
			for (j = 0;j < by;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (i = 0;i < ax;i++)
		{
			for (j = 0;j < by;j++)
			{
				for (m = 0;m < ay;m++)
				{
					c[i][j] += a[i][m] * b[m][j];
				}
				System.out.printf("%d",c[i][j]);
				if (by - 1 - j != 0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}


}

