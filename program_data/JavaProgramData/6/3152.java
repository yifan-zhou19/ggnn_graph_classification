package <missing>;

public class GlobalMembers
{
	public static int num;
	public static int n;
	public static int m;
	public static int[][] a = new int[100][100];
	public static int Main()
	{
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int x = 0;x < num;x++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (int i = 0;i < m;i++)
				{
				for (int j = 0;j < n;j++)
				{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				}
				int ans = 0;
				for (int i = 0;i < m;i++)
				{
				ans += a[i][0] + a[i][n - 1];
				}
				for (int i = 1;i < n - 1;i++)
				{
				ans += a[0][i] + a[m - 1][i];
				}
				System.out.print(ans);
				System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

