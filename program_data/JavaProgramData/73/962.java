package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k = 0;
		  int[][] a = new int[5][5];
		  int[][] b = new int[5][5];
		  int[][] c = new int[5][5];
		  int[][] d = new int[5][5];
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
										  if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
										  {
										  b[i][j] = 1;
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
										  {
										  c[i][j] = 1;
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  d[i][j] = b[i][j] * c[i][j];
										  if (d[i][j] == 1)
										  {
										  System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
										  d[i][j] = b[i][j] * c[i][j];
										  if (d[i][j] == 0)
										  {
										  k = k + 1;
										  }
						  }
		  }
		  if (k == 25)
		  {
		  System.out.print("not found");
		  }

	}

}

