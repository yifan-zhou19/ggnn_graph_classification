package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int i;
		int i0;
		int j;
		int m;
		char[][] a = new char[101][101];
		char[][] b = new char[101][101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i0 = 1;i0 < m;i0++)
		{
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
			b[i][j] = a[i][j];
		}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
						if (b[i][j] != '@')
						{
							continue;
						}
						if (i == 0 && b[i + 1][j] != '#')
						{
							a[i + 1][j] = '@';
						}
						else
						{
						if (i == (n - 1) && b[i - 1][j] != '#')
						{
							a[i - 1][j] = '@';
						}
						else
						{
							if (b[i + 1][j] != '#')
							{
								a[i + 1][j] = '@';
							}
						if (b[i - 1][j] != '#')
						{
							a[i - 1][j] = '@';
						}
						}
						}
						if (j == 0 && b[i][j + 1] != '#')
						{
							a[i][j + 1] = '@';
						}
						else
						{
						if (j == (n - 1) && b[i][j - 1] != '#')
						{
							a[i][j - 1] = '@';
						}
						else
						{
							if (b[i][j + 1] != '#')
							{
								a[i][j + 1] = '@';
							}
						if (b[i][j - 1] != '#')
						{
							a[i][j - 1] = '@';
						}
						}
						}
		}
		}
		}
		s = 0;
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < n;j++)
		{
		if (a[i][j] == '@')
		{
			s++;
		}
		}
		}
		System.out.printf("%d\n",s);
		return 0;
	}

}

