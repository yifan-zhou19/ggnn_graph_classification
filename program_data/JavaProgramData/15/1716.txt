package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int n;
		int s = 0;
		int[][] sz = new int[1000][1000];
		int star1;
		int star2;
		int end1;
		int end2;
		int f = -1;
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
					(sz[row][col]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (row = 1;row < n - 1;row++)
		{
			for (col = 1;col < n - 1;col++)
			{
				if (sz[row][col] == 0 && f == -1)
				{
					star1 = row;
					star2 = col;
					f = 1;
				}
				if (sz[row][col] == 0)
				{
					end1 = row;
					end2 = col;
				}
			}
		}
		 s = (end1 - star1 - 1) * (end2 - star2 - 1);

		System.out.printf("%d\n",s);
	}


}

