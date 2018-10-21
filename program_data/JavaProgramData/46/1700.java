package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int[][] array = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row % 2 == 0)
		{
			for (k = 0;k < row / 2;k++)
			{
				if (col - k - 1 == k)
				{
					for (i = k;i < row - k;i++)
					{
						System.out.print(array[i][k]);
						System.out.print("\n");
					}
					break;
				}
				else
				{
					if (col - k - 1 != k)
					{
					for (i = k;i < col - k - 1;i++)
					{
						System.out.print(array[k][i]);
						System.out.print("\n");
					}
					}
				if (k != row - k - 1)
				{
					for (i = k;i < row - k - 1;i++)
					{
						System.out.print(array[i][col - k - 1]);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(array[k][col - k - 1]);
					System.out.print("\n");
				}
				if (col - k - 1 != k && k != row - k - 1)
				{
					for (i = col - k - 1;i > k;i--)
					{
						System.out.print(array[row - k - 1][i]);
						System.out.print("\n");
					}
				}
				if (k != row - k - 1 && col - k - 1 != k)
				{
					for (i = row - k - 1;i > k;i--)
					{
						System.out.print(array[i][k]);
						System.out.print("\n");
					}
				}
				}
			}
		}
		else
		{
			for (k = 0;k < row / 2 + 1;k++)
			{
				if (col - k - 1 == k)
				{
					for (i = k;i < row - k;i++)
					{
						System.out.print(array[i][k]);
						System.out.print("\n");
					}
					break;
				}
				else
				{
					if (col - k - 1 != k)
					{
					for (i = k;i < col - k - 1;i++)
					{
						System.out.print(array[k][i]);
						System.out.print("\n");
					}
					}
				if (k != row - k - 1)
				{
					for (i = k;i < row - k - 1;i++)
					{
						System.out.print(array[i][col - k - 1]);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(array[k][col - k - 1]);
					System.out.print("\n");
				}
				if (col - k - 1 != k && k != row - k - 1)
				{
					for (i = col - k - 1;i > k;i--)
					{
						System.out.print(array[row - k - 1][i]);
						System.out.print("\n");
					}
				}
				if (k != row - k - 1 && col - k - 1 != k)
				{
					for (i = row - k - 1;i > k;i--)
					{
						System.out.print(array[i][k]);
						System.out.print("\n");
					}
				}
				}
			}
		}
		return 0;
	}
}

