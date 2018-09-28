package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[30][30];
		int m = 0;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (i >= 1 && a[i - 1][j] > a[i][j])
				{
					continue;
				}
				if (i < m - 1 && a[i + 1][j]> a[i][j])
				{
					continue;
				}
				if (j >= 1 && a[i][j - 1] > a[i][j])
				{
					continue;
				}
				if (j < n - 1 && a[i][j + 1]> a[i][j])
				{
					continue;
				}
				System.out.print(i);
				System.out.print(' ');
				System.out.print(j);
				System.out.print("\n");
			}
		}
			return 0;
	}
}

