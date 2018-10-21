package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int t = 0;
		int sum;
		int n = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i <= row - 1; i++)
		{
			for (int j = 0; j <= col - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		sum = row * col;
		while (true)
		{
			for (int i = n; i < col - n; i++)
			{
				System.out.print(a[n][i]);
				System.out.print("\n");
				t++;
			}
			if (t == sum)
			{
				break;
			}
			for (int i = n + 1; i < row - n; i++)
			{
				System.out.print(a[i][col - n - 1]);
				System.out.print("\n");
	t++;
			}
			if (t == sum)
			{
				break;
			}
			for (int i = col - n - 2; i >= n; i--)
			{
				System.out.print(a[row - n - 1][i]);
				System.out.print("\n");
				t++;
			}
			if (t == sum)
			{
				break;
			}
			for (int i = row - n - 2; i > n; i--)
			{
				System.out.print(a[i][n]);
				System.out.print("\n");
				t++;
			}
			if (t == sum)
			{
				break;
			}
			n++;
		}
		return 0;
	}
}

