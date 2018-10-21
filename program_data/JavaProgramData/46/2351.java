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
		int u;
		int v;
		int n;
		int s;
		for (i = 1; i <= row; i++)
		{
			for (j = 1; j <= col; j++)
			{
				matrix[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row > col)
		{
			if (col % 2 == 0)
			{
				n = col / 2;
			}
			else
			{
				n = col / 2 + 1;
			}
		}
		else
		{
			if (row % 2 == 0)
			{
				n = row / 2;
			}
			else
			{
				n = row / 2 + 1;
			}
		}
		u = 1;
		v = 1;
		for (s = 1; s <= n; s++)
		{
			System.out.print(matrix[u][v]);
			System.out.print("\n");
			for (i = 1; i <= col - 1; i++)
			{
				v++;
				System.out.print(matrix[u][v]);
				System.out.print("\n");
			}
			for (i = 1; i <= row - 1; i++)
			{
				u++;
				System.out.print(matrix[u][v]);
				System.out.print("\n");
			}
			if (row != 1)
			{
				for (i = 1; i <= col - 1; i++)
				{
					v--;
					System.out.print(matrix[u][v]);
					System.out.print("\n");
				}
			}
			if (col != 1)
			{
				for (i = 1; i <= row - 2; i++)
				{
					u--;
					System.out.print(matrix[u][v]);
					System.out.print("\n");
				}
			}
			v = v + 1;
			col = col - 2;
			row = row - 2;
		}
		return 0;
	}
}

