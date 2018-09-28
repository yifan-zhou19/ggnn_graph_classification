package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][][] a = new int[11][11][2];
		for (i = 0;i < 11;i++)
		{
			for (j = 0;j < 11;j++)
			{
				a[i][j][0] = 0;
			}
		}
		a[5][5][0] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j][1] = a[i][j][0] * 2 + a[i][j - 1][0] + a[i][j + 1][0] + a[i + 1][j][0] + a[i - 1][j][0] + a[i + 1][j + 1][0] + a[i - 1][j - 1][0] + a[i + 1][j - 1][0] + a[i - 1][j + 1][0];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j][0] = a[i][j][1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			System.out.print(a[i][1][1]);
			for (j = 2;j <= 9;j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j][1]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

