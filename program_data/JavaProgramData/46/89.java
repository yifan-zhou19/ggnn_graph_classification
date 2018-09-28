package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int ROW;
		int COL;
		int[][] n = new int[100][100];
		int i;
		int b = 0;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		N = ROW * COL;
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;;i++)
		{
			if (b < N)
			{
			for (col = i,row = i;col < (COL - i);col++)
			{
				if (b < N)
				{
					System.out.printf("%d\n",n[row][col]);
					b += 1;
				}
				else
				{
					break;
				}
			}
			for (col = COL - 1 - i,row = i + 1;row < ROW - i;row++)
			{
				if (b < N)
				{
					System.out.printf("%d\n",n[row][col]);
					b += 1;
				}
				else
				{
					break;
				}
			}
			for (row = ROW - 1 - i,col = COL - 2 - i;col >= i;col--)
			{
				if (b < N)
				{
					System.out.printf("%d\n",n[row][col]);
					b += 1;
				}
				else
				{
					break;
				}
			}
			for (col = i,row = ROW - 2 - i;row >= i + 1;row--)
			{
				if (b < N)
				{
					System.out.printf("%d\n",n[row][col]);
					b += 1;
				}
				else
				{
					break;
				}
			}
			}
			else
			{
				break;
			}
		}
		return 0;
	}

}

