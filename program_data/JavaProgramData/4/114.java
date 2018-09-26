package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] matrix = new int[100][100];
		int i;
		int j;
		int k;
		int x;
		int a;
		int b;
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 2; k <= row + col; k++)
		{
			a = k > col + 1? k - col:1;
			b = k > row + 1? row + 1:k;
			for (x = a; x < b; x++)
			{
				System.out.print(matrix[x][k - x]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

