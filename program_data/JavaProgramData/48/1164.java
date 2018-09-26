package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int n;
		int day;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[4][4] = n;

		for (int i = 1; i <= day; i++)
		{
			int[][] b =
			{
				{0, 0, 0, 0, 0, 0, 0, 0, 0}
			};

			for (int j = 0; j < 9; j++)
			{
			for (int k = 0; k < 9; k++)
			{
				if (a[j][k] != 0)
				{
					b[j][k] += a[j][k];
					b[j - 1][k - 1] += a[j][k];
					b[j - 1][k] += a[j][k];
					b[j - 1][k + 1] += a[j][k];
					b[j][k - 1] += a[j][k];
					b[j][k + 1] += a[j][k];
					b[j + 1][k - 1] += a[j][k];
					b[j + 1][k] += a[j][k];
					b[j + 1][k + 1] += a[j][k];
				}
			}
			}

			for (int j = 0; j < 9; j++)
			{
			for (int k = 0; k < 9; k++)
			{
			a[j][k] += b[j][k];
			}
			}
		}

		for (int i = 0; i < 9; i++)
		{
			System.out.print(a[i][0]);

			for (int j = 1; j < 9; j++)
			{
			System.out.print(" ");
			System.out.print(a[i][j]);
			}

			System.out.print("\n");
		}

		return 0;
	}
}

