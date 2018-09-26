package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[7][7];
		double max;
		double[] c = new double[7];
		int x = 0;
		int y = 0;
		int d = 0;
		for (int i = 0;i < 7;i++)
		{
				for (int j = 0;j < 7;j++)
				{
						if (i == 0 || i == 6 || j == 0 || j == 6)
						{
						a[i][j] = 0;
						}
						else
						{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							a[i][j] = Double.parseDouble(tempVar);
						}
						}
				}
		}
		for (int m = 1;m < 6;m++)
		{
				c[m] = 1;
				max = 0;
				for (int n = 1;n < 6;n++)
				{
						if (a[m][n] > max)
						{
						max = a[m][n];
						x = n;
						y = m;
						}
				}
				for (int t = 1;t <= 5;t++)
				{
								if (max > a[t][x])
								{
								c[m] = 0;
								}
				}
				if (c[m] == 1)
				{
				d = 1;
				System.out.printf("%d %d %.0lf",y,x,max);
				}
		}
		if (d == 0)
		{
		System.out.print("not found");
		}
		return 0;
	}
}

