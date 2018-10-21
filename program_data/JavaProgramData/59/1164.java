package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[101][101];
	char q;
	int k;
	int n;
	int i;
	int j;
	int m;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		q = tempVar2.charAt(0);
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			a[i][j] = tempVar3.charAt(0);
		}
	if (j == n)
	{
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			q = tempVar4.charAt(0);
		}
	}
	}
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		m = Integer.parseInt(tempVar5);
	}
	for (k = 2;k <= m;k++)
	{
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (a[i][j] == '@')
	{
		if ((i - 1 != 0) && (a[i - 1][j] == '.'))
		{
			a[i - 1][j] = ',';
		}
		if ((i + 1 != n + 1) && (a[i + 1][j] == '.'))
		{
			a[i + 1][j] = ',';
		}
		if ((j - 1 != 0) && (a[i][j - 1] == '.'))
		{
			a[i][j - 1] = ',';
		}
		if ((j + 1 != 0) && (a[i][j + 1] == '.'))
		{
			a[i][j + 1] = ',';
		}
	}
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (a[i][j] == ',')
	{
		a[i][j] = '@';
	}
	}
	}
	}
	s = 0;
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

