package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[101][101];
		int row;
		int col;
		int i = 0;
		int j = 0;
		int sum = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
			array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} //????
		int n = 0;
		for (n = 0;;n++)
		{
			for (j = n;j <= col - n - 1;j++)
			{
				System.out.print(array[n][j]);
				System.out.print("\n");
				sum++; //???
			}
			if (sum == row * col)
			{
				break;
			}
			for (i = n + 1;i <= row - 1 - n;i++)
			{
			System.out.print(array[i][col - n - 1]);
			System.out.print("\n");
			sum++;
			} //???
			if (sum == row * col)
			{
				break;
			}
			for (j = col - n - 2;j >= n;j--)
			{
			System.out.print(array[row - 1 - n][j]);
			System.out.print("\n");
			sum++;
			} //???
				if (sum == row * col)
				{
					break;
				}
				for (i = row - 2 - n;i >= n + 1;i--)
				{
				System.out.print(array[i][n]);
				System.out.print("\n");
				sum++;
				} //???
					if (sum == row * col)
					{
						break;
					}
		}
		return 0;
	}
}

