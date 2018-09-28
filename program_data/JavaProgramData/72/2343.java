package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int x;
		int y;
		int x1;
		int x2;
		int y1;
		int y2;
		int[][] s = new int[M][N];
		int[][] a = new int[M][N];
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
		for (y = 0;y < m;y++)
		{
			for (x = 0;x < n;x++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[y][x] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (y = 0;y < m;y++)
		{
			a[y][n - 1] = s[y][n - 1];
			for (x1 = 0;x1 < n - 1;x1++)
			{
				   if (s[y][x1] >= s[y][x1 + 1])
				   {
						   a[y][x1] = s[y][x1];
				   }
			}
			for (x2 = 1;x2 < n;x2++)
			{
				   if (s[y][x2] < s[y][x2 - 1])
				   {
						   a[y][x2] = 0;
				   }
			}
		}
		for (x = 0;x < n;x++)
		{
			for (y1 = 0;y1 < m - 1;y1++)
			{
				   if (s[y1][x] < s[y1 + 1][x])
				   {
						 a[y1][x] = 0;
				   }
			}
			for (y2 = 1;y2 < m;y2++)
			{
				   if (s[y2][x] < s[y2 - 1][x])
				   {
						 a[y2][x] = 0;
				   }
			}
		}
		for (y = 0;y < m;y++)
		{
			for (x = 0;x < n;x++)
			{
				  if (a[y][x] != 0)
				  {
						  System.out.printf("%d %d\n",y,x);
				  }
			}
		}
		return 0;
	}

}

