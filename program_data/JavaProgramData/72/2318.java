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
		int[][] x = new int[21][21];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if ((i == 0) && (j == 0) && (x[0][0] >= x[0][1]) && (x[0][0] >= x[1][0]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((i == 0) && (j < n - 1) && (j>0) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i + 1][j]) && (x[i][j] >= x[i][j + 1]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((i == m - 1) && (j < n - 1) && (j>0) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i][j + 1]) && (x[i][j] >= x[i - 1][j]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((j == 0) && (i > 0) && (i < m - 1) && (x[i][j] >= x[i + 1][j]) && (x[i][j] >= x[i][j + 1]) && (x[i][j] >= x[i - 1][j]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((j == n - 1) && (i > 0) && (i < m - 1) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i - 1][j]) && (x[i][j] >= x[i + 1][j]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((i == 0) && (j == n - 1) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i + 1][j]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((i == m - 1) && (j == 0) && (x[i][j] >= x[i - 1][j]) && (x[i][j] >= x[i][j + 1]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((i == m - 1) && (j == n - 1) && (x[m - 1][n - 1] >= x[m - 2][n - 1]) && (x[m - 1][n - 1] >= x[m - 1][n - 2]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if ((x[i][j] >= x[i + 1][j]) && (x[i][j] >= x[i - 1][j]) && (x[i][j] >= x[i][j - 1]) && (x[i][j] >= x[i][j + 1]))
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}



}

