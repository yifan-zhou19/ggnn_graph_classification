package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[120][120];
		int row;
		int col;
		int i;
		int j;
		int sum;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		while (i < row && j < col)
		{
			System.out.print(array[i][j]);
			System.out.print("\n");
			sum = i + j;
			i++;
			j--;
			if (i == row || j == -1)
			{
				sum = sum + 1;
				if ((i = row) != 0)
				{
					i = 0;
					j = sum - i;
					if (j >= col)
					{
						j = col - 1;
						i = sum - j;
					}
				}
				else
				{
					j = col - 1;
					i = sum - j;
					if (i < 0)
					{
						i = 0;
						j = sum - i;
					}
				}
			}
		}
		return 0;
	}

}

