package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] s = new int[102][102];
		int n; //?????.?1 ?????#?0 ???@?3
		int m;
		int i;
		int j;
		int l;
		int count = 0;
		char x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				x = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (x == '.')
				{
						a[i][j] = 1;
						s[i][j] = 1;
				}
				if (x == '#')
				{
						a[i][j] = 0;
						s[i][j] = 0;
				}
				if (x == '@')
				{
						a[i][j] = 3;
						count++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= m - 1;l++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 1 && (a[i - 1][j] == 3 || a[i + 1][j] == 3 || a[i][j + 1] == 3 || a[i][j - 1] == 3))
					{
						s[i][j] = 3;
						count++;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = s[i][j];
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}




}

