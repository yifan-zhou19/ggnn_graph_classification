package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int m;
		int l;
		int p;
		int q;
		double k;
		int[][] x = new int[10][3];
		double[][] y = new double[10][10];
		double[][] z = new double[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a <= 9;a++)
		{
			for (b = 0;b <= 9;b++)
			{
			y[a][b] = -1;
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			for (b = 0;b <= 2;b++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[a][b] = Integer.parseInt(tempVar2);
			}
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			for (b = a + 1;b <= n - 1;b++)
			{
			y[a][b] = Math.sqrt((x[a][0] - x[b][0]) * (x[a][0] - x[b][0]) + (x[a][1] - x[b][1]) * (x[a][1] - x[b][1]) + (x[a][2] - x[b][2]) * (x[a][2] - x[b][2]));
			}
		}
		for (a = 0;a <= 9;a++)
		{
			for (b = 0;b <= 9;b++)
			{
			z[a][b] = y[a][b];
			}
		}
		for (a = 1;a <= (((n * n) / 2) - (n / 2));a++)
		{
			k = -1;
			m = -1;
			l = -1;
			for (b = 0;b <= n - 1;b++)
			{
				for (c = 0;c <= n - 1;c++)
				{
					if (y[b][c] > k)
					{
						m = b;
						l = c;
						k = y[b][c];
					}
					else
					{
						;
					}
				}
			}
			y[m][l] = -1;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[m][0],x[m][1],x[m][2],x[l][0],x[l][1],x[l][2],z[m][l]);
		}
	}
}

