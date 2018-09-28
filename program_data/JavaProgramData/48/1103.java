package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
			a[i][j] = 0;
			}
		}
		a[5][5] = m;
		for (int k = 1; k <= n; k++)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
				b[i][j] = a[i][j];
				}
			}
				for (i = 1; i <= 9; i++)
				{
				for (j = 1; j <= 9; j++)
				{
				if (b[i][j] != 0)
				{
					   a[i][j] -= b[i][j];
					   if (i <= 8 && i >= 2 && j <= 8 && j >= 2)
					   {
						   for (int p = i - 1; p <= i + 1; p++)
						   {
							  for (int q = j - 1; q <= j + 1; q++)
							  {
							  a[p][q] += b[i][j];
							  }
						   }
						   a[i][j] += b[i][j];

					   }
				}
				}
				}
		}
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
		return 0;
	}

}

