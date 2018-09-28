package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*?????? 1300012861 **
	//*???2013.11.01  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[102][102];
		int i;
		int j;
		int k;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row <= col)
		{
			if (row < 2)
			{
				for (j = 0; j < col; j++)
				{
					System.out.print(a[0][j]);
					System.out.print("\n");
				}
			}
			if (row >= 2)
			{
				for (i = 0; i < row / 2; i++)
				{
					for (j = i; j < col - i; j++)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
					j--;
					for (k = i + 1; k < row - i; k++)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
					k--;
					for (j = j - 1; j >= i; j--)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
					j++;
					for (k = k - 1; k > i; k--)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
				}
				if (row % 2 != 0)
				{
					for (j = i; j < col - i; j++)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
				}
			}
		}
		if (col < row)
		{
			if (col < 2)
			{
				for (i = 0; i < row; i++)
				{
					System.out.print(a[i][0]);
					System.out.print("\n");
				}
			}
			if (col >= 2)
			{
				for (i = 0; i < col / 2; i++)
				{
					for (j = i; j < col - i; j++)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
					j--;
					for (k = i + 1; k < row - i; k++)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
					k--;
					for (j = j - 1; j >= i; j--)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
					j++;
					for (k = k - 1; k > i; k--)
					{
						System.out.print(a[k][j]);
						System.out.print("\n");
					}
				}
				if (col % 2 != 0)
				{
					for (k = i; k < row - i; k++)
					{
						System.out.print(a[k][j + 1]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}


}

