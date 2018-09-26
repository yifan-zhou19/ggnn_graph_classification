package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int q;
		int r;
		int s;
		int x;
		int y;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		for (k = 0;k < x1;k++)
		{
			for (l = 0;l < y1;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[k][l] = Integer.parseInt(tempVar3);
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
		for (m = 0;m < x2;m++)
		{
			for (n = 0;n < y2;n++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					b[m][n] = Integer.parseInt(tempVar6);
				}
			}
		}
		for (q = 0;q < x1;q++)
		{
			for (r = 0;r < y2;r++)
			{
				for (s = 0;s < y1;s++)
				{
					c[q][r] = c[q][r] + a[q][s] * b[s][r];
				}
			}
		}
		for (x = 0;x < x1;x++)
		{
				for (y = 0;y < y2;y++)
				{
					if (y != y2 - 1)
					{
						System.out.printf("%d ",c[x][y]);
					}
					else
					{
						System.out.printf("%d\n",c[x][y]);
					}
				}
		}
	}
}

