package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int k1;
		int m;
		int n;
		int i;
		int j;
		int answer;
		int[][] sz = new int[102][102];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
	for (k1 = 1;k1 <= k;k1++)
	{
		answer = 0;
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
		for (i = 1;i <= m;i++)
		{
						   for (j = 1;j <= n;j++)
						   {
											  String tempVar4 = ConsoleInput.scanfRead();
											  if (tempVar4 != null)
											  {
												  sz[i][j] = Integer.parseInt(tempVar4);
											  }
						   }
		}
		if (m == 1 && n == 1)
		{
			answer = sz[1][1];
		}
		else if (m == 1)
		{
			for (j = 1;j <= n;j++)
			{
						  answer = answer + sz[1][j];
			}
		}
		else if (n == 1)
		{
			for (i = 1;i <= m;i++)
			{
						  answer = answer + sz[i][1];
			}
		}
		if (m != 1 && n != 1)
		{
			for (j = 1;j <= n;j++)
			{
						  answer = answer + sz[1][j] + sz[m][j];
			}
			for (i = 2;i < m;i++)
			{
						  answer = answer + sz[i][1] + sz[i][n];
			}
		}
		System.out.printf("%d\n",answer);
	}
	 return 0;
	}
}

