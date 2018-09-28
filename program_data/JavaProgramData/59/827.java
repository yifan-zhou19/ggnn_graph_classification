package <missing>;

public class GlobalMembers
{
	//shu ru fa huai le bu xie zhu shi le = =!
	public static void f(String[] a, int m)
	{
		int d = 0;
		int[][] position = new int[10000][2];
		if (m > 1)
		{
			f(a, m - 1);
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j].equals('@'))
					{
						position[d][0] = i;
						position[d++][1] = j;
					}
				}
			}
			//cout<<d<<endl;
			for (i = 0;i < d;i++)
			{
				g(a, position[i][0], position[i][1]);
			}
		}
	}
	public static void g(String[] a, int x, int y)
	{
		if (x - 1 >= 0)
		{
			if (a[x - 1][y].equals('.'))
			{
				a[x - 1][y] = '@';
			}
		}
		if (x + 1 < n)
		{
			if (a[x + 1][y].equals('.'))
			{
				a[x + 1][y] = '@';
			}
		}
		if (y - 1 >= 0)
		{
			if (a[x][y - 1].equals('.'))
			{
				a[x][y - 1] = '@';
			}
		}
		if (y + 1 < n)
		{
			if (a[x][y + 1].equals('.'))
			{
				a[x][y + 1] = '@';
			}
		}
	}
	public static int n;
	public static int Main()
	{
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		char[][] a = new char[100][100];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(a, m);
		int t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					t++;
				}
			}
		}
		System.out.print(t);
		return 0;
	}
	public static int i;
	public static int j;

}

