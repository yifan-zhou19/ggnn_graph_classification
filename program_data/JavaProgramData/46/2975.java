package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n = 1;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] c = new int[101][101];
		for (int i = 1; i <= a; i++)
		{
		for (int j = 1; j <= b; j++)
		{
		c[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		while (2 * n <= a != 0 && 2 * n <= b)
		{
			for (int i = n; i <= b - n; i++)
			{
			System.out.print(c[n][i]);
			System.out.print("\n");
			}
			for (int i = n; i <= a - n; i++)
			{
			System.out.print(c[i][b - n + 1]);
			System.out.print("\n");
			}
			for (int i = b - n + 1; i > n; i--)
			{
			System.out.print(c[a - n + 1][i]);
			System.out.print("\n");
			}
			for (int i = a - n + 1; i > n; i--)
			{
			System.out.print(c[i][n]);
			System.out.print("\n");
			}
			n++;
		}
		for (int i = n; i <= b + 1 - n; i++)
		{
		for (int j = n; j <= a + 1 - n; j++)
		{
		System.out.print(c[j][i]);
		System.out.print("\n");
		}
		}
		return 0;
	}
}

