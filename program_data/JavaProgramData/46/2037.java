package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[100][100];
	int m;
	int n;
	int b = 0;

	int i;
	int j;
	int c = 0;
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
	b = m * n;
	for (i = 0;i < m;i++)
	{
				for (int j = 0;j < n;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar3);
					}
				}
	}
	for (int h = 0;;h++)
	{
	for (j = 0 + h;j < n - h;j++)
	{
	System.out.printf("%d\n",sz[h][j]);
	c++;
	}
	if (b == c)
	{
		break;
	}
	for (i = 1 + h;i < m - h;i++)
	{
	System.out.printf("%d\n",sz[i][n - 1 - h]);
	c++;
	}
	if (b == c)
	{
		break;
	}
	for (j = n - 2 - h;j >= 0 + h;j--)
	{
	System.out.printf("%d\n",sz[m - 1 - h][j]);
	c++;
	}
	if (b == c)
	{
		break;
	}
	for (i = m - 2 - h;i > h;i--)
	{
	System.out.printf("%d\n",sz[i][h]);
	c++;
	}
	if (b == c)
	{
		break;
	}
	}
	return 0;

	}
}

