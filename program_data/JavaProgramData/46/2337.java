package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int k;
	int s;
	int q;
	int w;
	int e;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[][] a = new int[n][m];
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < m;k++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(a[i][k]) = Integer.parseInt(tempVar3);
	}
	}
	}
	s = 0;
	for (k = 0;s <= m * n;k++)
	{
	for (q = k;q <= m - k - 1;q++)
	{
	System.out.printf("%d\n",a[k][q]);
	s = s + 1;
	}
	if (s == m * n)
	{
	break;
	}
	for (w = k + 1;w <= n - k - 1;w++)
	{
	System.out.printf("%d\n",a[w][m - k - 1]);
	s = s + 1;
	}
	if (s == m * n)
	{
	break;
	}
	for (e = m - k - 2;e >= k;e--)
	{
	System.out.printf("%d\n",a[n - k - 1][e]);
	s = s + 1;
	}
	if (s == m * n)
	{
	break;
	}
	for (r = n - k - 2;r >= k + 1;r--)
	{
	System.out.printf("%d\n",a[r][k]);
	s = s + 1;
	}
	if (s == m * n)
	{
	break;
	}
	}
	return 0;
	}
}

