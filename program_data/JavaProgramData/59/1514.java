package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*????? 1300012707 **
	//*???2013.11.06  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int m;
		int num;
		int i;
		int j;
		char c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = 0;
		for (i = 1; i <= n; i = i + 1)
		{
			for (j = 1; j <= n; j = j + 1)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '@')
				{
					num = num + 1;
					a[i][j] = 1;
				}
				if (c == '.')
				{
					a[i][j] = 0;
				}
				if (c == '#')
				{
					a[i][j] = -1;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2; k <= m; k = k + 1)
		{
			for (i = 1; i <= n; i = i + 1)
			{
				for (j = 1; j <= n; j = j + 1)
				{
					if ((a[i][j] > 0) && (a[i][j] < k))
					{
						if ((a[i + 1][j] == 0) && (i < n))
						{
							a[i + 1][j] = k;
							num = num + 1;
						}
						if ((a[i - 1][j] == 0) && (i > 1))
						{
							a[i - 1][j] = k;
							num = num + 1;
						}
						if ((a[i][j + 1] == 0) && (j < n))
						{
							a[i][j + 1] = k;
							num = num + 1;
						}
						if ((a[i][j - 1] == 0) && (j > 1))
						{
							a[i][j - 1] = k;
							num = num + 1;
						}
					}
				}
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}
}

