package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;

		int[][] sz = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n + 2;i++)
		{
			sz[0][i] = 0;
		}
		for (int i = 1;i < m + 1;i++)
		{
			for (int a = 1;a < n + 1;a++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][a] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i < m + 2;i++)
		{
			sz[i][0] = 0;
		}
		for (int i = 0;i < m + 2;i++)
		{
			sz[i][n + 1] = 0;
		}
		for (int i = 0;i < n + 2;i++)
		{
			sz[m + 1][i] = 0;
		}
		for (int i = 1;i < m + 1;i++)
		{
		   for (int a = 1;a < n + 1;a++)
		   {
			   if (sz[i][a] >= sz[i - 1][a] != 0 && sz[i][a] >= sz[i + 1][a] != 0 && sz[i][a] >= sz[i][a + 1] != 0 && sz[i][a] >= sz[i][a - 1])
			   {
				System.out.printf("%d ",i - 1);
			   System.out.printf("%d\n",a - 1);
			   }
		   }
		}
		 return 0;
	}



}

