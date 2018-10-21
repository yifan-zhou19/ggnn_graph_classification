package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row; //????a
		int col;
		int h;
		int l;
		int left;
		int up;
		int[][] a = new int[110][110];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < row; i++) //????????
		{
			for (int j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		l = 0; //???
		h = 0;
		left = 0;
		up = 0;
		while (left < col && up < row) //???????????????????
		{
			for (l = left; l < col - 1; l++) //???????????
			{
				System.out.print(a[h][l]);
				System.out.print("\n");
			}
			for (h = up; h < row - 1; h++)
			{
				System.out.print(a[h][l]);
				System.out.print("\n");
			}
			if ((up + 1) >= row) //???????????
			{
				System.out.print(a[h][col - 1]);
				break;
			}
			if ((left + 1) >= col)
			{
				System.out.print(a[row - 1][l]);
				break;
			}
			for (; l > left; l--)
			{
				System.out.print(a[h][l]);
				System.out.print("\n");
			}
			for (; h > up; h--)
			{
				System.out.print(a[h][l]);
				System.out.print("\n");
			}
			left++; //????????
			up++;
			col--;
			row--;
			h = up;
		}
		return 0;
	}




}

