package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] sz = new int[100][100];
		 int m;
		 int n;
		 int row;
		 int col;
		 int k;
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
		 for (row = 0;row < m;row++)
		 {
				for (col = 0;col < n;col++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[row][col] = Integer.parseInt(tempVar3);
					}
				}
		 }
		for (k = 0;k < m + n - 1;k++)
		{
			for (col = k, row = k - col;col < m + n - 1 && col >= 0;col--, row++)
			{
				if (col >= n)
				{
					continue;
				}
				else
				{
					if (row >= m)
					{
						continue;
					}
					else
					{
						System.out.printf("%d\n",sz[row][col]);
					}
				}
			}
		}

		return 0;
	}
}

