package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y, int n)
	{
		if (n == 0)
		{
			if (x == 5 && y == 5)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			return f(x - 1, y - 1, n - 1) + f(x - 1, y, n - 1) + f(x - 1, y + 1, n - 1) + f(x, y - 1, n - 1) + f(x, y + 1, n - 1) + f(x + 1, y - 1, n - 1) + f(x + 1, y, n - 1) + f(x + 1, y + 1, n - 1) + 2 * f(x, y, n - 1);
		}
	}
	public static int Main()
	{
		int[][] a = new int[11][11];
		int i;
		int j;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < 10; i++)
		{
			for (j = 1; j < 10; j++)
			{
				if (j == 9)
				{
					System.out.print(m * f(i, j, n));
					System.out.print("\n");
				}
				else
				{
					System.out.print(m * f(i, j, n));
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

