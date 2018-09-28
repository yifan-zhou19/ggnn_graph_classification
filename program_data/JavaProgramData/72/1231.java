package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int com = new int(int a[][100],int x,int y);
		int m;
		int n;
		int b;
		int[][] a = new int[100][100];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
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
				b = com(a, i, j);
				if (b > 0)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}

	public static int com(int[][] a, int x, int y)
	{
		int b = 0;
		if (x == 0)
		{
			if (y == 0)
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1])
				{
					b = 1;
				}

			}
			else
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x][y - 1])
				{
					b = 1;
				}
			}
		}
		else
		{
			if (y == 0)
			{
				if (a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x - 1][y])
				{
					b = 1;
				}

			}
			else
			{
				if (a[x][y] >= a[x - 1][y] != 0 && a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x][y - 1])
				{
					b = 1;
				}
			}
		}
		return (b);
	}







}

