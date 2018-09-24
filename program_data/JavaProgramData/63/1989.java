package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int n;
		  int m;
		  int l;
		  int h;
		  int[][] c = new int[100][100];
		  int i;
		  int j;
		  int s;
		  int k;
		  s = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x1 = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  y1 = Integer.parseInt(tempVar2);
		  }
		  for (n = 0;n < x1;n++)
		  {
							  for (m = 0;m < y1;m++)
							  {
							  String tempVar3 = ConsoleInput.scanfRead();
							  if (tempVar3 != null)
							  {
								  a[n][m] = Integer.parseInt(tempVar3);
							  }
							  }
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  x2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  y2 = Integer.parseInt(tempVar5);
		  }
		  for (h = 0;h < x2;h++)
		  {
							  for (l = 0;l < y2;l++)
							  {
							  String tempVar6 = ConsoleInput.scanfRead();
							  if (tempVar6 != null)
							  {
								  b[h][l] = Integer.parseInt(tempVar6);
							  }
							  }
		  }
		  for (i = 0;i < x1;i++)
		  {
							   for (j = 0;j < y2;j++)
							   {

													for (k = 0;k < x2;k++)
													{
														s = s + a[i][k] * b[k][j];
													}
													c[i][j] = s;
													s = 0;
							   }
		  }
		  for (i = 0;i < x1;i++)
		  {
							for (j = 0;j < y2;j++)
							{
											  if (j == 0)
											  {
											  System.out.printf("%d",c[i][j]);
											  }
											  else
											  {
											  System.out.printf(" %d",c[i][j]);
											  }

							}
							  System.out.print("\n");
		  }

	}

}

