package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int[][] b = new int[200][200];
	public static int[][] c = new int[200][200];

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x1; i++)
		{
			for (int j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x2; i++)
		{
			for (int j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < x1; i++)
		{
			for (int j = 0; j < y2; j++)
			{
				for (int k = 0; k < y1; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]);
				System.out.print((j == y2 - 1 ? '\n' : ' '));
			}
		}
		return 0;
	}
}

