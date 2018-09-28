package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int p(String[] a)
	{
		char[][] b = new char[200][200];
		int q = 0;
		int i;
		int j;
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if ((a[i][j].equals('@')) || (a[i][j].equals('.') && (a[i][j + 1].equals('@') || a[i][j - 1].equals('@') || a[i + 1][j].equals('@') || a[i - 1][j].equals('@'))))
				{
					b[i][j] = '@';
					q++;
				}
			}
		}
		for (i = 0;i < n + 2;i++)
		{
			for (j = 0;j < n + 2;j++)
			{
				a[i][j] = b[i][j];
			}
		}
		return q;
	}
	public static int Main()
	{
		int i;
		int[] s = new int[200];
		int j;
		char[][] a = new char[200][200];
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			b = System.in.read();
			for (j = 1;j <= n;j++)
			{
				a[i][j] = System.in.read();
				if (a[i][j] == '@')
				{
					s[1]++;
				}
			}
		}
		b = System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		   for (i = 0;i < n + 2;i++)
		   {
			a[0][i] = a[n + 1][i] = '#';
		   }
		for (i = 0;i < n + 2;i++)
		{
			a[i][0] = a[i][n + 1] = '#';
		}
		for (i = 2;i <= m;i++)
		{
			s[i] = p(a);
		}
		System.out.printf("%d",s[m]);
	}

}

