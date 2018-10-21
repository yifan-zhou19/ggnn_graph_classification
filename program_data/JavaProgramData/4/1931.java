package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n;i++)
		{
			int u = i;
			int j = 1;
			for (;u >= 1 && j <= m;u--, j++)
			{
				System.out.print(a[j][u]);
				System.out.print("\n");
			}
		}
		for (i = 2;i <= m;i++)
		{
			int u = i;
			int j = n;
			for (;u <= m != 0 && j >= 1;u++, j--)
			{
				System.out.print(a[u][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

