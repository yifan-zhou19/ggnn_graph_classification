package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int[][] sz = new int[5][5];
		int[] sz1 = new int[5];
		for (int i = 0;i < 5;i++)
		{
			for (int k = 0;k < 5;k++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(sz[i][k]) = Integer.parseInt(tempVar);
			}
			}
		}
		int m;
		int n;
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
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			for (int i = 0;i < 5;i++)
			{
				sz1[i] = sz[m][i];
				sz[m][i] = sz[n][i];
				sz[n][i] = sz1[i];
			}
			for (int i = 0;i < 5;i++)
			{
				for (int k = 0;k < 5;k++)
				{
					if (k == 4)
					{
						System.out.printf("%d\n",sz[i][k]);
					}
					else
					{
						System.out.printf("%d ",sz[i][k]);
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
		}

}

