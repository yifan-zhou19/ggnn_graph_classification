package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int time = 0;
		int i;
		int j;
		int n;
		int[][] array = new int[110][110];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(array + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (int i = 0;i <= row + col - 2;i++)
		{
			if (i < col)
			{
				for (int j = 0;j < row && j <= i;j++)
				{
					System.out.print((*(array + j) + i - j));
					System.out.print("\n");
				}
			}
			else
			{
				for (int j = col - 1;j >= i - row + 1 && j >= 0;j--)
				{
					System.out.print((*(array + i - j) + j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

