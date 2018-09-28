package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int r = 0;
	public static char[][] a = new char[100][101];
	public static char[][] b = new char[100][101];
	public static void cr(String[] a)
	{
		for (i = 0;i < n;i++)
		{
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i][j] == '@')
				{
					if (i != 0 && b[i - 1][j] == '.')
					{
						a[i - 1][j] = '@';
					}
					if (j != 0 && b[i][j - 1] == '.')
					{
						a[i][j - 1] = '@';
					}
					if (i != n - 1 && b[i + 1][j] == '.')
					{
						a[i + 1][j] = '@';
					}
					if (j != n - 1 && b[i][j + 1] == '.')
					{
						a[i][j + 1] = '@';
					}
				}
			}
		}
		m = m - 1;
		if (m != 1)
		{
			cr(a);
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		cr(a);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					r++;
				}
			}
		}
		System.out.printf("%d",r);
		return 0;
	}
}

