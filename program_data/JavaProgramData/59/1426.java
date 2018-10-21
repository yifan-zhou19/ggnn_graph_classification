package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[150][150];
		char c;
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '#')
				{
					a[i][j] = -1;
				}
				else if (c == '.')
				{
					a[i][j] = 0;
				}
				else
				{
					a[i][j] = 1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 2;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					if (a[j][k] == i - 1)
					{
						if (a[j - 1][k] == 0)
						{
							a[j - 1][k] = i;
						}
						if (a[j + 1][k] == 0)
						{
							a[j + 1][k] = i;
						}
						if (a[j][k - 1] == 0)
						{
							a[j][k - 1] = i;
						}
						if (a[j][k + 1] == 0)
						{
							a[j][k + 1] = i;
						}
						a[j][k] = i;
					}

				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == m)
				{
					s++;
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

