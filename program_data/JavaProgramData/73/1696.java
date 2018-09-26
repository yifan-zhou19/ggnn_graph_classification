package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int[] x = new int[5];
		int[] y = new int[5];
		int b;
		int c;
		int k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			b = a[i][0];
			x[i] = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > b)
				{
					x[i] = j;
					b = a[i][j];
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			c = a[0][j];
			y[j] = 0;
			for (i = 1;i < 5;i++)
			{
				if (a[i][j] < c)
				{
					y[j] = i;
					c = a[i][j];
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (x[i] == j && y[j] == i)
				{
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

