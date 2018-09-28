package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i1 = 0;
		int j1 = 0;
		int i2 = 0;
		int j2 = 0;

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
		for (i1 = 0;i1 < x1;i1++)
		{
			for (j1 = 0;j1 < y1;j1++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i1][j1] = Integer.parseInt(tempVar3);
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
		for (i2 = 0;i2 < x2;i2++)
		{
			for (j2 = 0;j2 < y2;j2++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[i2][j2] = Integer.parseInt(tempVar6);
				}
			}
		}

		for (i1 = 0;i1 < x1;i1++)
		{
			for (j2 = 0;j2 < y2;j2++)
			{
				c[i1][j2] = 0;
				for (j1 = 0;j1 < y1;j1++)
				{
				c[i1][j2] += a[i1][j1] * b[j1][j2];
				}
			}
		}
		for (i1 = 0;i1 < x1;i1++)
		{
			System.out.printf("%d",c[i1][0]);
			for (j2 = 1;j2 < y2;j2++)
			{
				System.out.printf(" %d",c[i1][j2]);
			}
			System.out.print("\n");
		}
	}
}

