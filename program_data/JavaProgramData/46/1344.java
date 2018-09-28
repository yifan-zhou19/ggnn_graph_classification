package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int time = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m][n];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;;i++)
		{
			for (int j = i;j <= n - 1 - i;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
				time++;
			}
			if (time == m * n)
			{
				break;
			}

			for (int j = i + 1;j <= m - 1 - i;j++)
			{
				System.out.print(a[j][n - i - 1]);
				System.out.print("\n");
				time++;
			}
			if (time == m * n)
			{
				break;
			}

			for (int j = n - i - 2;j >= i;j--)
			{
				System.out.print(a[m - i - 1][j]);
				System.out.print("\n");
				time++;
			}
			if (time == m * n)
			{
				break;
			}

			for (int j = m - i - 2;j >= i + 1;j--)
			{
				System.out.print(a[j][i]);
				System.out.print("\n");
				time++;
			}
			if (time == m * n)
			{
				break;
			}
		}
		return 0;
	}

}

