package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= row - 1 ; i++)
		{
			for (j = 0 ; j <= col - 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (col >= row)
		{
			for (j = 0 ; j <= row - 1 ; j++)
			{
				for (i = 0 ; i <= j ; i++)
				{
					System.out.print(a[i][j - i]);
					System.out.print("\n");
				}
			}
			for (j = row ; j <= col - 1 ; j++)
			{
				for (i = 0 ; i <= row - 1 ; i++)
				{
					System.out.print(a[i][j - i]);
					System.out.print("\n");
				}
			}
			for (i = 1 ; i <= row - 1 ; i++)
			{
				for (j = col - 1 ; j >= col + i - row ; j--)
				{
					System.out.print(a[i + col - 1 - j][j]);
					System.out.print("\n");
				}
			}
		}
		else if (col < row)
		{
			for (j = 0 ; j <= col - 1 ; j++)
			{
				for (i = 0 ; i <= j ; i++)
				{
					System.out.print(a[i][j - i]);
					System.out.print("\n");
				}
			}
			for (i = 1 ; i <= row - col - 1; i++)
			{
				for (j = col - 1 ; j >= 0 ; j--)
				{
					System.out.print(a[i + col - j - 1][j]);
					System.out.print("\n");
				}
			}
			for (i = row - col ; i <= row - 1 ; i++)
			{
				for (j = col - 1 ; j >= col - row + i ; j--)
				{
					System.out.print(a[i + col - 1 - j][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

