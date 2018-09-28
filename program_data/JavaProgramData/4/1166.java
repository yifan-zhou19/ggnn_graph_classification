package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[103][103];
		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	for (i = 0;i < row + col - 1;i++)
	{
		for (j = 0;j <= i;j++)
		{
			if (j < row && i - j < col)
			{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
			}
		}
	}

	return 0;
	}

}

