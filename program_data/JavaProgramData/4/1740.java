package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int[][] a = new int[99][99];
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < r;++i)
		{
			for (int j = 0;j < c;++j)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int j = 0;j < c;++j)
		{
			for (int x = j, y = 0;x >= 0 && y < r;--x, ++y)
			{
				System.out.print(a[y][x]);
				System.out.print("\n");
			}
		}
		for (int i = 1;i < r;++i)
		{
			for (int y = i, x = c - 1;x >= 0 && y < r;--x, ++y)
			{
				System.out.print(a[y][x]);
				System.out.print("\n");
			}
		}
	}
}

