package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[][] a = new int[21][21];
		int m1;
		int n1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= m * n - 1; i++)
		{
			a[i / n + 1][i % n + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i <= m * n - 1; i++)
		{
			m1 = i / n + 1;
			n1 = i % n + 1;
			if (a[m1][n1] >= a[m1 + 1][n1] != 0 && a[m1][n1] >= a[m1 - 1][n1] != 0 && a[m1][n1] >= a[m1][n1 + 1] != 0 && a[m1][n1] >= a[m1][n1 - 1])
			{
				System.out.print(m1 - 1);
				System.out.print(" ");
				System.out.print(n1 - 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

