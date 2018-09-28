package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int row;
		int col;
		int x;
		int y;
		int p;
		int q;
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
		int[][] sz = new int[m + 2][n + 2];
		for (row = 0;row < m + 2;row++)
		{
			for (col = 0;col < n + 2;col++)
			{
				if (row == 0 || row == m + 1 || col == 0 || col == n + 1)
				{
					sz[row][col] = 0;
				}
				else
				{
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  (sz[row][col]) = Integer.parseInt(tempVar3);
				  }
				}
			}
		}
		for (row = 1;row < m + 1;row++)
		{
			for (col = 1;col < n + 1;col++)
			{
				if (sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row - 1][col])
				{
					System.out.printf("%d %d\n",row - 1,col - 1);
				}
			}
		}
		return 0;
	}


}

