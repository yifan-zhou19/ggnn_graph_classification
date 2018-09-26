package <missing>;

public class GlobalMembers
{
	/**
	????2.cpp
	?  ?????
	?  ??11.01
	?  ??????????
	*/


	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int n;
		int num = 0;
		int tot;

		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tot = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (n = 0;n < 1 + row / 2;n++)
		{
			for (i = n;i < col - n;i++)
			{
				System.out.print(a[n][i]);
				System.out.print("\n");
				num++;
			}
			if (num == tot)
			{
				break;
			}
			for (j = n + 1;j < row - n;j++)
			{
				System.out.print(a[j][col - n - 1]);
				System.out.print("\n");
				num++;
			}
			if (num == tot)
			{
				break;
			}
			for (i = col - 2 - n;i >= n;i--)
			{
				System.out.print(a[row - n - 1][i]);
				System.out.print("\n");
				num++;
			}
			if (num == tot)
			{
				break;
			}
			for (j = row - 2 - n;j > n;j--)
			{
				System.out.print(a[j][n]);
				System.out.print("\n");
				num++;
			}
			if (num == tot)
			{
				break;
			}

		}
		return 0;
	}


}

