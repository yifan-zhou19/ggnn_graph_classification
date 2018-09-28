package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] hill = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				hill[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}



		for (j = 1;j < n - 1;j++)
		{
			if (hill[0][j] >= hill[0][j - 1] != 0 && hill[0][j] >= hill[0][j + 1] != 0 && hill[0][j] >= hill[1][j])
			{


		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i == 0 && j < n - 1 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j + 1] != 0 && hill[i][j] >= hill[i][j - 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i == 0 && j == n - 1 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j - 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i > 0 && i < m - 1 && j == 0 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i == m - 1 && j == 0 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i == m - 1 && j < n - 1 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i][j - 1] != 0 && hill[i][j] >= hill[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i == m - 1 && j == n - 1 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i][j - 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
				else if (i < m - 1 && j == n - 1 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j - 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}


				else if (i > 0 && i < m - 1 && j>0 && j < n - 1 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i + 1][j] != 0 && hill[i][j] >= hill[i][j - 1] != 0 && hill[i][j] >= hill[i][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
			}
		}

		return 0;
	}
}

