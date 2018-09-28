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
		int m;
		int n;
		int k;
		int num = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < col; i++)
		{
			j = i;
			while (j >= 0 && i - j < row)
			{
				System.out.print(a[i - j][j]);
				System.out.print("\n");
				j--;
			}
		}
		for (i = 1; i < row; i++)
		{
			j = i;
			while (j < row && col - 1 + i - j >= 0)
			{
				System.out.print(a[j][col - 1 + i - j]);
				System.out.print("\n");
				j++;
			}
		}
		return 0;
	}


}

