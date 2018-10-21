package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		int s;
		a = b = c = d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
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
			int[][] sz = new int[m][n];
			for (int p = 0;p < m;p++)
			{
				for (int q = 0;q < n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[p][q] = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m != 1 && n != 1)
			{
			for (int e = 0;e < n;e++)
			{
				a = a + sz[0][e];
				b = b + sz[m - 1][e];
			}
			for (int j = 1;j < m - 1;j++)
			{
				c = c + sz[j][n - 1];
				d = d + sz[j][0];
			}
			s = a + b + c + d;
			System.out.printf("%d\n",s);
			s = a = b = c = d = 0;
			}
			else
			{
				System.out.printf("%d",sz[0][0]);
			}
		}
		return 0;
	}


}

