package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int min1(int i,int k)
	{
		int j;
		int temp = 10000;
		for (j = 1;j <= k;j++)
		{
						 if (temp > a[i][j])
						 {
							 temp = a[i][j];
						 }
		}
		return temp;
	}
	public static int min2(int j,int k)
	{
		int i;
		int temp = 10000;
		for (i = 1;i <= k;i++)
		{
						 if (temp > a[i][j])
						 {
							 temp = a[i][j];
						 }
		}
		return temp;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int g;
		  int temp;
		  int ans;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (g = 0;g < n;g++)
		  {
						  for (i = 1;i <= n;i++)
						  {
										   for (j = 1;j <= n;j++)
										   {
															String tempVar2 = ConsoleInput.scanfRead();
															if (tempVar2 != null)
															{
																a[i][j] = Integer.parseInt(tempVar2);
															}
										   }
						  }
						  ans = 0;
						  for (k = n;k > 1;k--)
						  {
										  for (i = 1;i <= k;i++)
										  {
														   temp = min1(i, k);
														   for (j = 1;j <= k;j++)
														   {
																			a[i][j] -= temp;
														   }
										  }
										  for (j = 1;j <= k;j++)
										  {
														   temp = min2(j, k);
														   for (i = 1;i <= k;i++)
														   {
																			a[i][j] -= temp;
														   }
										  }
										  ans += a[2][2];
										  for (i = 2;i < k;i++)
										  {
														  for (j = 1;j <= k;j++)
														  {
																		   a[i][j] = a[i + 1][j];
														  }
										  }
										  for (j = 2;j < k;j++)
										  {
														   for (i = 1;i < k;i++)
														   {
																		   a[i][j] = a[i][j + 1];
														   }
										  }
						  }
						  System.out.printf("%d\n",ans);
		  }

	}


}

