package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int n;
		int m;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 1;k <= n / 2 && k <= m / 2;k++)
		{


		for (i = k - 1,j = k - 1;j < m - k;j++)
		{

				System.out.printf("%d\n",sz[i][j]);
		}
		for (i = k - 1,j = m - k;i < n - k;i++)
		{

				System.out.printf("%d\n",sz[i][j]);
		}
		for (i = n - k,j = m - k;j > k - 1;j--)
		{

				System.out.printf("%d\n",sz[i][j]);
		}
		for (i = n - k,j = k - 1;i > k - 1;i--)
		{

				System.out.printf("%d\n",sz[i][j]);
		}
		}
		if (n % 2 != 0 && n <= m)
		{

			for (j = k - 1;j <= m - k;j++)
			{

			System.out.printf("%d\n",sz[n / 2][j]);
			}
		}
		else if (m % 2 != 0)
		{

			for (i = k - 1;i <= n - k;i++)
			{

			System.out.printf("%d\n",sz[i][m / 2]);
			}
		}
		return 0;
	}


}

