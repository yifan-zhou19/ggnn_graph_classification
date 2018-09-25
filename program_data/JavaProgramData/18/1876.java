package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int c = 0 ; c < n ; c++)
		{
			int[][] mat = new int[n][n];
			for (int i = 0 ; i < n ; i++)
			{
			for (int j = 0 ; j < n ; j++)
			{
				mat[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}

			int s = 0;
			for (int r = n ; r > 1 ; r--)
			{
				int m;
				//row
				for (int i = 0 ; i < r ; i++)
				{
					m = mat[i][0];
					for (int j = 1 ; j < r ; j++)
					{
						m = Math.min(m, mat[i][j]);
					}
					for (int j = 0 ; j < r ; j++)
					{
						mat[i][j] -= m;
					}
				}
				//column
				for (int j = 0 ; j < r ; j++)
				{
					m = mat[0][j];
					for (int i = 1 ; i < r ; i++)
					{
						m = Math.min(m, mat[i][j]);
					}
					for (int i = 0 ; i < r ; i++)
					{
						mat[i][j] -= m;
					}
				}

				s += mat[1][1];
				for (int i = 1 ; i < r - 1 ; i++)
				{
				for (int j = 0 ; j < r ; j++)
				{
					mat[i][j] = mat[i + 1][j];
				}
				}
				for (int j = 1 ; j < r - 1 ; j++)
				{
				for (int i = 0 ; i < r - 1 ; i++)
				{
					mat[i][j] = mat[i][j + 1];
				}
				}
			}
			System.out.print(s);
			System.out.print("\n");
		}

		return 0;
	}

}

