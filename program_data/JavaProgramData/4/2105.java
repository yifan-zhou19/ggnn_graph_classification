package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int j = 0;j < m + n - 1;j++)
		{
			for (int i = Math.max(0,j - m + 1);i < Math.min(n,j + 1);i++)
			{
				System.out.print(a[i][j - i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

