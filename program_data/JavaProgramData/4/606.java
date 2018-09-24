package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int r;
		int c;
		int i;
		int j;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= r - 1; i++)
		{
			for (j = 0; j <= c - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

		}
		for (j = 0; j <= c - 1; j++)
		{
			for (i = 0; (i <= j) && (i <= r - 1); i++)
			{
				System.out.print(a[i][j - i]);
				System.out.print("\n");
			}
		}
		for (i = 1; i <= r - 1; i++)
		{
			for (j = 0; (j <= r - i - 1) && (j + 1 <= c); j++)
			{
				System.out.print(a[i + j][c - 1 - j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

