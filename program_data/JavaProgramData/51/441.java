package <missing>;

public class GlobalMembers
{
	public static void col(String a, String[] b, int m, int n)
	{
		int i;
		int j;
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a[i + j];
			}
		}
	}
	public static int Main()
	{
		String a = new String(new char[500]);
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0'}
		};
		int n;
		int m;
		int i;
		int j;
		int[] c = new int[500];
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		m = a.length();
		col(a, b, m, n);
		for (i = 0;i <= m - n;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < m - n;i++)
		{
			if (c[i] != 0)
			{
			for (j = i + 1;j <= m - n;j++)
			{
				if (c[j] != 0)
				{
					if (!strcmp(b[i],b[j]))
					{
						c[i]++;
						c[j] = 0;
					}
				}
			}
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			if (c[i] > t)
			{
				t = c[i];
			}
		}
		if (t == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",t);
			for (i = 0;i <= m - n;i++)
			{
				if (c[i] == t)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		return 0;
	}
}

