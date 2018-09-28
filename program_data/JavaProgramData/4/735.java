package <missing>;

public class GlobalMembers
{
	//??????????
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			int k = 0;
			for (k = 1; k <= col; k++)
			{
				i = 1, j = k;
				while (true)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					if (i == row || j == 1)
					{
						break;
					}
					i++, j--;
				}
			}
			for (k = 2; k <= row; k++)
			{
				i = k, j = col;
				while (true)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					if (i == row || j == 1)
					{
						break;
					}
					i++, j--;
				}
			}
			return 0;
	}
}

