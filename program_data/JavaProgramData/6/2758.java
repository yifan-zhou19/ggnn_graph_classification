package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		int[] a = new int[100000];
		for (int i = 0;i < b;i++)
		{
			int m;
			int n;
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
					int[][] sz = new int[100][100];
			for (int k = 0;k < m;k++)
			{
				for (int p = 0;p < n;p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(sz[k][p]) = Integer.parseInt(tempVar4);
					}
				}
			}
					if (m * n != 1)
					{
			for (int o = 0;o < n;o++)
			{
				a[i] = a[i] + sz[0][o] + sz[m - 1][o];
			}
			for (int q = 0;q < m;q++)
			{
				a[i] = a[i] + sz[q][0] + sz[q][n - 1];
			}
			a[i] = a[i] - sz[0][0] - sz[m - 1][0] - sz[m - 1][n - 1] - sz[0][n - 1];
			System.out.printf("%d\n",a[i]);
					}
					else
					{
						System.out.printf("%d",sz[0][0]);
					}
		}

		return 0;
		}
}

