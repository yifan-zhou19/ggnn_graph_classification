package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int ok = 1;
		for (int i = 1;i <= 5;i++)
		{
			for (int j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (int i = 1;i <= 5;i++)
		{
			for (int j = 1;j <= 5;j++)
			{
				if (a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] >= a[i][5] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j] != 0 && a[i][j] <= a[5][j])
				{
					System.out.printf("%d %d %d",i,j,a[i][j]),ok = 0;
				}
			}
		}
		if (ok != 0)
		{
			System.out.print("not found");
		}
	}
}

