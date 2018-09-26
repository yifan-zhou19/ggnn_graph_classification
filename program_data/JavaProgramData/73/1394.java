package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
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
		k = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] >= a[i][(j + 1) % 5] != 0 && a[i][j] >= a[i][(j + 2) % 5] != 0 && a[i][j] >= a[i][(j + 3) % 5] != 0 && a[i][j] >= a[i][(j + 4) % 5] != 0 && a[i][j] <= a[(i + 1) % 5][j] != 0 && a[i][j] <= a[(i + 2) % 5][j] != 0 && a[i][j] <= a[(i + 3) % 5][j] != 0 && a[i][j] <= a[(i + 4) % 5][j])
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					k = k + 1;
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

