package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] c = new int[2][11][11];
		int i;
		int j;
		int k;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c[0][5][5] = m;
		for (k = 0; k <= n - 1; k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c[(k + 1) % 2], 0, 11 * 11 * 4);
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					if (c[k % 2][i][j] != 0)
					{
						c[(k + 1) % 2][i][j] += 2 * c[k % 2][i][j];
						c[(k + 1) % 2][i + 1][j] += c[k % 2][i][j];
							c[(k + 1) % 2][i - 1][j] += c[k % 2][i][j];
							c[(k + 1) % 2][i][j + 1] += c[k % 2][i][j];
							c[(k + 1) % 2][i][j - 1] += c[k % 2][i][j];
							c[(k + 1) % 2][i + 1][j + 1] += c[k % 2][i][j];
							c[(k + 1) % 2][i - 1][j - 1] += c[k % 2][i][j];
							c[(k + 1) % 2][i + 1][j - 1] += c[k % 2][i][j];
							c[(k + 1) % 2][i - 1][j + 1] += c[k % 2][i][j];
					}
				}
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				System.out.print(c[n % 2][i][j]);

				if (j == 9)
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}

		}
		return 0;
	}



}

