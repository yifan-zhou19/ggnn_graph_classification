package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int k;
	int t;
	int[][] sz = new int[20][20];
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
	for (i = 0;i < m;i++)
	{
		for (k = 0;k < n;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][k] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < m;i++)
	{
		for (k = 0;k < n;k++)
		{
			if (i == 0)
			{
				if (k == 0 && sz[0][0] >= sz[0][1] != 0 && sz[0][0] >= sz[1][0])
				{
					System.out.print("0 0\n");
				}
				else if (k == n - 1 && sz[0][n - 1] >= sz[1][n - 1] != 0 && sz[0][n - 2] <= sz[0][n - 1])
				{
					System.out.printf("0 %d\n",n - 1);
				}
				else if (sz[0][k] >= sz[0][k - 1] != 0 && sz[0][k] >= sz[0][k + 1] != 0 && sz[0][k] >= sz[1][k])
				{
					System.out.printf("0 %d\n",k);
				}
			}
			else if (i == m - 1)
			{
				if (k == 0 && sz[m - 1][0] >= sz[m - 1][1] != 0 && sz[m - 1][0] >= sz[m - 2][0])
				{
					System.out.printf("%d 0\n",m - 1);
				}
				else if (k == n - 1 && sz[m - 1][n - 1] >= sz[m - 2][n - 1] != 0 && sz[m - 1][n - 1] >= sz[m - 1][n - 2])
				{
					System.out.printf("%d %d\n",m - 1,n - 1);
				}
				else if (sz[m - 1][k] >= sz[m - 1][k - 1] != 0 && sz[m - 1][k] >= sz[m - 1][k + 1] != 0 && sz[m - 1][k] >= sz[m - 2][k])
				{
					System.out.printf("%d %d\n",m - 1,k);
				}
			}
			else if (k == 0)
			{
				if (sz[i][0] >= sz[i][1] != 0 && sz[i][0] >= sz[i - 1][0] != 0 && sz[i][0] >= sz[i + 1][0])
				{
					System.out.printf("%d 0\n",i);
				}
			}
			else if (k == n - 1)
			{
				if (sz[i][n - 1] >= sz[i][n - 2] != 0 && sz[i][n - 1] >= sz[i - 1][n - 1] != 0 && sz[i][n - 1] >= sz[i + 1][n - 1])
				{
					System.out.printf("%d %d\n",i,n - 1);
				}
			}
			else
			{
				if (sz[i][k] >= sz[i][k - 1] != 0 && sz[i][k] >= sz[i][k + 1])
				{
					if (sz[i][k] >= sz[i - 1][k] != 0 && sz[i][k] >= sz[i + 1][k])
					{
						System.out.printf("%d %d\n",i,k);
					}
				}
			}
		}
	}
	return 0;
	}

}

