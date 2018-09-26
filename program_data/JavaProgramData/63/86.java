package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sx1;
		int sy1;
		int sx2;
		int sy2;
		int i;
		int j;
		int k;
		sx1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sy1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int x1 = sx1;
		final int y1 = sy1;
		int[][] a = new int[x1][y1]; //a??????
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		sx2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sy2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int x2 = sx2;
		final int y2 = sy2;
		int[][] b = new int[x2][y2]; //b??????
		for (i = 0;i < x2;i++)
		{
			for (j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] c = new int[x1][y2]; //c?????
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				c[i][j] = 0;
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				for (k = 0;k < y1;k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j]; //??c??
				}
			}
		}
		for (i = 0;i < x1;i++)
		{
			for (j = 0;j < y2;j++)
			{
				if (j == y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print(' ');
				}
			}
		}

		return 0;
	}
}

