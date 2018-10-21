package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***???????????***
	//***??????***
	//***???2012.12.24***
	//*************************************************
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int n;
		int[][] a = new int[100][100];
		int c;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = row * col;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (row >= col)
		{
			n = (col + 1) / 2;
		}
		else
		{
			n = (row + 1) / 2;
		}
		for (i = 0; i < n; i++)
		{
			for (j = i; j < col - i; j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				c--;
			}
			if (c == 0)
			{
				break;
			}
			for (j = i + 1; j < row - i; j++)
			{
				System.out.print(a[j][col - i - 1]);
				System.out.print("\n");
				c--;
			}
			if (c == 0)
			{
				break;
			}
			for (j = col - i - 2; j >= i; j--)
			{
				System.out.print(a[row - i - 1][j]);
				System.out.print("\n");
				c--;
			}
			if (c == 0)
			{
				break;
			}
			for (j = row - i - 2; j > i; j--)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
				c--;
			}
			if (c == 0)
			{
				break;
			}
		}
		return 0;
	}
}

