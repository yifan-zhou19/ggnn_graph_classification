package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[21][21];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i <= n + 1;i++)
		{
			for (int j = 0;j <= m + 1;j++)
			{
				if (i == 0 || j == 0 || i == n + 1 || j == m + 1)
				{
					a[i][j] = 0;
				}
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= m;j++)
			{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

