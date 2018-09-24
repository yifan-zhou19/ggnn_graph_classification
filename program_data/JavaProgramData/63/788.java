package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
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
			int first = true;
			for (int j = 0; j < y2; j++)
			{
				c[i][j] = 0;
				for (int k = 0; k < x2; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (first != 0)
				{
					first = false;
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print(c[i][j]);
			}
			System.out.print("\n");
		}

		return 0;
	}
}

