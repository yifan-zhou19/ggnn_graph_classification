package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	while (k-- != 0)
	{
	int m;
	int n;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	int[][] a = new int[101][101];
	for (int i = 0;i < m;i++)
	{
	for (int j = 0;j < n;j++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		a[i][j] = Integer.parseInt(tempVar4);
	}
	}
	}
	int sum = 0;
	for (int i = 0;i < m;i++)
	{
	sum = sum + a[i][0] + a[i][n - 1];
	}
	for (int i = 1;i < n - 1;i++)
	{
	sum = sum + a[0][i] + a[m - 1][i];
	}
	System.out.printf("%d\n",sum);
	}
	return 0;
	}
}

