package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int s;
	int[][] a = new int[2][110];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[0][i] = Integer.parseInt(tempVar3);
	}
	}
	for (j = 1;j <= m;j++)
	{
	a[1][j] = a[0][n - m + j];
	}
	for (k = 1;k <= (n - m);k++)
	{
	a[1][m + k] = a[0][k];
	}
	System.out.printf("%d",a[1][1]);
	for (i = 2;i <= n;i++)
	{
	System.out.printf(" %d",a[1][i]);
	}
	}

}

