package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static int Main()
	{
		void F(int x, int y);
		int p;
		int q;
		int i;
		int j;
		int t;
		int m;
		int n;
		for (i = 0;i < 9;i++)
		{
		for (j = 0;j < 9;j++)
		{
			a[i][j] = 0;
			b[i][j] = 0;
		}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[4][4] = m;
		for (t = 1;t <= n;t++)
		{
			for (p = 0;p < 9;p++)
			{
			for (q = 0;q < 9;q++)
			{
			b[p][q] = 0;
			}
			}

			for (i = 0;i < 9;i++)
			{
			for (j = 0;j < 9;j++)
			{
			F(i, j);
			}
			}
			for (p = 0;p < 9;p++)
			{
			for (q = 0;q < 9;q++)
			{
			a[p][q] += b[p][q];
			}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
		System.out.printf("%d ",a[i][j]);
			}
		System.out.printf("%d\n",a[i][8]);
		}
	}
	public static void F(int x, int y)
	{
		int i;
		int j;
		int m;
		if (a[x][y] > 0)
		{
			 m = a[x][y];
		 for (i = -1;i < 2;i++)
		 {
		 for (j = -1;j < 2;j++)
		 {
		 b[x + i][y + j] += m;
		 }
		 }
		}
	}



}

