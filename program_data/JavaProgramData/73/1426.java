package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] h = new int[5][5];
		int m;
		int q;
		int n = 0;
	for (int i = 0;i <= 4;i++)
	{
		  for (int j = 0;j <= 4;j++)
		  {
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(h[i][j]) = Integer.parseInt(tempVar);
		}
		  }
	}

	for (int x = 0;x <= 4;x++)
	{
		 for (int y = 0;y <= 4;y++)
		 {
			if ((h[x][y] >= h[x][1]) && (h[x][y] >= h[x][2]) && (h[x][y] >= h[x][0]) && (h[x][y] >= h[x][3]) && (h[x][y] >= h[x][4]))
			{
				if ((h[x][y] <= h[0][y]) && (h[x][y] <= h[1][y]) && (h[x][y] <= h[2][y]) && (h[x][y] <= h[3][y]) && (h[x][y] <= h[4][y]))
				{
					n++;
					System.out.printf("%d %d %d",x + 1,y + 1,h[x][y]);
				}
			}
		 }
	}
	 if (n == 0)
	 {
		 System.out.print("not found");
	 }

	return 0;
	}

}

