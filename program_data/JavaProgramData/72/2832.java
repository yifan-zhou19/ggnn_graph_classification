package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int[][] sz = new int[22][22];
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
	for (int k = 0;k < m;k++)
	{
	for (int l = 0;l < n;l++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sz[k][l]) = Integer.parseInt(tempVar3);
	}
	}
	}
	for (int i = 0; i < m;i++)
	{
	for (int j = 0; j < n;j++)
	{
	if (i == 0)
	{
		if (((j == 0) && (sz[i][j] >= sz[i + 1][j]) && (sz[i][j] >= sz[i][j + 1])) || ((j == n - 1) && (sz[i][j] >= sz[i + 1][j]) && (sz[i][j] >= sz[i][j - 1])) || ((sz[i][j] >= sz[i][j - 1]) && (sz[i][j] >= sz[i][j + 1]) && (sz[i][j] >= sz[i + 1][j])))
		{
			System.out.printf("%d %d\n",i,j);
		}
	}
	else
	{
	if (i == m - 1)
	{
		if (((j == 0) && (sz[i][j] >= sz[i - 1][j]) && (sz[i][j] >= sz[i][j + 1])) || ((j == n - 1) && (sz[i][j] >= sz[i - 1][j]) && (sz[i][j] >= sz[i][j - 1])) || ((sz[i][j] >= sz[i][j - 1]) && (sz[i][j] >= sz[i][j + 1]) && (sz[i][j] >= sz[i - 1][j])))
		{
			System.out.printf("%d %d\n",i,j);
		}
	}
	else
	{
		if (((j == 0) && (sz[i][j] >= sz[i + 1][j]) && (sz[i][j] >= sz[i][j + 1]) && (sz[i][j] >= sz[i - 1][j])) || ((j == n - 1) && (sz[i][j] >= sz[i - 1][j]) && (sz[i][j] >= sz[i + 1][j]) && (sz[i][j] >= sz[i][j - 1])) || ((sz[i][j] >= sz[i][j - 1]) && (sz[i][j] >= sz[i][j + 1]) && (sz[i][j] >= sz[i - 1][j]) && (sz[i][j] >= sz[i + 1][j])))
		{
			System.out.printf("%d %d\n",i,j);
		}
	}
	}
	}
	}
	return 0;
	}
}

