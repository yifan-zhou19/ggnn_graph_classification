package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] sz = new int[200][200];
		int result = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		int p;
		int q;
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
			for (p = 0;p < m;p++)
			{
				for (q = 0;q < n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[p][q] = Integer.parseInt(tempVar4);
					}
				}
				if (p == 0 || p == m - 1)
				{
					for (q = 0;q < n;q++)
					{
					 result += sz[p][q];
					}
				}
				else
				{
					result += sz[p][0];
					result += sz[p][n - 1];
				}
			}
			System.out.printf("%d\n",result);
			result = 0;
		}
		return 0;
	}
}

