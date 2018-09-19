package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r;
		int c;
		int[][] zl = new int[1000][1000];
		int x;
		int a = 0;
		int b = 0;
		int d = 0;
		int e = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 0;r < n;r++)
		{
			for (c = 0;c < n;c++)
			{
				zl[r][c] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (r = 0;r < n;r++)
		{
			for (c = 0;c < n;c++)
			{
				if (zl[r][c] == 0)
				{
					a = r;
					b = c;
					break;
				}
			}
			if (zl[a][b] == 0)
			{
				break;
			}
		}
		for (r = 0;r < n;r++)
		{
			for (c = 0;c < n;c++)
			{
				if (zl[r][c] == 0)
				{
					d = r;
					e = c;
				}
			}
		}
		x = (d - a - 1) * (e - b - 1);
		System.out.print(x);
		System.out.print("\n");
		return 0;
	}
}

