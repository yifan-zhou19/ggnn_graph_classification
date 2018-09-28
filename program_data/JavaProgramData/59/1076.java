package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int n;
	int m;
	int[][] aa = new int[101][101];
	int ans;
	char[][] ss = new char[101][101];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n;i++)
	{
	aa[i][0] = 0;
	aa[0][i] = 0;
	aa[n + 1][i] = 0;
	aa[i][n + 1] = 0;
	}
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ss[i][j] = tempVar2.charAt(0);
		}
		aa[i][j] = 0;
		if (ss[i][j] == '@')
		{
			aa[i][j] = 1;
		}
		}
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			ss[i][j] = tempVar3.charAt(0);
		}
		aa[i][j] = 0;
		if (ss[i][j] == '@')
		{
			aa[i][j] = 1;
		}
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	for (i = 2;i <= m;i++)
	{
	for (j = 1;j <= n;j++)
	{
	for (k = 1;k <= n;k++)
	{
		if (aa[j][k] != i - 1 && ss[j][k] != '#')
		{
		if (aa[j][k + 1] == i - 1 || aa[j + 1][k] == i - 1 || aa[j][k - 1] == i - 1 || aa[j - 1][k] == i - 1)
		{
			aa[j][k] = i;
		}
		}
	}
	}
	}
	ans = 0;
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
	if (aa[i][j] > 0)
	{
		ans++;
	}
	}
	}
	System.out.printf("%d",ans);
	return 0;
	}
}

