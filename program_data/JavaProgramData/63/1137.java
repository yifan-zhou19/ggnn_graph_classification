package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int p;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		int sum;
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
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			y2 = Integer.parseInt(tempVar5);
		}
		for (k = 0;k < x2;k++)
		{
				for (l = 0;l < y2;l++)
				{
					String tempVar6 = ConsoleInput.scanfRead();
					if (tempVar6 != null)
					{
						b[k][l] = Integer.parseInt(tempVar6);
					}
				}
		}
		x3 = x1;
		y3 = y2;
		for (m = 0;m < x3;m++)
		{
				for (n = 0;n < y3;n++)
				{
					sum = 0;
				 for (p = 0;p < y1;p++)
				 {
						sum += a[m][p] * b[p][n];
				 }
				 c[m][n] = sum;
				}
		}
		for (m = 0;m < x3;m++)
		{
				for (n = 0;n < y3 - 1;n++)
				{
					System.out.printf("%d ",c[m][n]);
				}
			 if (n == y3 - 1)
			 {
					System.out.printf("%d\n",c[m][n]);
			 }
		}
		return 0;
	}
}

