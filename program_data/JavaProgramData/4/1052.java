package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		for (int i = 1;i <= row;i++)
		{
			for (int j = 1;j <= col;j++)
			{
				a[i - 1][j - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int k = 0;k <= row + col - 2;k++)
		{
			for (int l = 0;l <= row - 1;l++)
			{
				if (k - l <= col - 1 && k >= l)
				{
					System.out.print(a[l][k - l]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

