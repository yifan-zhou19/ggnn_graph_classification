package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (k = 0;k < w;k++)
		{

			int n;
			int m;
			int[][] sz = new int[100][100];
			int i;
			int j;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < m;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			int a = 0;
			int b = 0;
			int c = 0;
			int d;
						for (j = 0;j < m;j++)
						{
					a += sz[0][j];
						}

				for (j = 0;j < m;j++)
				{
					b += sz[n - 1][j];
				}

			for (i = 1;i < n - 1;i++)
			{
				c += sz[i][0] + sz[i][m - 1];
			}
			d = a + b + c;
			System.out.printf("%d\n",d);
		}
	}
}

