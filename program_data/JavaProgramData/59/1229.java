package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int t;
		int renshu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sushe = new char[n][n + 1];
		int[][] biao = new int[n + 2][n + 2];
		for (i = 0;i < n + 2;i++)
		{
			for (k = 0;k < n + 2;k++)
			{
				biao[i][k] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sushe[i] = tempVar2.charAt(0);
		   }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (sushe[i][k] == '@')
				{
					biao[i + 1][k + 1] = -1;
				}
				else if (sushe[i][k] == '#')
				{
					biao[i + 1][k + 1] = 0;
				}
				else if (sushe[i][k] == '.')
				{
					biao[i + 1][k + 1] = 1;
				}
			}
		}
		for (t = 1;t < m;t++)
		{
			for (i = 1;i < n + 1;i++)
			{
				for (k = 1;k < n + 1;k++)
				{
					if (biao[i][k] == -1)
					{
						if (biao[i - 1][k] == 1)
						{
							biao[i - 1][k] = 2;
						}
						if (biao[i + 1][k] == 1)
						{
							biao[i + 1][k] = 2;
						}
						if (biao[i][k - 1] == 1)
						{
							biao[i][k - 1] = 2;
						}
						if (biao[i][k + 1] == 1)
						{
							biao[i][k + 1] = 2;
						}
					}
				}
			}
			for (i = 0;i < n + 2;i++)
			{
				for (k = 0;k < n + 2;k++)
				{
					if (biao[i][k] == 2)
					{
						biao[i][k] = -1;
					}
				}
			}
		}
		for (i = 0;i < n + 2;i++)
		{
			for (k = 0;k < n + 2;k++)
			{
				if (biao[i][k] == -1)
				{
					renshu++;
				}
			}
		}
		System.out.printf("%d",renshu);
		return 0;
	}
}

