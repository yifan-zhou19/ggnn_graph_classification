package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int n = 0;
		int[][] a = new int[100 + 10][100 + 10];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		i = 0;
		j = 0;
		for (int begin = 0; begin < col; begin++)
		{
			i = 0;
			j = begin;
			while (j >= 0 && i < row)
			{
				System.out.print(a[i++][j--]);
				System.out.print("\n");
			}
		}
		for (int begin = 1; begin < row; begin++)
		{
			i = begin, j = col - 1;
			while (i < row && j >= 0)
			{
				System.out.print(a[i++][j--]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

