package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int k;
		int j;
		int s = 0;
		int[][] a =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < row / 2 + 1 && i < col / 2 + 1; i++)
		{ //????-1
			for (k = i; k < col - i; k++)
			{ //???i?????
				System.out.print(a[i][k]);
				System.out.print("\n");
				s++;
			}
			if (s == row * col) //??????
			{
				break;
			}
			for (k = i + 1; k < row - i; k++)
			{ //???i?????
				System.out.print(a[k][col - i - 1]);
				System.out.print("\n");
				s++;
			}
			if (s == row * col)
			{
				break;
			}
			for (k = col - i - 2; k >= i; k--)
			{ //???i?????
				System.out.print(a[row - i - 1][k]);
				System.out.print("\n");
				s++;

			}
			if (s == row * col)
			{
				break;
			}
			for (k = row - i - 2; k > i; k--)
			{ //???i????
				System.out.print(a[k][i]);
				System.out.print("\n");
				s++;

			}
			if (s == row * col)
			{
				break;
			}

		}

		return 0;
	}
}

