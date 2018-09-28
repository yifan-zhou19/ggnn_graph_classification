package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sh = new int[21][21];
		int m;
		int n;
		int i;
		int j;
		int t = 0;
		int f1 = 0;
		int f2 = 0;
		int f3 = 0;
		int f4 = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					sh[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					t = sh[i][j];
					if ((i - 1 < 0) || (sh[i - 1][j] <= t))
					{
						f1 = 1;
					}
					else
					{
						continue;
					}
					if ((i + 1 >= m) || (sh[i + 1][j] <= t))
					{
						f2 = 1;
					}
					else
					{
						continue;
					}
					if ((j - 1 < 0) || (sh[i][j - 1] <= t))
					{
						f3 = 1;
					}
				else
				{
					continue;
				}
					if ((j + 1 >= n) || (sh[i][j + 1] <= t))
					{
						f4 = 1;
					}
					else
					{
						continue;
					}
					if (f1 + f2 + f3 + f4 == 4)
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
					f1 = 0;
					f2 = 0;
					f3 = 0;
					f4 = 0;
				}
			}
		}
		return 0;
	}
}

