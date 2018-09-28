package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
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
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
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
		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i][j] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				for (int t = 0;t < y1;t++)
				{
					c[i][j] += a[i][t] * b[t][j];
				}
			}
		}
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				System.out.printf("%d",c[i][j]);
				if (j != (y2 - 1))
				{
				System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

