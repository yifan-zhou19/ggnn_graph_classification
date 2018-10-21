package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int j;
	int[][] sz = new int[22][22];
	int a;
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
										  sz[i][j] = Integer.parseInt(tempVar3);
									  }
					 }
	}
					 for (i = 0;i <= m + 1;i++)
					 {
									  sz[i][0] = 0;
									  sz[i][n + 1] = 0;
					 }
									  for (j = 0;j <= n + 1;j++)
									  {
													   sz[0][j] = 0;
													   sz[m + 1][j] = 0;
									  }
													   for (i = 1;i <= m;i++)
													   {
																		for (j = 1;j <= n;j++)
																		{
																						 a = sz[i][j];
																						 if (a >= sz[i][j - 1] != 0 && a >= sz[i][j + 1] != 0 && a >= sz[i - 1][j] != 0 && a >= sz[i + 1][j])
																						 {
																																						System.out.printf("%d %d\n",i - 1,j - 1);
																						 }
																		}
													   }

									  return 0;
	}




}

