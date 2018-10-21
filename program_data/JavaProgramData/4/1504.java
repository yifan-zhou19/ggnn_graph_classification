package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] sz = new int[100][100];
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
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar3);
			   }
			}
		}

		for (j = 0;j < n;j++)
		{
				k = j;
				for (i = 0;i <= k != 0 && i < m;i++, j--)
				{
				System.out.printf("%d\n",sz[i][j]);

				}
		j = k;

		}

		  for (i = 1;i < m;i++)
		  {
			 k = i;
			 for (j = n - 1;j >= 0 && i < m;i++, j--)
			 {
				System.out.printf("%d\n",sz[i][j]);

			 }
			i = k;
		  }



		return 0;
	}

}

