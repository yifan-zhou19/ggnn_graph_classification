package <missing>;

public class GlobalMembers
{
	// &frac34;&Oslash;&Otilde;�&frac12;&raquo;&raquo;&raquo;&ETH;&ETH;&micro;&Uacute;&para;&thorn;&micro;&macr;.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		int[][] sz = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		int e;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
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
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				e = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = e;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
						System.out.printf("%d",sz[i][j]);
					}
					else if (j == 4)
					{
						System.out.printf(" %d\n",sz[i][j]);
					}
					else
					{
						System.out.printf(" %d",sz[i][j]);
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}


}

