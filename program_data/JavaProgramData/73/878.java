package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[5][5];
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
		int[] x = new int[5];
		int[] y = new int[5];
		for (i = 0;i < 5;i++)
		{
			int max = -10000000;
			for (j = 0;j < 5;j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					x[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			int min = 10000000;
			for (j = 0;j < 5;j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
					y[i] = j;
				}
			}
		}
		int bl = 1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (x[i] == j && y[j] == i)
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					bl = 0;
				}
			}
		}
		if (bl != 0)
		{
			System.out.print("not found\n");
		}
	}

}

