package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] bat = new int[5][11][11];
		int days;
		bat[0][5][5] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= days ; i++)
		{
			for (int row = 1 ; row <= 9 ; row++)
			{
				for (int col = 1 ; col <= 9 ; col++)
				{
					if (bat[i - 1][col][row] != 0)
					{
						bat[i][col][row] += 2 * bat[i - 1][col][row];
						bat[i][col - 1][row - 1] += bat[i - 1][col][row];
						bat[i][col - 1][row] += bat[i - 1][col][row];
						bat[i][col - 1][row + 1] += bat[i - 1][col][row];
						bat[i][col][row - 1] += bat[i - 1][col][row];
						bat[i][col][row + 1] += bat[i - 1][col][row];
						bat[i][col + 1][row - 1] += bat[i - 1][col][row];
						bat[i][col + 1][row] += bat[i - 1][col][row];
						bat[i][col + 1][row + 1] += bat[i - 1][col][row];
					}
				}
			}
		}
		for (int i = 1 ; i <= 9 ; i++)
		{
			System.out.print(bat[days][i][1]);
			for (int j = 2; j <= 9 ; j++)
			{
				System.out.print(' ');
				System.out.print(bat[days][i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

