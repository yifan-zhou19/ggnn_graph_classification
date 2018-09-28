package <missing>;

public class GlobalMembers
{
	public static char[][][] m = new char[100][100][100];
	public static int n;
	public static int Main()
	{
		int i;
		int j;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				cin.get(m[0][i][j]);
			}
			System.in.read();
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		int flag = 0;
		int count = 0;
		for (t = 1;t < d;t++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					flag = 0;
					if (i > 0)
					{
						if (m[t - 1][i - 1][j] == '@')
						{
							flag = 1;
						}
					}
					if (i < n - 1)
					{
						if (m[t - 1][i + 1][j] == '@')
						{
							flag = 1;
						}
					}
					if (j >= 0)
					{
						if (m[t - 1][i][j - 1] == '@')
						{
							flag = 1;
						}
					}
					if (j < n - 1)
					{
						if (m[t - 1][i][j + 1] == '@')
						{
							flag = 1;
						}
					}
					if (flag == 1 && m[t - 1][i][j] != '#')
					{
						m[t][i][j] = '@';
					}
					else
					{
						m[t][i][j] = m[t - 1][i][j];
					}
					if (t == d - 1)
					{
						if (m[t][i][j] == '@')
						{
							count++;
						}
					}
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}
}

