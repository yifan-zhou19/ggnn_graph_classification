package <missing>;

public class GlobalMembers
{
	public static int p = 0;
	public static int q = 1;
	public static int Main()
	{
		char[][] a = new char[110][110];
		int i;
		int j;
		int n;
		int m;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 for (j = 0;j <= n - 1;j++)
						 {
										  if (a[i][j] == '@')
										  {
										  p++;
										  }
						 }
		}
		int f = new int(int m,int n,char a[][110]);
		c = f(m, n, a);
		System.out.print(c);
		return 0;
	}
	public static int f(int m, int n, String[] a)
	{
		int i;
		int j;
		if (q == m)
		{
		return p;
		}
		else
		{
		int[][] b = new int[110][110];
		for (i = 1;i <= n;i++)
		{
						 for (j = 0;j <= n - 1;j++)
						 {
											if ((a[i][j].equals('@')) && (b[i][j] == 0))
											{
												 if (a[i][j + 1].equals('.'))
												 {
													p++;
													a[i][j + 1] = '@';
													b[i][j + 1] = 1;
												 }
												 if (a[i][j - 1].equals('.'))
												 {
															   p++;
															   a[i][j - 1] = '@';
															   b[i][j - 1] = 1;
												 }
												 if (a[i + 1][j].equals('.'))
												 {
															   p++;
															   a[i + 1][j] = '@';
															   b[i + 1][j] = 1;
												 }
												 if (a[i - 1][j].equals('.'))
												 {
															   p++;
															   a[i - 1][j] = '@';
															   b[i - 1][j] = 1;
												 }
											}
						 }
		}
												 q++;
												 return f(m, n, a);
		}
	}
}

