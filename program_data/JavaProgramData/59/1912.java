package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[100][100];
	int j;
	int i;
	int n;
	int m;
	int s = 0;
	int p;
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
		}
	}
	for (i = 0;i <= n + 1;i++)
	{
		a[i][0] = '#';
		a[i][n + 1] = '#';
	}
	for (j = 1;j <= n;j++)
	{
		a[0][j] = '#';
		a[n + 1][j] = '#';
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (p = 0;p < m - 1;p++)
	{
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					if (a[i][j - 1] == '.')
					{
						a[i][j - 1] = 't';
					}
					if (a[i][j + 1] == '.')
					{
						a[i][j + 1] = 't';
					}
					if (a[i - 1][j] == '.')
					{
						a[i - 1][j] = 't';
					}
					if (a[i + 1][j] == '.')
					{
						a[i + 1][j] = 't';
					}
				}
			}
		}
			for (i = 1;i <= n;i++)
			{
			 for (j = 1;j <= n;j++)
			 {
			   if (a[i][j] == 't')
			   {
			   a[i][j] = '@';
			   }
			 }
			}
	}
	 for (i = 1;i <= n;i++)
	 {
	   for (j = 1;j <= n;j++)
	   {
		   if (a[i][j] == '@')
		   {
			   s = s + 1;
		   }
	   }
	 }


	System.out.printf("%d",s);

		return 0;
	}
}

