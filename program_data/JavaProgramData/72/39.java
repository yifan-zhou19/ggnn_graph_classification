package <missing>;

public class GlobalMembers
{
	public static int max(int[][] a, int x, int y)
	{
	if ((a[x][y] >= a[x - 1][y]) && (a[x][y] >= a[x + 1][y]) && (a[x][y] >= a[x][y - 1]) && (a[x][y] >= a[x][y + 1]))
	{
		return (1);
	}
	else
	{
		return (0);
	}
	}

	public static void Main()
	{
	int i;
	int j;
	int m;
	int n;
	int[][] a =
	{
		{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= m;i++)
	{
	for (j = 1;j <= n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 1;i <= m;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (max(a, i, j) != 0)
	{
		System.out.printf("%d %d\n",i - 1,j - 1);
	}
	}
	}
	}
}

