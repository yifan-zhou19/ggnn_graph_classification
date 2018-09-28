package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
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
		a[4][4] = b[4][4] = m;
		for (int i = 1;i <= n;i++)
		{
		for (int j = 4 - i;j <= 4 + i;j++)
		{
			for (int k = 4 - i;k <= 4 + i;k++)
			{
				for (int g = j - 1;g <= j + 1;g++)
				{
					for (int h = k - 1;h <= k + 1;h++)
					{
					   if (0 <= g != 0 && g <= 8 && 0 <= h != 0 && h <= 8)
					   {
						   a[j][k] = a[j][k] + b[g][h];
					   }
					}
				}
			}
		}
		for (int p = 0;p < 9;p++)
		{
			for (int q = 0;q < 9;q++)
			{
				b[p][q] = a[p][q];
			}
		}
		}
		for (int x = 0;x < 9;x++)
		{
			for (int y = 0;y < 9;y++)
			{
				if (y == 0)
				{
					System.out.printf("%d",a[x][y]);
				}
				else if (y == 8)
				{
					System.out.printf(" %d\n",a[x][y]);
				}
				else
				{
					System.out.printf(" %d",a[x][y]);
				}
			}
		}
	}
}

