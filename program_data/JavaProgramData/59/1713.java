package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int m;
		int s = 0;
		int[][] d = new int[102][102];
		char[][] p = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				p[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (p[i][j] == '@')
				{
					d[i][j] = 1;
				}
			}
		}
		System.in.read();
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1;t <= m - 1;t++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					  if (d[i][j] == 1)
					  {
						 if (p[i + 1][j] != '#')
						 {
							 p[i + 1][j] = '@';
						 }
						 if (p[i - 1][j] != '#')
						 {
							 p[i - 1][j] = '@';
						 }
						 if (p[i][j + 1] != '#')
						 {
							 p[i][j + 1] = '@';
						 }
						 if (p[i][j - 1] != '#')
						 {
							 p[i][j - 1] = '@';
						 }
					  }
				}
			}
			for (i = 1;i <= n;i++)
			{
				 for (j = 1;j <= n;j++)
				 {
					if (p[i][j] == '@')
					{
						d[i][j] = 1;
					}
				 }
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				s += d[i][j];
			}
		}
		System.out.print(s);
		System.out.print('\n');
		return 0;
	}




}

