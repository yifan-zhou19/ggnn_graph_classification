package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		char c;
		int i;
		int j;
		int n;
		int d;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				c = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (c == '.')
				{
					a[i][j] = b[i][j] = 1;
				}
				if (c == '@')
				{
					a[i][j] = b[i][j] = -1;
				}
				if (c == '#')
				{
					a[i][j] = b[i][j] = 0;
				}
			}
		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d--;
		while (d-- != 0)
		{

			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					if (a[i][j] == -1)
					{
						if (b[i][j + 1] == 1)
						{
							b[i][j + 1] = -1;
						}
						if (b[i][j - 1] == 1)
						{
							b[i][j - 1] = -1;
						}
						if (b[i - 1][j] == 1)
						{
							b[i - 1][j] = -1;
						}
						if (b[i + 1][j] == 1)
						{
							b[i + 1][j] = -1;
						}
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] == -1)
				{
					k++;
				}
			}
		}
			System.out.print(k);
		return 0;
	}
}

