package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int temp = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[100][100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k <= col - 1;k++)
		{
			for (i = 0;i < row && k - i < col && k - i >= 0;i++)
			{
				temp = array[i][k - i];
				System.out.print(array[i][k - i]);
				System.out.print("\n");
			}
		}
		for (k = col;k <= (col - 1) + (row - 1);k++)
		{
			for (i = k - col + 1;i < row && k - i >= 0;i++)
			{
				temp = array[i][k - i];
				System.out.print(array[i][k - i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

