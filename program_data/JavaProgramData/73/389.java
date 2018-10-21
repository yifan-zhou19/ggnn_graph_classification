package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][1];
		int[][] c = new int[1][5];
		int i;
		int j;
		int max;
		int min;
		int leap = 0;
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
			max = a[i][0];
			b[i][0] = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					b[i][0] = j;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			min = a[0][j];
			c[0][j] = 0;
			for (i = 1;i < 5;i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
					c[0][j] = i;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (b[i][0] == j && c[0][j] == i)
				{
					leap = 1;
					System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					break;
				}
			}
		}
		if (leap == 0)
		{
		System.out.print("not found");
		}
	}
}

