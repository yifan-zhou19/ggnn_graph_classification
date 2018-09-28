package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] s = new int[k];
		for (i = 0;i < k;i++)
		{
			s[i] = 0;
		}
		for (i = 0;i < k;i++)
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
			for (a = 0;a < m;a++)
			{
				for (b = 0;b < n;b++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[a][b] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (b = 0;b < n;b++)
			{
				s[i] = s[i] + sz[0][b];
			}
			for (a = 1;a < m - 1;a++)
			{
				s[i] = s[i] + sz[a][0];
				s[i] = s[i] + sz[a][n - 1];
			}
			if (m != 1)
			{
				for (b = 0;b < n;b++)
				{
					s[i] = s[i] + sz[m - 1][b];
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",s[i]);
		}
		return 0;
	}


}

