package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] b = new int[11][11];

	public static void f()
	{
		int u;
		int v;
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 9; v++)
			{
				b[u][v] = 2 * a[u][v] + a[u - 1][v] + a[u + 1][v] + a[u][v - 1] + a[u][v + 1] + a[u - 1][v - 1] + a[u - 1][v + 1] + a[u + 1][v - 1] + a[u + 1][v + 1];
			}
		}
		for (u = 1; u <= 9; u++)
		{
			for (v = 1; v <= 9; v++)
			{
				a[u][v] = b[u][v];
			}
		}
	}

	public static void print()
	{
		int i;
		int j;
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 8; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][9]);
			System.out.print("\n");
		}
		return;
	}


	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = n;
		b[5][5] = n;
		while (m > 0)
		{
			f();
			m--;
		}
		print();
		return 0;
	}

}

