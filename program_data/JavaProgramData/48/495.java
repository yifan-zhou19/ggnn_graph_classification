package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][][] a = new int[11][11][6];
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5][1] = m;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j < 10;j++)
			{
				for (k = 1;k < 10;k++)
				{
					a[j][k][i + 1] = 2 * a[j][k][i] + a[j - 1][k - 1][i] + a[j - 1][k][i] + a[j - 1][k + 1][i] + a[j][k - 1][i] + a[j][k + 1][i] + a[j + 1][k - 1][i] + a[j + 1][k][i] + a[j + 1][k + 1][i];
				}
			}
		}
		for (j = 1;j < 10;j++)
		{
			for (k = 1;k < 9;k++)
			{
				System.out.print(a[j][k][n + 1]);
				System.out.print(" ");
			}
			System.out.print(a[j][9][n + 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

