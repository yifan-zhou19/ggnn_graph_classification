package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] s = new int[20][20];
		int i;
		int k;
		int a;
		int[] z = new int[20];
		int[] x = new int[20];
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
						 for (k = 0;k < n;k++)
						 {
										  String tempVar3 = ConsoleInput.scanfRead();
										  if (tempVar3 != null)
										  {
											  s[i][k] = Integer.parseInt(tempVar3);
										  }
						 }
		}
										  if (s[0][0] >= s[0][1] != 0 && s[0][0] >= s[1][0])
										  {
																				 System.out.print("0 0\n");
										  }
										  for (i = 1;i < n - 1;i++)
										  {
															 if ((s[0][i] >= s[0][i - 1]) && (s[0][i] >= s[0][i + 1]) && (s[0][i] >= s[1][i]))
															 {
																   System.out.printf("0 %d\n",i);
															 }
										  }
															 if (s[0][n - 1] >= s[0][n - 2] != 0 && s[0][n - 1] >= s[1][n - 1])
															 {
																	System.out.printf("0 %d\n",n - 1);
															 }
										  for (i = 1;i < m - 1;i++)
										  {
																  if (s[i][0] >= s[i - 1][0] != 0 && s[i][0] >= s[i + 1][0] != 0 && s[i][0] >= s[i][1])
																  {
																					  System.out.printf("%d 0\n",i);
																  }
													 for (k = 1;k < n - 1;k++)
													 {
																  if (s[i][k] >= s[i - 1][k] != 0 && s[i][k] >= s[i + 1][k] != 0 && s[i][k] >= s[i][k - 1] != 0 && s[i][k] >= s[i][k + 1])
																  {
																					   System.out.printf("%d %d\n",i,k);
																  }
													 }
																  if (s[i][n - 1] >= s[i - 1][n - 1] != 0 && s[i][n - 1] >= s[i + 1][n - 1] != 0 && s[i][n - 1] >= s[i][n - 2])
																  {
																					  System.out.printf("%d %d\n",i,n - 1);
																  }
										  }
																   if (s[m - 1][0] >= s[m - 1][1] != 0 && s[m - 1][0] >= s[m - 2][0])
																   {
																				 System.out.printf("%d 0\n",m - 1);
																   }
										  for (a = 1;a < n - 1;a++)
										  {
															 if (s[m - 1][a] >= s[m - 1][a - 1] != 0 && s[m - 1][a] >= s[m - 1][a + 1] != 0 && s[m - 1][a] >= s[m - 2][a])
															 {
																   System.out.printf("%d %d\n",m - 1,a);
															 }
										  }
															 if (s[m - 1][n - 1] >= s[m - 1][n - 2] != 0 && s[m - 1][n - 1] >= s[m - 2][n - 1])
															 {
																	System.out.printf("%d %d\n",m - 1,n - 1);
															 }




	 return 0;
	}


}

