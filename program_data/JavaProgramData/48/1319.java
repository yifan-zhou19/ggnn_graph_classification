package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[11][11];
		int[][] add = new int[11][11];
		for (int i = 0;i < 11;i++)
		{
			for (int j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				add[i][j] = 0;
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
		a[5][5] = m;
		for (int i = 0;i < n;i++)
		{
			for (int x = 1;x < 10;x++)
			{
				for (int y = 1;y < 10;y++)
				{
				add[x][y] = a[x][y] + a[x - 1][y] + a[x][y - 1] + a[x - 1][y - 1] + a[x - 1][y + 1] + a[x][y + 1] + a[x + 1][y + 1] + a[x + 1][y] + a[x + 1][y - 1];
				}
			}
			for (int x = 1;x < 10;x++)
			{
				for (int y = 1;y < 10;y++)
				{
				a[x][y] = a[x][y] + add[x][y];
				}
			}
		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (j == 1)
				{
					System.out.printf("%d",a[i][j]);
				}
				else
				{
					System.out.printf(" %d",a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

