package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int t;
	int i;
	int m;
	int k;
	int c;
	m = 0;
	c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] a =
	{
		{'.', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	for (i = 1;i <= n;i++)
	{
	for (t = 1;t <= n - 1;t++)
	{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a[i][t] = tempVar2.charAt(0);
		}
	}
	if (t == n)
	{
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			a[i][t] = tempVar3.charAt(0);
		}
	}
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	for (k = 1;k < m;k++)
	{
	for (i = 1;i <= n;i++)
	{
	for (t = 1;t <= n;t++)
	{
	if (a[i][t] == '@' && a[i][t - 1] == '.')
	{
	a[i][t - 1] = 'A';
	}
	if (a[i][t] == '@' && a[i - 1][t] == '.')
	{
	a[i - 1][t] = 'A';
	}
	if (a[i][t] == '@' && a[i][t + 1] == '.')
	{
	a[i][t + 1] = 'A';
	}
	if (a[i][t] == '@' && a[i + 1][t] == '.')
	{
	a[i + 1][t] = 'A';
	}
	}
	}
	for (t = 1;t <= n;t++)
	{
	for (i = 1;i <= n;i++)
	{
		if (a[i][t] == 'A')
		{
			a[i][t] = '@';
		}
	}
	}
	}
	for (t = 1;t <= n;t++)
	{
	for (i = 1;i <= n;i++)
	{
		if (a[i][t] == '@')
		{
			c++;
		}
	}
	}
	System.out.printf("%d",c);
	return 0;
	}
}

