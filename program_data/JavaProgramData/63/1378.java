package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int i1;
		int j1;
		int i2;
		int j2;
		int i3;
		int j3;
		int l;
		int h;
		int k;
		int q;
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
		for (i1 = 0;i1 <= x1 - 1;i1++)
		{
			for (j1 = 0;j1 <= y1 - 1;j1++)
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (i2 = 0;i2 <= x2 - 1;i2++)
		{
			for (j2 = 0;j2 <= y2 - 1;j2++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i2][j2] = Integer.parseInt(tempVar6);
			}
			}
		}
		for (i3 = 0;i3 <= x1 - 1;i3++)
		{
			for (j3 = 0;j3 <= y2 - 1;j3++)
			{
			q = 0;
			for (k = 0;k <= x2 - 1;k++)
			{
			q = q + a[i3][k] * b[k][j3];
			}
			c[i3][j3] = q;
			}
		}
		for (l = 0;l <= x1 - 1;l++)
		{
			System.out.printf("%d",c[l][0]);
			if (y2 != 1)
			{
				for (h = 1;h <= y2 - 1;h++)
				{
				System.out.printf(" %d",c[l][h]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

