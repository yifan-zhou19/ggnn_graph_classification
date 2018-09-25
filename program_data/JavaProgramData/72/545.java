package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		int[][] sz = new int[20][20];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (sz[0][0] >= sz[0][1] != 0 && sz[0][0] >= sz[1][0])
		{
			System.out.print("0 0\n");
		}
		for (j = 1;j < n - 1;j++)
		{
			if (sz[0][j] >= sz[0][j - 1] != 0 && sz[0][j] >= sz[0][j + 1] != 0 && sz[0][j] >= sz[1][j])
			{
				System.out.printf("0 %d\n",j);
			}
		}
		if (sz[0][n - 1] >= sz[0][n - 2] != 0 && sz[0][n - 1] >= sz[1][n - 1])
		{
			System.out.printf("0 %d\n",n - 1);
		}
		for (i = 1;i < m - 1;i++)
		{
			if (sz[i][0] >= sz[i][1] != 0 && sz[i][0] >= sz[i - 1][0] != 0 && sz[i][0] >= sz[i + 1][0])
			{
				System.out.printf("%d 0\n",i);
			}
			for (j = 1;j < n - 1;j++)
			{
				if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
			if (sz[i][n - 1] >= sz[i][n - 2] != 0 && sz[i][n - 1] >= sz[i - 1][n - 1] != 0 && sz[i][n - 1] >= sz[i + 1][n - 1])
			{
				System.out.printf("%d %d\n",i,n - 1);
			}
		}
		if (sz[m - 1][0] >= sz[m - 2][0] != 0 && sz[m - 1][0] >= sz[m - 1][1])
		{
			System.out.printf("%d 0\n",m - 1);
		}
		for (j = 1;j < n - 1;j++)
		{
			if (sz[m - 1][j] >= sz[m - 1][j - 1] != 0 && sz[m - 1][j] >= sz[m - 1][j + 1] != 0 && sz[m - 1][j] >= sz[m - 2][j])
			{
				System.out.printf("%d %d\n",m - 1,j);
			}
		}
		if (sz[m - 1][n - 1] >= sz[m - 1][n - 2] != 0 && sz[m - 1][n - 1] >= sz[m - 2][n - 1])
		{
			System.out.printf("%d %d\n",m - 1,n - 1);
		}
		return 0;
	}
}

