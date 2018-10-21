package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int l;
		int circle = 0;
		int num = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (true)
		{
			for (i = circle; i < col - circle; i++)
			{
				System.out.print(a[circle][i]);
				System.out.print("\n");
				num++;
			}
			if (num == row * col)
			{
				break;
			}

			for (i--, j = circle + 1; j < row - circle; j++)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
				num++;
			}
			if (num == row * col)
			{
				break;
			}

			for (j--, k = i - 1; k >= circle; k--)
			{
				System.out.print(a[j][k]);
				System.out.print("\n");
				num++;
			}
			if (num == row * col)
			{
				break;
			}

			for (k++, l = j - 1; l > circle; l--)
			{
				System.out.print(a[l][k]);
				System.out.print("\n");
				num++;
			}
			if (num == row * col)
			{
				break;
			}

			circle++;
		}
		return 0;
	}


}

