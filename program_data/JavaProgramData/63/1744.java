package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[110][110]; //????AB????
		int[][] b = new int[110][110];
		int[][] c = new int[110][110];
		int x1;
		int x2;
		int y1;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int q = 0; q < x1; q++)
		{
			for (int w = 0; w < y1; w++)
			{
				a[q][w] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int e = 0; e < x2; e++)
		{
			for (int r = 0; r < y2; r++)
			{
				b[e][r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0; i < x1; i++) //????????????
		{
			for (int j = 0; j < y2; j++)
			{
				c[i][j] = 0;
				for (int k = 0; k < x2; k++)
				{
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
				if (j < y2 - 1)
				{
					System.out.print(c[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(c[i][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

