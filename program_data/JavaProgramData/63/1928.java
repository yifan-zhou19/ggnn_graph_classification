package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int[][] b = new int[100][100];
	public static int x;
	public static int y;
	public static int v;
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 0; x < x1; x++)
		{
			for (y = 0; y < y1; y++)
			{
				a[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x = 0; x < x2; x++)
		{
			for (y = 0; y < y2; y++)
			{
				b[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (x = 0; x < x1; x++)
		{
			for (y = 0; y < y2; y++)
			{
				for (int i = 0; i < x2; i++)
				{
					v += a[x][i] * b[i][y];
				}
				System.out.print(v);
				if (y == y2 - 1)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(' ');
				}
				v = 0;
			}
		}
		return 0;
	}
}

