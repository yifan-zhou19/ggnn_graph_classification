package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	int[][] a = new int[n + 2][m + 2];
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < m;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
	}
	}
	for (i = 0;i < n;i++)
	{
		a[i][m] = a[i][0];
		a[i][m + 1] = 0;
	}
	for (j = 0;j < m;j++)
	{
		a[n][j] = a[0][j];
		a[n + 1][j] = 0;
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < m;j++)
	{
		if (a[i][j] > a[i][m])
		{
			a[i][m] = a[i][j];
			a[i][m + 1] = j;
		}
	if (a[i][j] < a[n][j])
	{
		a[n][j] = a[i][j];
		a[n + 1][j] = i;
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (a[n + 1][a[i][m + 1]] == i)
	{
		System.out.printf("%d+%d\n",i,a[i][m + 1]);
		t = 1;
	}
	}
	if (t == 0)
	{
		System.out.print("No\n");
	}
	return 0;
	}
}

