package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] c = new int[5][5];
		int i;
		int j;
		int k;
		int num = 0;
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
		for (j = 0;j < 5;j++)
		{
			for (k = 0;k < 5;k++)
			{
				if (a[i][j] >= a[i][k])
				{
					b[i][j]++;
				}
				if (a[i][j] <= a[k][j])
				{
					c[i][j]++;
				}
			}
			if (b[i][j] == 5 && c[i][j] == 5)
			{
				System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				num++;
			}

		}
		}
		if (num == 0)
		{
			System.out.print("not found");
		}

	return 0;


	}
}

