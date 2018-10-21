package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int r;
		int c;
		int x;
		int y;
		int[][] a = new int[110][110];
		for (i = 0;i < 110;i++)
		{
			for (j = 0;j < 110;j++)
			{
				a[i][j] = -1;
			}
		}
		for (scanf("%d%d", r, c), i = 1; i <= r; i++)
		{
			for (j = 1; j <= c; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = j = 1,x = 0,y = 1;a[i][j] != -1;i += x,j += y)
		{
			System.out.printf("%d\n",a[i][j]);
			a[i][j] = -1;
			if (a[i + x][j + y] == -1)
			{
				r = y;
				y = -x;
				x = r;
			}
		}
	}
}

