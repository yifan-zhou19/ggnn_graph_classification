package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int lin;
		int col;
		lin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[][] num = new int[100][100];
		for (i = 0; i < lin; i++)
		{
			for (j = 0; j < col; j++)
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (lin <= col)
		{
			for (j = 0; j < col; j++)
			{
				for (i = 0; i <= j != 0 && i < lin; i++)
				{
					System.out.print(num[i][j - i]);
					System.out.print("\n");
				}
			}
			for (i = 1; i < lin; i++)
			{
				for (j = col - 1; j >= i != 0 && col + i - 1 - j < lin; j--)
				{
					System.out.print(num[col + i - 1 - j][j]);
					System.out.print("\n");
				}
			}
		}
		else
		{
			for (j = 0; j < col; j++)
			{
				for (i = 0; i <= j; i++)
				{
					System.out.print(num[i][j - i]);
					System.out.print("\n");
				}
			}
			for (i = 1; i < lin; i++)
			{
				for (j = col - 1;col - 1 + i - j < lin && j >= 0 ; j--)
				{
					System.out.print(num[col + i - 1 - j][j]);
					System.out.print("\n");
				}
			}
		}

		return 0;
	}


}

