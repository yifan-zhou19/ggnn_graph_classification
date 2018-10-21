package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[100][100];
	int[][] b = new int[100][100];
	int i;
	int j;
	int l;
	int m;
	int n;
	int c = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		a[i][j] = tempVar2.charAt(0);
	}
	if (a[i][j] == '@')
	{
		b[i][j] = 1;
	}
	}
	scanf("\n");
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (l = 2;l <= m;l++)
	{
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (a[i][j] == '@')
	{
	if ((i - 1 >= 0) && a[i - 1][j] != '#')
	{
		b[i - 1][j] = 1;
	}
	if ((i + 1 < n) && a[i + 1][j] != '#')
	{
		b[i + 1][j] = 1;
	}
	if ((j - 1 >= 0) && a[i][j - 1] != '#')
	{
		b[i][j - 1] = 1;
	}
	if ((j + 1 < n) && a[i][j + 1] != '#')
	{
		b[i][j + 1] = 1;
	}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[i][j] == 1)
	{
		a[i][j] = '@';
	}
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	if (b[i][j] == 1)
	{
		c++;
	}
	}
	}
	System.out.printf("%d",c);
	return 0;
	}
}

