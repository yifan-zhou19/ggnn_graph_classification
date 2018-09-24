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
		int temp = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (temp < col)
		{
			j = temp;
			i = 0;
			while (i < row && j >= 0)
			{
				System.out.print(array[i++][j--]);
				System.out.print("\n");
			}
			temp++;
		}
		if (row > 1)
		{
			temp = 1;
			while (temp < row)
			{
				j = col - 1;
				i = temp;
				while (i < row && j >= 0)
				{
					System.out.print(array[i++][j--]);
					System.out.print("\n");
				}
				temp++;
			}
		}
		return 0;
	}
}

