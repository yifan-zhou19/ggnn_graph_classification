package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] p = new int[20][20];
		int i;
		int j;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				p[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (p[0][0] >= p[0][1] != 0 && p[0][0] >= p[1][0])
		{
			System.out.print("0 0");
			System.out.print("\n");
		}
		for (i = 1; i < n - 1; i++)
		{
			if (p[0][i] >= p[0][i - 1] != 0 && p[0][i] >= p[0][i + 1] != 0 && p[0][i] >= p[1][i])
			{
				System.out.print(0);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (p[0][n - 1] >= p[0][n - 2] != 0 && p[0][n - 1] >= p[1][n - 1])
		{
			System.out.print(0);
			System.out.print(" ");
			System.out.print(n - 1);
			System.out.print("\n");
		}
		for (i = 1; i < m - 1; i++)
		{
			if (p[i][0] >= p[i][1] != 0 && p[i][0] >= p[i + 1][0] != 0 && p[i][0] >= p[i - 1][0])
			{
				System.out.print(i);
				System.out.print(" 0");
				System.out.print("\n");
			}
			for (j = 1; j <= n - 2; j++)
			{
				if (p[i][j] >= p[i][j - 1] != 0 && p[i][j] >= p[i][j + 1] != 0 && p[i][j] >= p[i - 1][j] != 0 && p[i][j] >= p[i + 1][j])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
			if (p[i][n - 1] >= p[i][n - 2] != 0 && p[i][n - 1] >= p[i - 1][n - 1] != 0 && p[i][n - 1] >= p[i + 1][n - 1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n - 1);
				System.out.print("\n");
			}
		}
		if (p[m - 1][0] >= p[m - 1][1] != 0 && p[m - 1][0] >= p[m - 2][0])
		{
			System.out.print(m - 1);
			System.out.print(" ");
			System.out.print(0);
			System.out.print("\n");
		}
		for (i = 1; i < n - 1; i++)
		{
			if (p[m - 1][i] >= p[m - 1][i - 1] != 0 && p[m - 1][i] >= p[m - 1][i + 1] != 0 && p[m - 1][i] >= p[m - 2][i])
			{
				System.out.print(m - 1);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		if (p[m - 1][n - 1] >= p[m - 1][n - 2] != 0 && p[m - 1][n - 1] >= p[m - 2][n - 1])
		{
			System.out.print(m - 1);
			System.out.print(" ");
			System.out.print(n - 1);
			System.out.print("\n");
		}
		return 0;
	}

}

