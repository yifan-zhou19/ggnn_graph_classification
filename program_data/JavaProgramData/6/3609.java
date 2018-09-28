package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int row;
		int col;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			sum = 0;
			row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < col; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (row == 1 && col == 1)
			{
				System.out.print((a[0]));
			}
			else
			{
			for (int i = 0; i < col; i++)
			{
				sum += *(a[0] + i);
				sum += *(a[row - 1] + i);
			}
			for (int j = 1; j < row - 1; j++)
			{
				sum += *(a[j]);
				sum += *(a[j] + col - 1);
			}
			System.out.print(sum);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

