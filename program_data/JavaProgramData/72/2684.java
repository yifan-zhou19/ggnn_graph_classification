package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int m;
			int n;
			int[][] a = new int[500][500];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			for (int i = 1;i <= m;i++)
			{
						a[i][0] = -1000;
						a[i][n + 1] = -1000;
			}
				for (int j = 1;j <= n;j++)
				{
			a[0][j] = -1000;
			a[m + 1][j] = -1000;
				}
			for (int i = 1;i <= m;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			for (int i = 1;i <= m;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i - 1);
						System.out.print(' ');
						System.out.print(j - 1);
						System.out.print("\n");
					}
				}
			}
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

}

