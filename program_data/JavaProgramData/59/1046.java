package <missing>;

public class GlobalMembers
{
	public static char[][][] a = new char[2][200][200];
	public static int n;
	public static int m;
	public static int[] dx = {1, 0, -1, 0};
	public static int[] dy = {0, 1, 0, -1};
	public static void spread(int i)
	{
		int ii = (i + 1) % 2;
		for (int j = 1;j <= n;j++)
		{
			for (int k = 1;k <= n;k++)
			{
				if (a[i][j][k] == '@')
				{
					for (int l = 0;l < 4;l++)
					{
						if (a[i][j + dx[l]][k + dy[l]] != '#')
						{
							a[ii][j + dx[l]][k + dy[l]] = '@';
						}
					}
				}
			}
		}
	}

	public static int sum(int i)
	{
		int num = 0;
		for (int j = 1;j <= n;j++)
		{
			for (int k = 1;k <= n;k++)
			{
				if (a[i][j][k] == '@')
				{
					num++;
				}
			}
		}
		return num;
	}

	public static int Main()
	{
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n;j++)
		{
			for (int k = 1;k <= n;k++)
			{
				a[0][j][k] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				a[1][j][k] = a[0][j][k];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m != 1)
		{
			spread(i);
			i = (i + 1) % 2;
			m--;
		}
		System.out.print(sum(i));
		return 0;
	}



}

