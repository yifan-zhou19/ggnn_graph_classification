package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] a = new int[25][25];
	public static int judge(int y, int x)
	{
		if (y == 0)
		{
			if (x == 0)
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1])
				{
					return 1;
				}
			}
			else if (x == m - 1)
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x][y + 1])
				{
					return 1;
				}
			}
			else
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1])
				{
					return 1;
				}
			}
		}
		else if (y == n - 1)
		{
			if (x == 0)
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y - 1] != 0)
				{
					return 1;
				}
			}
			else if (x == m - 1)
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x][y - 1])
				{
					return 1;
				}
			}
			else
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y - 1])
				{
					return 1;
				}
			}
		}
		else
		{
			if (x == 0)
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x][y - 1])
				{
					return 1;
				}
			}
			else if (x == m - 1)
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x][y - 1])
				{
					return 1;
				}
			}
			else
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x][y - 1])
				{
					return 1;
				}
			}
		}
		return 0;
	}
	public static int Main()
	{

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
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (judge(j, i) != 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
	}
}

