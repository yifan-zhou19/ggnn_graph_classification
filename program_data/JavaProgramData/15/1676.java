package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		int n;
		int x = 0;
		int k;
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

	k = 2;


		for (row = k;row < n - k;row++)
		{
			for (col = k;col < n - k;col++)
			{
				 if (sz[row][col] != 0)
				 {
				 x++;
				 }
			}
		}

		 System.out.printf("%d\n",x);

		 return 0;
	}


}

