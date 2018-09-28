package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int t;
		int i;
		int j;
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
		for (t = 0;t < x1 * y1;t++)
		{
			i = t / y1;
			j = t % y1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
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
		for (t = 0;t < x2 * y2;t++)
		{
			i = t / y2;
			j = t % y2;
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i][j] = Integer.parseInt(tempVar6);
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				c[i][j] = 0;
				int q;
				int t;
				for (q = 0;q < y1;q++)
				{
					t = a[i][q] * b[q][j];
					c[i][j] += t;
				}
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

