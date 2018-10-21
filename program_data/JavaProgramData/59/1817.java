package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[102][102];
		char[][] c = new char[102][102];
		int n;
		int i;
		int j;
		int m;
		int t;
		int r = 0;
		int x;
		int y;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,'@',(Character.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		  for (j = 1;j <= n;j++)
		  {
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a[i][j] = tempVar2.charAt(0);
			}
			c[i][j] = a[i][j];
		  }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
	for (t = 1;t < m;t++)
	{
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			if (c[i][j] == '@')
			{
				if (a[i - 1][j] == '.')
				{
					a[i - 1][j] = '@';
				}
				if (a[i + 1][j] == '.')
				{
					a[i + 1][j] = '@';
				}
				if (a[i][j - 1] == '.')
				{
					a[i][j - 1] = '@';
				}
				if (a[i][j + 1] == '.')
				{
					a[i][j + 1] = '@';
				}
			}
		}
		}
		for (x = 1;x <= n;x++)
		{
		for (y = 1;y <= n;y++)
		{
			c[x][y] = a[x][y];
		}
		}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
		if (a[i][j] == '@')
		{
		r += 1;
		}
	}
	}
	System.out.printf("%d\n",r);
	return 0;
	}
}

