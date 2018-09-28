package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int k = 0;k < col;k++)
		{
			if (k < row)
			{
				for (int i = 0;i <= k;i++)
				{
					System.out.print(array[i][k - i]);
					System.out.print("\n");
				}
			}
			else
			{
				for (int i = 0;i < row;i++)
				{
					System.out.print(array[i][k - i]);
					System.out.print("\n");
				}
			}
		}
		for (int k = col;k < row + col - 1;k++)
		{
			if (k < row)
			{
				for (int i = k - col + 1;i <= k;i++)
				{
					System.out.print(array[i][k - i]);
					System.out.print("\n");
				}
			}
			else
			{
				for (int i = k - col + 1;i < row;i++)
				{
					System.out.print(array[i][k - i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

