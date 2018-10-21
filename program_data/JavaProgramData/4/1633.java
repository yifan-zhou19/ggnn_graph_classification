package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0 ;i < row ;i++)
		{
			for (j = 0 ;j < col ;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		j = 0;
		for (i = 0 ;i < row ;i++)
		{
			if (i == 0)
			{
				while (j <= col - 1)
				{
					System.out.print(array[i][j]);
					System.out.print("\n");
					for (int k = i + 1; k < row; k++)
					{
						if (i + j - k >= 0)
						{
							System.out.print(array[k][i + j - k]);
							System.out.print("\n");
						}
					}
					j++;
				}
			}
			else
			{
				j = col - 1;
				System.out.print(array[i][j]);
				System.out.print("\n");
				for (int k = i + 1; k < row; k++)
				{
					if (i + j - k >= 0)
					{
						System.out.print(array[k][i + j - k]);
						System.out.print("\n");
					}
				}
			}
		}
	}

}

