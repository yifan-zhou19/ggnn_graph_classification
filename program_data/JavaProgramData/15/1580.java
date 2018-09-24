package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int n;
		int row;
		int col;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
		   for (col = 0;col < n;col++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   sz[row][col] = Integer.parseInt(tempVar2);
			   }
		   }
		}
		for (row = 0;row < n;row++)
		{
		   for (col = 0;col < n;col++)
		   {
			  if ((sz[row][col] == 0) && (sz[row][col - 1] != 0) && (sz[row - 1][col] != 0))
			  {
				a = row;
				b = col;
			  }
			  if ((sz[row][col] == 0) && (sz[row][col + 1] != 0) && (sz[row + 1][col] != 0))
			  {
				c = row;
				d = col;
			  }
		   }
		}

		if ((c - a - 1 > 0) && (d - b - 1 > 0))
		{
			int s = (c - a - 1) * (d - b - 1);
			System.out.printf("%d",s);
		}
		else
		{
			int s = 0;
			System.out.printf("%d",s);
		}
		return 0;
	}

}

