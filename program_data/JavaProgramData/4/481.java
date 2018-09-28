package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] v = new int[100][100];
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i <= row - 1;i++)
		{
				for (int j = 0;j <= col - 1;j++)
				{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							v[i][j] = Integer.parseInt(tempVar3);
						}
				}
		}

	  for (int j = 0;j <= col - 1;j++)
	  {
		  int m = j;
	   for (int k = 0;k <= row - 1 && m >= 0;m--&&k++)
	   {
			System.out.printf("%d\n",v[k][m]);
	   }
		k = 0;
	  }

	  for (int i = 1;i <= row - 1;i++)
	  {
		  int n = i;
	  for (int j = col - 1 ;n <= row - 1 && j >= 0;n++&&j--)
	  {
		  System.out.printf("%d\n",v[n][j]);
	  }
	  }

	   int z;
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   z = Integer.parseInt(tempVar4);
	   }
	 return 0;


	}
}

