package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] sz = new int[max][max];
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
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					if (sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i + 1][j])
					{
						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i == 0 && j != 0 && j != n - 1)
				{
				  if (sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i + 1][j])
				  {

					System.out.printf("%d %d\n",i,j);
				  }
				}
				else if (i == 0 && j == n - 1)
				{
					if (sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i + 1][j])
					{

					System.out.printf("%d %d\n",i,j);
					}

				}
				else if (i != m - 1 && j == n - 1 && i != 0)
				{
					if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1])
					{

						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i == m - 1 && j == n - 1)
				{
					if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i][j - 1])
					{

						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i == m - 1 && j != n - 1 && j != 0)
				{
					if (sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i - 1][j])
					{

						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i == m - 1 && j == 0)
				{
					if (sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i - 1][j])
					{

						System.out.printf("%d %d\n",i,j);
					}
				}
				else if (i != 0 && j == 0 && i != m - 1)
				{
					if (sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i][j + 1])
					{
							System.out.printf("%d %d\n",i,j);
					}
				}
				else if (sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i][j - 1] != 0 && sz[i][j] >= sz[i][j + 1])
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}

}

