package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[105][105];
		int m;
		int n;
		int k;
		int z;
		int sum;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= z;i++)
		{
			sum = 0;
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 m = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 n = Integer.parseInt(tempVar3);
						 }
						if (m >= 2 && n >= 2)
						{
							for (j = 1;j <= m;j++)
							{
										  for (k = 1;k <= n;k++)
										  {
										  String tempVar4 = ConsoleInput.scanfRead();
										  if (tempVar4 != null)
										  {
											  a[j][k] = Integer.parseInt(tempVar4);
										  }
										  }
							}
										  for (k = 1;k <= n;k++)
										  {
										  sum = sum + a[1][k] + a[m][k];
										  }
										  for (j = 2;j <= m - 1;j++)
										  {
															 sum = sum + a[j][1] + a[j][n];
										  }
															 System.out.printf("%d\n",sum);
						}

														 else
														 {
															 for (j = 1;j <= m;j++)
															 {
										  for (k = 1;k <= n;k++)
										  {
										  String tempVar5 = ConsoleInput.scanfRead();
										  if (tempVar5 != null)
										  {
											  a[j][k] = Integer.parseInt(tempVar5);
										  }
										  }
															 }
										  for (j = 1;j <= m;j++)
										  {
															 for (k = 1;k <= n;k++)
															 {
														 sum = sum + a[j][k];
															 }
										  }
														 System.out.printf("%d\n",sum);
														 }


		}
													 //  if(k==9) printf("1\n");     

														System.in.read();
														System.in.read();
	}

}

