package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int C = new int(int x,int y);
		  int x1;
		  int x2;
		  int y2;
		  int y1;
		  int[][] a = new int[100][100];
		  int[][] b = new int[100][100];
		  int[][] c = new int[100][100];
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
		  for (int j = 0;j < x1;j++)
		  {
				  for (int k = 0;k < y1;k++)
				  {
						  if (k == 0)
						  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  a[j][k] = Integer.parseInt(tempVar3);
						  }
						  }
						  else
						  {
							  String tempVar4 = ConsoleInput.scanfRead(" ");
							  if (tempVar4 != null)
							  {
								  a[j][k] = Integer.parseInt(tempVar4);
							  }
						  }
				  }
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  x2 = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  y2 = Integer.parseInt(tempVar6);
		  }
		  for (int j = 0;j < x2;j++)
		  {
				  for (int k = 0;k < y2;k++)
				  {
						  if (k == 0)
						  {
						  String tempVar7 = ConsoleInput.scanfRead();
						  if (tempVar7 != null)
						  {
							  b[j][k] = Integer.parseInt(tempVar7);
						  }
						  }
						  else
						  {
							  String tempVar8 = ConsoleInput.scanfRead(" ");
							  if (tempVar8 != null)
							  {
								  b[j][k] = Integer.parseInt(tempVar8);
							  }
						  }
				  }
		  }
		  for (int j = 0;j < x1;j++)
		  {
				  if (j != 0)
				  {
					  System.out.print("\n");
				  }
				  for (int k = 0;k < y2;k++)
				  {
						  c[j][k] = 0;
						  for (int i = 0;i < y1;i++)
						  {
						  c[j][k] = c[j][k] + a[j][i] * b[i][k];
						  }
						  if (k == 0)
						  {
						  System.out.printf("%d",c[j][k]);
						  }
						  else
						  {

							   System.out.printf(" %d",c[j][k]);
						  }
				  }
		  }


	}
}

