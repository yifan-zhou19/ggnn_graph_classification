package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] sz = new int[255][255];
	int m;
	int n;
	int a;
	int i;
	int j;
	int row;
	int col;
	a = 0;
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
	for (row = 0;row < m;row++)
	{
		for (col = 0;col < n;col++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[row][col] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (sz[i][j] - sz[i][j + 1] >= 0 && sz[i][j] - sz[i][j - 1] >= 0 && sz[i][j] - sz[i - 1][j] >= 0 && sz[i][j] - sz[i + 1][j] >= 0)
			{
			System.out.printf("%d %d\n",i,j);
			}
		}
	}


	return 0;
	}
}

