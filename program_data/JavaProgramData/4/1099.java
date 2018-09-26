package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k = 1;
		int[][] a = new int[200][200];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= row - 1; i++)
		{
			for (j = 0; j <= col - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		System.out.print(a[0][0]);
		while (k <= row + col - 2)
		{
			for (i = 0; i <= row - 1; i++)
			{
				if (k - i >= 0 && k - i < col)
				{
					System.out.print("\n");
					System.out.print(a[i][k - i]);
				}
			}
			k++;
		}
		System.out.print("\n");
		return 0;
	}
}

