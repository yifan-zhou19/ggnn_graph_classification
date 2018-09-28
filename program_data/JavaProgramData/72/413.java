package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] gao = new int[20][20];
		int i;
		int j;

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m;i++)
		{
			for (j = 0; j < n; j++)
			{
				gao[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (gao[0][0] >= gao[0][1] != 0 && gao[0][0] >= gao[1][0])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}
		for (j = 1; j < n - 1; j++)
		{
			if (gao[0][j] >= gao[0][j - 1] != 0 && gao[0][j] >= gao[0][j + 1] != 0 && gao[0][j] >= gao[1][j])
			{
				System.out.print(0);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
		}
		if (gao[0][n - 1] >= gao[0][n - 2] != 0 && gao[0][n - 1] >= gao[1][n - 1])
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(n - 1);
			System.out.print("\n");
		}
		for (i = 1; i < m - 1;i++)
		{
			for (j = 0; j < n; j++)
			{
				if (j == 0 && gao[i][j] >= gao[i - 1][j] != 0 && gao[i][j] >= gao[i][j + 1] != 0 && gao[i][j] >= gao[i + 1][j])
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
				else if (j > 0 && j < n - 1 && gao[i][j] >= gao[i - 1][j] != 0 && gao[i][j] >= gao[i][j - 1] != 0 && gao[i][j] >= gao[i][j + 1] != 0 && gao[i][j] >= gao[i + 1][j])
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
				else if (j == n - 1 && gao[i][j] >= gao[i - 1][j] != 0 && gao[i][j] >= gao[i][j - 1] != 0 && gao[i][j] >= gao[i + 1][j])
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		if (gao[m - 1][0] >= gao[m - 1][1] != 0 && gao[m - 1][0] >= gao[m - 2][0])
		{
			System.out.print(m - 1);
			System.out.print(' ');
			System.out.print(0);
			System.out.print("\n");
		}
		for (j = 1; j < n - 1; j++)
		{
			if (gao[m - 1][j] >= gao[m - 1][j - 1] != 0 && gao[m - 1][j] >= gao[m - 1][j + 1] != 0 && gao[m - 1][j] >= gao[m - 2][j])
			{
				System.out.print(m - 1);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
		}
		if (gao[m - 1][n - 1] >= gao[m - 1][n - 2] != 0 && gao[m - 1][n - 1] >= gao[m - 2][n - 1])
		{
			System.out.print(m - 1);
			System.out.print(' ');
			System.out.print(n - 1);
			System.out.print("\n");
		}

		return 0;
	}
}

