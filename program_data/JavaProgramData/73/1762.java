package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int[] x = new int[5];
		int[] y = new int[5];
		int g = 1;
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
			System.out.print("\n");
		}
		for (i = 0;i < 5;i++)
		{
			k = a[i][0];
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] > k)
				{
					k = a[i][j];
					x[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			k = a[0][i];
			for (j = 0;j < 5;j++)
			{
				if (a[j][i] < k)
				{
					k = a[j][i];
					y[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (i == y[j] && j == x[i])
				{
					g = 0;
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
				}
			}
		}
		if (g == 1)
		{
			System.out.print("not found");
		}
	}






}

