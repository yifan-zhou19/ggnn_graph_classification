package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[105][105];
	public static int Main()
	{
		int m;
		int n;
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int inow = 1;
		int jnow = 1;
		int f = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		while (true)
		{
			System.out.print(a[inow][jnow]);
			System.out.print("\n");
			a[inow][jnow] = 0;
			if (a[inow + dx[f]][jnow + dy[f]] > 0)
			{
				inow = inow + dx[f];
				jnow = jnow + dy[f];
			}
			else
			{
				f = (f + 1) % 4;
				if (a[inow + dx[f]][jnow + dy[f]] == 0)
				{
					break;
				}
				else
				{
					inow = inow + dx[f];
					jnow = jnow + dy[f];
				}
			}
		}
		return 0;
	}
}

