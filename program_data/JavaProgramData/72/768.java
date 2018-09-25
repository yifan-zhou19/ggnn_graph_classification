package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}


		for (i = 1;i <= m;i++)
		{
									   for (j = 1;j <= n;j++)
									   {
									   String tempVar3 = ConsoleInput.scanfRead();
									   if (tempVar3 != null)
									   {
										   (c[i][j]) = Integer.parseInt(tempVar3);
									   }
									   }
		}
						 if ((i == 0) || (j == 0) || (i == m + 1) || (j == n + 1))
						 {
								c[i][j] = 0;
						 }
		 for (i = 1;i <= m;i++)
		 {
				for (j = 1;j <= n;j++)
				{


							if ((c[i][j] >= c[i - 1][j]) && (c[i][j] >= c[i][j - 1]) && (c[i][j] >= c[i + 1][j]) && (c[i][j] >= c[i][j + 1]))
							{
							  System.out.printf("%d %d\n",i - 1,j - 1);
							}

				}
		 }



		return 0;
	}
}

