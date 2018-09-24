package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int row;
		int col;
		int i;
		int j;
		int k;
		int sum;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = row + col;
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 2; k <= sum ; k++)
		{
			if (k <= col + 1)
			{
				i = 1;
				j = k - 1;
				do
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					i += 1;
					j -= 1;
				} while (i <= row != 0 && j >= 1);
			}
			else
			{
				i = k - col;
				j = k - i;
				do
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					i += 1;
					j -= 1;
				} while (i <= row != 0 && j >= 1);
			}
		}

		return 0;
	}


}

