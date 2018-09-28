package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[110][110];
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < m;j++)
			{
				map[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < n + m - 1;i++)
		{
			for (int j = i;j >= 0;j--)
			{
				int k = i - j;
				if (k >= 0 && k < n && j < m)
				{
					System.out.print(map[k][j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

