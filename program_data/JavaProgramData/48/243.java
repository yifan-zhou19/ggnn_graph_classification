package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] b = new int[9][9];
		int[][] c = new int[9][9];
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[4][4] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (b[i][j] != 0)
					{
						c[i][j] += 2 * b[i][j];
						c[i - 1][j - 1] += b[i][j];
						c[i - 1][j] += b[i][j];
						c[i - 1][j + 1] += b[i][j];
						c[i][j - 1] += b[i][j];
						c[i][j + 1] += b[i][j];
						c[i + 1][j - 1] += b[i][j];
						c[i + 1][j] += b[i][j];
						c[i + 1][j + 1] += b[i][j];
						b[i][j] += 0;
					}
				}
			}
				for (i = 0;i < 9;i++)
				{
					for (j = 0;j < 9;j++)
					{
					   if (c[i][j] != 0)
					   {
						   b[i][j] = c[i][j];
						   c[i][j] = 0;
					   }
					}
				}
		}
		for (i = 0;i < 9;i++)
		{
			System.out.print(b[i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(" ");
				System.out.print(b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

