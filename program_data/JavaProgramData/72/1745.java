package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] dk = new int[MAX + 2][MAX + 2];
	int i;
	int j;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
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
				dk[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 1;i <= m;i++)
	{
		dk[i][0] = dk[i][n + 1] = 0;
	}
	for (j = 1;j <= n;j++)
	{
		dk[0][j] = dk[m + 1][j] = 0;
	}
	for (i = 1;i <= m;i++)
	{
		for (j = 1;j <= n;j++)
		{
			if (dk[i][j] >= dk[i + 1][j] != 0 && dk[i][j] >= dk[i - 1][j] != 0 && dk[i][j] >= dk[i][j + 1] != 0 && dk[i][j] >= dk[i][j - 1])
			{
			System.out.printf("%d %d\n",i - 1,j - 1);
			}
		}
	}
	return 0;
	}
}

