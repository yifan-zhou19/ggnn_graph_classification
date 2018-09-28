package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int m;
		int n;
		for (int i = 0;i < 11;i++)
		{
			for (int j = 0;j < 11;j++)
			{
				a[i][j] = 0;
				b[i][j] = 0;
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
		for (int z = 0;z < n;z++)
		{
			for (int x = 1;x < 10;x++)
			{
				for (int y = 1;y < 10;y++)
				{
					b[x][y] = a[x + 1][y] + a[x - 1][y] + a[x][y + 1] + a[x][y - 1] + a[x + 1][y + 1] + a[x + 1][y - 1] + a[x - 1][y + 1] + a[x - 1][y - 1];
				}
			}
			for (int x = 1;x < 10;x++)
			{
				for (int y = 1;y < 10;y++)
				{
					a[x][y] = 2 * a[x][y] + b[x][y];
				}
			}
		}
		for (int x = 1;x < 10;x++)
		{
				System.out.printf("%d",a[x][1]);
				for (int y = 2;y < 10;y++)
				{
					System.out.printf(" %d",a[x][y]);
				}
				System.out.print("\n");
		}
	}


}

