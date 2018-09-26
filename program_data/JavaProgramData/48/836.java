package <missing>;

public class GlobalMembers
{
	public static int[][] cell = new int[15][15];

	public static void change()
	{
		int[][] cell2 = new int[15][15];
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				if (cell[i][j] != 0)
				{
					int k = cell[i][j] * 2;
					cell2[i][j] += k;
					cell2[i - 1][j] += cell[i][j];
					cell2[i + 1][j] += cell[i][j];
					cell2[i][j + 1] += cell[i][j];
					cell2[i][j - 1] += cell[i][j];
					cell2[i - 1][j - 1] += cell[i][j];
					cell2[i + 1][j - 1] += cell[i][j];
					cell2[i - 1][j + 1] += cell[i][j];
					cell2[i + 1][j + 1] += cell[i][j];
				}
			}
		}
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++)
			{
				cell[i][j] = cell2[i][j];
			}
		}
	}
	public static int Main()
	{

		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cell[5][5] = m;
		for (int i = 0; i < n; i++)
		{
			change();
		}
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j < 9; j++)
			{
				System.out.print(cell[i][j]);
				System.out.print(' ');
			}
			System.out.print(cell[i][9]);
			System.out.print("\n");

		}

		return 0;
	}
}

