package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int p;
		int q;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		p = 0;
		q = 0;
		for (int i = 0; i < row * col; i++)
		{
			System.out.print(a[p][q]);
			System.out.print("\n");
			if (q == 0 || p == row - 1)
			{
				q = p + q + 1;
				p = 0;
				while (q >= col)
				{
					p++;
					q--;
				}
			}
			else
			{
				p++;
				q--;
			}
		}
		return 0;
	}

}

