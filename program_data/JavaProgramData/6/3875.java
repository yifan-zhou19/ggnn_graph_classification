package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l;
		int a;
		int n;
		int m;
		int[][] sz = new int[100][100];
		int[] result = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				for (l = 0;l < n;l++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][l] = Integer.parseInt(tempVar4);
					}
				}
			}
			a = 0;
			for (l = 0;l < n;l++)
			{
				a += sz[0][l];
			}
			if (m > 1)
			{
				for (l = 0;l < n;l++)
				{
					a += sz[m - 1][l];
				}
			}
			for (j = 1;j < m - 1;j++)
			{
				a += sz[j][0];
			}
			if (n > 1)
			{
				for (j = 1;j < m - 1;j++)
				{
					a += sz[j][n - 1];
				}
			}
			result[i] = a;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",result[i]);
		}
		return 0;
	}
}

