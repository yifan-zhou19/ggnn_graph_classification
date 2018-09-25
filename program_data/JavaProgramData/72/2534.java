package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] bo = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				bo[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (bo[0][0] >= bo[0][1] != 0 && bo[0][0] >= bo[1][0])
		{
			System.out.print(0);
			System.out.print(" ");
			System.out.print(0);
			System.out.print("\n");
		}
		for (j = 1;j < n - 1;j++)
		{
			if (bo[0][j] >= bo[0][j - 1] != 0 && bo[0][j] >= bo[0][j + 1] != 0 && bo[0][j] >= bo[1][j])
			{
				System.out.print(0);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		if (bo[0][n - 1] >= bo[0][n - 2] != 0 && bo[0][n - 1] >= bo[1][n - 1])
		{
				System.out.print(0);
				System.out.print(" ");
				System.out.print(n - 1);
				System.out.print("\n");
		}
		for (i = 1;i < m - 1;i++)
		{
			if (bo[i][0] >= bo[i - 1][0] != 0 && bo[i][0] >= bo[i + 1][0] != 0 && bo[i][0] >= bo[i][1])
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(0);
				System.out.print("\n");
			}
			for (j = 1;j < n - 1;j++)
			{
				if (bo[i][j] >= bo[i - 1][j] != 0 && bo[i][j] >= bo[i + 1][j] != 0 && bo[i][j] >= bo[i][j - 1] != 0 && bo[i][j] >= bo[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
			if (bo[i][n - 1] >= bo[i - 1][n - 1] != 0 && bo[i][n - 1] >= bo[i + 1][n - 1] != 0 && bo[i][n - 1] >= bo[i][n - 2])
			{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(n - 1);
					System.out.print("\n");
			}
		}
		if (bo[m - 1][0] >= bo[m - 1][1] != 0 && bo[m - 1][0] >= bo[m - 2][0])
		{
			System.out.print(m - 1);
			System.out.print(" ");
			System.out.print(0);
			System.out.print("\n");
		}
		for (j = 1;j < n - 1;j++)
		{
			if (bo[m - 1][j] >= bo[m - 1][j - 1] != 0 && bo[m - 1][j] >= bo[m - 1][j + 1] != 0 && bo[m - 1][j] >= bo[m - 2][j])
			{
				System.out.print(m - 1);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
			}
		}
		if (bo[m - 1][n - 1] >= bo[m - 1][n - 2] != 0 && bo[m - 1][n - 1] >= bo[m - 2][n - 1])
		{
			System.out.print(m - 1);
			System.out.print(" ");
			System.out.print(n - 1);
			System.out.print("\n");
		}
		return 0;
	}
}

