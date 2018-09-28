package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int count = 0;
		int count0;
		int[][] a = new int[99][99];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		count0 = row * col;
		for (int k = 0; ;k++, col--, row--)
		{
			for (int i = k; i < col; i++)
			{
				System.out.print(a[k][i]);
				System.out.print("\n");
				count++;
				if (count == count0)
				{
					break;
				}
			}
			if (count == count0)
			{
				break;
			}
			for (int i = k + 1; i < row; i++)
			{
				System.out.print(a[i][col - 1]);
				System.out.print("\n");
				count++;
				if (count == count0)
				{
					break;
				}
			}
			if (count == count0)
			{
				break;
			}
			for (int i = col - 2; i >= k; i--)
			{
				System.out.print(a[row - 1][i]);
				System.out.print("\n");
				count++;
				if (count == count0)
				{
					break;
				}
			}
			if (count == count0)
			{
				break;
			}
			for (int i = row - 2; i >= k + 1; i--)
			{
				System.out.print(a[i][k]);
				System.out.print("\n");
				count++;
				if (count == count0)
				{
					break;
				}
			}
			if (count == count0)
			{
				break;
			}
		}
		return 0;
	}
}

