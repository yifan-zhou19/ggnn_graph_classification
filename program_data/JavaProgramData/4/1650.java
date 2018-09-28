package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int row;
		int col;
		int i;
		int j;
		int count = 0;
		int r = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (col == 1)
		{
			r = 1;
		}
		for (i = 1 ; i <= row ; i++)
		{
			for (j = 1 ; j <= col ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			i = 1;
			j = 1;
			while (count < row * col)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				count++;
				if ((j == 1 && i != row) || (j != 1 && i == row) || (j == 1 && i == row))
				{
					if (i + j < col)
					{
						j = i + j;
						i = 1;
					}
					else
					{
						r++;
						i = r;
						j = col;
					}
				}
				else
				{
					i++;
					j--;
				}
			}
			return 0;
	}




}

