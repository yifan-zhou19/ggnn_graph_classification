package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[101][101];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < m + n - 1;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (j < m && (i - j) < n)
				{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

