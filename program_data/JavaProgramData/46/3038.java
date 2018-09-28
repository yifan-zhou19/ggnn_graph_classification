package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*?????? 1300012713 **
	//*???2013.11.01  **
	//********************************
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int time = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int x = 1; x <= row; x++)
		{
			for (int y = 1; y <= col; y++)
			{
				a[x - 1][y - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;time < row * col;i++)
		{
			for (int j = i; j <= col - i - 1 && time < row * col; j++)
			{
				System.out.print(a[i][j]);
				if (time < row * col - 1)
				{
					System.out.print("\n");
				}
				time++;
			}
			for (int k = i + 1; k <= row - i - 1 && time < row * col; k++)
			{
				System.out.print(a[k][col - i - 1]);
				if (time < row * col - 1)
				{
					System.out.print("\n");
				}
				time++;
			}
			for (int l = col - i - 2; l >= i != 0 && time < row * col; l--)
			{
				System.out.print(a[row - i - 1][l]);
				if (time < row * col - 1)
				{
					System.out.print("\n");
				}
				time++;
			}
			for (int m = row - i - 2; m > i && time < row * col; m--)
			{
				System.out.print(a[m][i]);
				if (time < row * col - 1)
				{
					System.out.print("\n");
				}
				time++;
			}
		}
		return 0;
	}


}

