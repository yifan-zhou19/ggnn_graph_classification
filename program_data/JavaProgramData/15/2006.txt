package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int n;
		int i;
		int j;
		int l;
		int k;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			l = 0;
			k = 0;
			sz[i][0] = 255;
			sz[i][n + 1] = 255;
			for (j = 1;j <= n;j++)
			{
				if ((sz[i][j] - sz[i][j - 1]) * (sz[i][j] - sz[i][j + 1]) > 0)
				{
					l = j - l;
					k++;
				}
			}
			if (k == 2)
			{
			  sum += (l - 1);
			}

		}
		System.out.printf("%d",sum);
		return 0;
	}
}

