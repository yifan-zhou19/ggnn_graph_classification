package <missing>;

public class GlobalMembers
{
	public static void p(int[][] a)
	{
		int[][] b = new int[9][9];
		int i;
		int j;
		int x;
		int y;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (i = 1;i < 8;i++)
		{
			for (j = 1;j < 8;j++)
			{
				for (x = -1;x <= 1;x++)
				{
					for (y = -1;y <= 1;y++)
					{
						b[i + x][j + y] += a[i][j];
					}
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}
	public static int Main()
	{
		int[][] a = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		int k;
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
		a[4][4] = m;
		for (k = 0;k < n;k++)
		{
			p(a);
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.printf("%d%c",a[i][j],(j == 8)?'\n':' ');
			}
		}
	}


}

