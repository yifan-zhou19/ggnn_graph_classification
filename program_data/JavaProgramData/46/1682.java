package <missing>;

public class GlobalMembers
{
	public static int[][] array = new int[100][100];
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int c;
		int count = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		c = row * col;
		for (k = 1,i = 1,j = 1;k <= c;k++)
		{
			count++;
			System.out.print(array[i][j]);
			System.out.print("\n");
			if (count < col)
			{
				j++;
			}
			else if (count == col || count < col + row - 1)
			{
				i++;
			}
			else if (count == col + row - 1 || count < 2 * col + row - 2)
			{
				j--;
			}
			else if (count == 2 * col + row - 2 || count < (col + row) * 2 - 4)
			{
				i--;
			}
			else
			{
				j++;
				row -= 2;
				col -= 2;
				count = 0;
			}
		}
		return 0;
	}
}

