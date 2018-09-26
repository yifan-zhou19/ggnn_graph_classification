package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int l;
		int lin;
		int col;
		int sum = 0;
		int[][] num = new int[101][101];
		for (l = 1; l <= k; l++)
		{
			lin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1; i <= lin; i++)
			{
				for (j = 1; j <= col; j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			if (lin >= 2 && col >= 2)
			{
				for (i = 2; i <= lin - 1; i++)
				{
					sum = sum + num[i][1] + num[i][col];
				}
				for (j = 1; j <= col; j++)
				{
					sum = sum + num[1][j] + num[lin][j];
				}
			}
			if (lin == 1 && col >= 2)
			{
				for (j = 1; j <= col; j++)
				{
					sum = sum + num[1][j];
				}
			}
			if (col == 1 && lin >= 2)
			{
				for (i = 1; i <= lin; i++)
				{
					sum = sum + num[i][1];
				}
			}
			if (col == 1 && lin == 1)
			{
				sum = sum + num[1][1];
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}

}

