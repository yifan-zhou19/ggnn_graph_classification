package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int p = 0;
	int k;
	int i;
	int j;
	char[][] r = new char[101][101];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n + 1;i++)
	{
	for (j = 0;j <= n + 1;j++)
	{
	r[i][j] = '#';
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		r[i][j] = tempVar2.charAt(0);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead(null, 1);
	if (tempVar3 != null)
	{
		r[i][n] = tempVar3.charAt(0);
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
	for (j = 1;j <= n;j++)
	{
	if (r[i][j] == '@')
	{
	if (r[i - 1][j] == '.')
	{
	r[i - 1][j] = 'a';
	}
	if (r[i + 1][j] == '.')
	{
	r[i + 1][j] = 'a';
	}
	if (r[i][j - 1] == '.')
	{
	r[i][j - 1] = 'a';
	}
	if (r[i][j + 1] == '.')
	{
	r[i][j + 1] = 'a';
	}
	}
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (r[i][j] == 'a')
	{
	r[i][j] = '@';
	}
	}
	}
	}
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (r[i][j] == '@')
	{
	p = p + 1;
	}
	}
	}
	System.out.printf("%d",p);
	return 0;
	}
}

