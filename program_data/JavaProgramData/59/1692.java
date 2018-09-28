package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] h = new char[100][100];
		int n;
		int i;
		int j;
		int l;
		int m;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0 ; i < n ; i++)
		{
			h[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 2 ; l <= m ; l++)
		{
			for (i = 0 ; i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					if (h[i][j] == '@')
					{
						if (h[i + 1][j] == '.')
						{
							h[i + 1][j] = '/';
						}
						if (h[i - 1][j] == '.')
						{
							h[i - 1][j] = '/';
						}
						if (h[i][j + 1] == '.')
						{
							h[i][j + 1] = '/';
						}
						if (h[i][j - 1] == '.')
						{
							h[i][j - 1] = '/';
						}
					}
				}
			}
			for (i = 0 ; i < n ; i++)
			{
				for (j = 0 ; j < n ; j++)
				{
					if (h[i][j] == '/')
					{
						h[i][j] = '@';
					}
				}
			}
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < n ; j++)
			{
				if (h[i][j] == '@')
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

