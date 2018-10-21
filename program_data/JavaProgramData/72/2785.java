package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[22][22];
		int[][] b = new int[22][22];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (b[i][j] < a[i - 1][j])
				{
					b[i][j] = a[i - 1][j];
				}
				if (b[i][j] < a[i + 1][j])
				{
					b[i][j] = a[i + 1][j];
				}
				if (b[i][j] < a[i][j - 1])
				{
					b[i][j] = a[i][j - 1];
				}
				if (b[i][j] < a[i][j + 1])
				{
					b[i][j] = a[i][j + 1];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i + 1][j + 1] >= b[i + 1][j + 1])
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

