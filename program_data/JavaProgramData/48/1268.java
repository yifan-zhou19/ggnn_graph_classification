package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];

	public static void f(int d)
	{
		if (d == 0)
		{
			return;
		}
		int u;
		int v;
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 9; v++)
			{
				b[u][v] = 2 * a[u][v] + a[u + 1][v] + a[u - 1][v] + a[u][v + 1] + a[u][v - 1] + a[u - 1][v - 1] + a[u - 1][v + 1] + a[u + 1][v - 1] + a[u + 1][v + 1];
			}
		}
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 9; v++)
			{
				a[u][v] = b[u][v];
			}
		}
		f(d - 1);
	}

	public static int Main()
	{
		int n;
		int d;
		int u;
		int v;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		f(d);
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 8; v++)
			{
				System.out.print(a[u][v]);
				System.out.print(" ");
			}
			System.out.print(a[u][9]);
			System.out.print("\n");
		}
		return 0;
	}
}

