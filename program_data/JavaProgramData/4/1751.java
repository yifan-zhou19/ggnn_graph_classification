package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int r;
		int c;
		for (r = 0;r < row;r++)
		{
			for (c = 0;c < col;c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[r][c] = Integer.parseInt(tempVar3);
				}
			}
		}
		int k;
		int first = 1;
		int min = row - 1;
		if (col < min + 1)
		{
			min = col - 1;
		}

		for (k = 0;k <= min;k++)
		{
			for (r = 0;r <= k;r++)
			{
				 if (first == 1)
				 {
					System.out.printf("%d",sz[r][k - r]);
					first = 0;
				 }
				else
				{
					System.out.printf("\n%d",sz[r][k - r]);
				}
			}
		}


		if (row > col)
		{
			for (k = 1;k <= row - col;k++)
			{
				for (r = k, c = col - 1;c >= 0 && r < row;c--, r++)
				{
					System.out.printf("\n%d",sz[r][c]);
				}
			}
		}

		if (row < col)
		{
			for (k = 1;k <= col - row;k++)
			{
				for (c = row - 1 + k,r = 0;r <= row - 1;c--,r++)
				{
					System.out.printf("\n%d",sz[r][c]);
				}
			}
		}

		for (k = min + 1;k >= 1;k--)
		{
			for (r = row - k + 1,c = col - 1;r < row;r++,c--)
			{
				System.out.printf("\n%d",sz[r][c]);
			}
		}






		return 0;
	}

}

