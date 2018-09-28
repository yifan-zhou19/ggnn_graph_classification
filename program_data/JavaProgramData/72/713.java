package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[22][22];
	public static int n;
	public static int m;
	public static int Main()
	{
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n + 1;i++)
		{
		for (j = 0;j <= m + 1;j++)
		{
		a[i][j] = 0;
		}
		}
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= m;j++)
		{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= m;j++)
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

