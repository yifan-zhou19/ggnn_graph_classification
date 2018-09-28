package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int I;
	int m;
	int n;
	int[][] a = new int[100][100];
	int i;
	int j;
	int k;
	int sum;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		I = Integer.parseInt(tempVar);
	}
	for (k = 0;k < I;k++)
	{
	sum = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[i][j] = Integer.parseInt(tempVar4);
	}
	}
	}
	for (i = 0;i < m;i++)
	{
	sum = sum + a[i][0] + a[i][n - 1];
	}
	for (i = 0;i < n;i++)
	{
	sum = sum + a[0][i] + a[m - 1][i];
	}
	sum = sum - a[0][0] - a[0][n - 1] - a[m - 1][n - 1] - a[m - 1][0];
	if ((m == n) && (m == 1))
	{
	sum = a[0][0];
	}
	System.out.printf("%d\n",sum);
	}
	return 0;
	}
}

