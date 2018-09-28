package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int p;
		int q;
		int t;
		int x;
		int y = 0;
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
		int[][] c = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
				b[i][j] = a[i][j];
				c[i][j] = a[i][j];
			}
		}
		for (i = 0;i < m;i++)
		{
			for (p = 1;p < n;p++)
			{
			for (j = 0;j < n - p;j++)
			{
			   if (b[i][j] < b[i][j + 1])
			   {
				   t = b[i][j];
				   b[i][j] = b[i][j + 1];
				   b[i][j + 1] = t;
			   }
			}
			}

		}

		for (j = 0;j < n;j++)
		{
			for (q = 1;q < m;q++)
			{
			for (i = 0;i < m - q;i++)
			{
			   if (c[i][j] > c[i + 1][j])
			   {
				   t = c[i][j];
				   c[i][j] = c[i + 1][j];
				   c[i + 1][j] = t;
			   }
			}
			}



		}
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < n;j++)
			{
				if (b[i][0] == c[0][j])
				{
					x = b[i][0];
					break;
				}
			}
			}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == x)
				{
					System.out.printf("%d+%d",i,j);
					y = 1;
					break;
				}
			}
		}
		if (y == 0)
		{
			System.out.print("No");
		}
	}
}

