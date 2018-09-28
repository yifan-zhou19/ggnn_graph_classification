package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int i;
			  int j;
			  int h;
			  int x;
			  int c;
			  int[][] a = new int[5][5];
			  int[] b = new int[5];
	x = 0;
			  for (i = 0;i < 5;i++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  a[i][0] = Integer.parseInt(tempVar);
				  }
				  String tempVar2 = ConsoleInput.scanfRead(" ");
				  if (tempVar2 != null)
				  {
					  a[i][1] = Integer.parseInt(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  a[i][2] = Integer.parseInt(tempVar3);
				  }
				  String tempVar4 = ConsoleInput.scanfRead(" ");
				  if (tempVar4 != null)
				  {
					  a[i][3] = Integer.parseInt(tempVar4);
				  }
				  String tempVar5 = ConsoleInput.scanfRead(" ");
				  if (tempVar5 != null)
				  {
					  a[i][4] = Integer.parseInt(tempVar5);
				  }
			  }
			  for (i = 0;i < 5;i++)
			  {
							  for (j = 0;j < 5;j++)
							  {
											  b[j] = a[i][j];
							  }
							  for (j = 0;j < 5;j++)
							  {
											  for (h = 0;h < 4;h++)
											  {
															  if (b[h] <= b[h + 1])
															  {
																			 c = b[h];
																			 b[h] = b[h + 1];
																			 b[h + 1] = c;
															  };
											  }
							  }
							  for (j = 0;j < 5;j++)
							  {
											  if (a[i][j] == b[0])
											  {
															   if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
															   {
																																							System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
																																							x = 100;
															   }
											  }
							  }
			  }
			  if (x == 0)
			  {
				  System.out.print("not found");
			  }
	}

}

