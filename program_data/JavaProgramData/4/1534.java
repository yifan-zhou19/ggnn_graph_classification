package <missing>;

public class GlobalMembers
{
	public static int[][] matrix = new int[100][100];
	public static int row;
	public static int col;
	public static void display(int step)
	{
		int x;
		int y;
		int i;
		if (step > row + col - 1)
		{
			return;
		}
		if (step < col)
		{
			y = step - 1;
			for (i = y;i >= 0 && y - i < row;i--)
			{
				System.out.print(matrix[y - i][i]);
				System.out.print("\n");
			}
		}
		else
		{
			x = step - col;
			for (i = x;i < row && col - 1 + x - i >= 0;i++)
			{
				System.out.print(matrix[i][col - 1 + x - i]);
				System.out.print("\n");
			}
		}
		display(step + 1);
	}
	public static int Main()
	{
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(matrix + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		display(1);
	}

}

