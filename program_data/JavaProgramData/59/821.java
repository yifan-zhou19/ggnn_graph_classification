package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[][] a = new int[120][120];
		int n;
		int m;
		int i;
		int j;
		int k;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '#')
				{
					a[i][j] = -1; //???
				}
				if (c == '@')
				{
					a[i][j] = 1; //?????
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2; k <= m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
				if (a[i][j] < k && a[i][j]>0) //?????????????
				{
					if (a[i - 1][j] == 0)
					{
						a[i - 1][j] = k;
					}
					if (a[i + 1][j] == 0)
					{
						a[i + 1][j] = k;
					}
					if (a[i][j - 1] == 0)
					{
						a[i][j - 1] = k;
					}
					if (a[i][j + 1] == 0)
					{
						a[i][j + 1] = k;
					}
				}
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] > 0)
				{
					num++;
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
	return 0;
	}
}

