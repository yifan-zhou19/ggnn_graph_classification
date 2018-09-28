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
	int[][] data = new int[100][100];
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
	int i;
	int j;
	for (i = 0;i < m;i++)
	{
	for (j = 0;j < n;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			data[i][j] = Integer.parseInt(tempVar4);
		}
	}
	}
	int sum = 0;
	for (i = 0; i < m; i++)
	{
		sum = sum + data[i][0] + data[i][n - 1];
	}
	for (i = 1; i < n - 1; i++)
	{
		sum = sum + data[0][i] + data[m - 1][i];
	}
	System.out.printf("%d\n", sum);
	}
	}
}

