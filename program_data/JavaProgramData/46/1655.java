package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
		int min;
		int flag;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		min = (row < col) ? row : col;
		for (k = 0; 2 * k < min; k++)
		{
			flag = 0;
			for (i = 1 + k; i <= col - k; i++)
			{
				System.out.print(array[1 + k][i]);
				System.out.print("\n");
			}
			for (j = 2 + k; j <= row - k; j++)
			{
				System.out.print(array[j][col - k]);
				System.out.print("\n");
				flag = 1;
			}
			if (flag != 0)
			{
				flag = 0;
			for (i = col - k - 1; i >= 1 + k; i--)
			{
				System.out.print(array[row - k][i]);
				System.out.print("\n");
				flag = 1;
			}
			if (flag != 0)
			{
			for (j = row - k - 1; j >= 1 + k + 1; j--)
			{
				System.out.print(array[j][1 + k]);
				System.out.print("\n");
			}
			}
			}
		}
		return 0;
	}

}

