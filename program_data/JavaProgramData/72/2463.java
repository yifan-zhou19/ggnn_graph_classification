package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] p = new int[50][50];
		 int i;
		 int j;
		 int m;
		 int n;
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
		  for (i = 0;i < m;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						p[i][j] = Integer.parseInt(tempVar3);
					}
			  }
		  }
					 for (i = 0;i < m;i++)
					 {
									 for (j = 0;j < n;j++)
									 {
											 if (i == 0 && j == 0)
											 {
													  if (p[0][0] < p[0][1] || p[0][0] < p[1][0])
													  {
													  continue;
													  }
													  else
													  {
													  System.out.printf("%d %d\n",i,j);
													  continue;
													  }
											 }
											  else if (i == 0 && (j != 0 || j != n - 1))
											  {
													   if (p[i][j] < p[i + 1][j] || p[i][j] < p[i][j - 1] || p[i][j] < p[i][j + 1])
													   {
													   continue;
													   }
													   else
													   {
														System.out.printf("%d %d\n",i,j);
														continue;
													   }
											  }
											  else if (i == 0 && j == n - 1)
											  {
													  if (p[i][j] < p[i][j - 1] || p[i][j] < p[i + 1][j])
													  {
													  continue;
													  }
													  else
													  {
														  System.out.printf("%d %d\n",i,j);
														  continue;
													  }
											  }
											   else if ((i != 0 || i != m - 1) && j == n - 1)
											   {
														if (p[i][j] < p[i - 1][j] || p[i][j] < p[i + 1][j] || p[i][j] < p[i][j - 1])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
											   }
											   else if (i == m - 1 && j == n - 1)
											   {
														if (p[i][j] < p[i - 1][j] || p[i][j] < p[i][j - 1])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
											   }
												else if (i == m - 1 && (j != n - 1 || j != 0))
												{
														if (p[i][j] < p[i][j + 1] || p[i][j] < p[i][j - 1] || p[i][j] < p[i - 1][j])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
												}
												else if (i == m - 1 && j == 0)
												{
														if (p[i][j] < p[i - 1][j] || p[i][j] < p[i][j + 1])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
												}
												 else if (j == 0 && (i != 0 || i != m - 1))
												 {
														if (p[i][j] < p[i - 1][j] || p[i][j] < p[i + 1][j] || p[i][j] < p[i][j + 1])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
												 }
												  else
												  {
														if (p[i][j] < p[i - 1][j] || p[i][j] < p[i + 1][j] || p[i][j] < p[i][j - 1] || p[i][j] < p[i][j + 1])
														{
														continue;
														}
														else
														{
														  System.out.printf("%d %d\n",i,j);
														  continue;
														}
												  }
									 }
					 }

	}

}

