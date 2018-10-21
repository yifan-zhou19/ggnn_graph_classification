package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int x;
		int k;
		int m;
		int n;
		int i;
		int j;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (x = 0;x < k;x++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			sum = 0;
			for (j = 0;j < n - 1;j++)
			{
				sum += sz[0][j];
			}
			for (i = 0;i < m - 1;i++)
			{
				sum += sz[i][j];
			}
			for (;j > 0;j--)
			{
				sum += sz[i][j];
			}
			for (;i > 0;i--)
			{
				sum += sz[i][j];
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

