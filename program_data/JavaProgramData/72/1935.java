package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		char[][] mtn = new char[m][n];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mtn[i][j] = tempVar3.charAt(0);
				}
			}
		}
		for (int row = 0;row < m;row++)
		{
			for (int col = 0;col < n;col++)
			{
				if (row == 0 && col == 0 && mtn[row][col] >= mtn[row + 1][col] && mtn[row][col] >= mtn[row][col + 1])
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row == m - 1) && (col == 0) && (mtn[row][col] >= mtn[row - 1][col]) && (mtn[row][col] >= mtn[row][col + 1]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row == 0) && (col == n - 1) && (mtn[row][col] >= mtn[row][col - 1]) && (mtn[row][col] >= mtn[row + 1][col]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row == m - 1) && (col == n - 1) && (mtn[row][col] >= mtn[row - 1][col]) && (mtn[row][col] >= mtn[row][col - 1]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row == 0) && (mtn[row][col] >= mtn[row][col + 1]) && (mtn[row][col] >= mtn[row][col - 1]) && (mtn[row][col] >= mtn[row + 1][col]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row == m - 1) && (mtn[row][col] >= mtn[row][col - 1]) && (mtn[row][col] >= mtn[row][col + 1]) && (mtn[row][col] >= mtn[row - 1][col]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((col == 0) && (row != m - 1) && (row != 0) && (mtn[row][col] >= mtn[row - 1][col]) && (mtn[row][col] >= mtn[row + 1][col]) && (mtn[row][col] >= mtn[row][col + 1]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((col == n - 1) && (row != m - 1) && (row != 0) && (mtn[row][col] >= mtn[row - 1][col]) && (mtn[row][col] >= mtn[row + 1][col]) && (mtn[row][col] >= mtn[row][col - 1]))
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if ((row != 0) && (row != m - 1) && (col != 0) && (col != n - 1) && (mtn[row][col] >= mtn[row - 1][col]) && (mtn[row][col] >= mtn[row + 1][col]) && (mtn[row][col] >= mtn[row][col - 1]) && (mtn[row][col] >= mtn[row][col + 1]))
				{
					System.out.printf("%d %d\n",row,col);
				}

			}
		}
	return 0;

	}



}

