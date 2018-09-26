package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int k;
		int j;
		int time = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] arr = new int[100][100];
		for (k = 0;k < row;k++)
		{
			for (j = 0;j < col;j++)
			{
				arr[k][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			int i = 0;
		while (time < row * col)
		{

			for (k = i;k < col - i && time < row * col;k++)
			{
				System.out.print(arr[i][k]);
				System.out.print("\n");
				time++;
			}
			for (k = i + 1;k < row - i && time < row * col;k++)
			{
				System.out.print(arr[k][col - i - 1]);
				System.out.print("\n");
				time++;
			}
			for (k = col - i - 2;k >= i != 0 && time < row * col;k--)
			{
				System.out.print(arr[row - i - 1][k]);
				System.out.print("\n");
				time++;
			}
			for (k = row - i - 2;k > i && time < row * col;k--)
			{
				System.out.print(arr[k][i]);
				System.out.print("\n");
				time++;
			}
			i++;
		}
		return 0;
	}
}

