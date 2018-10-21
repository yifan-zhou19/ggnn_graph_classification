package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
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
		  int[][] a = new int[x1][y1];
		  int i;
		  int j;
		  int k;
		  for (i = 0;i < x1;i++)
		  {
				 for (j = 0;j < y1;j++)
				 {
					   if (j == 0)
					   {
						   String tempVar3 = ConsoleInput.scanfRead();
						   if (tempVar3 != null)
						   {
							   a[i][j] = Integer.parseInt(tempVar3);
						   }
					   }
					   else
					   {
						   String tempVar4 = ConsoleInput.scanfRead(" ");
						   if (tempVar4 != null)
						   {
							   a[i][j] = Integer.parseInt(tempVar4);
						   }
					   }
				 }
		  }
		  int x2;
		  int y2;
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
		  int[][] b = new int[x2][y2];
		  for (i = 0;i < x2;i++)
		  {
				 for (j = 0;j < y2;j++)
				 {
					   if (j == 0)
					   {
						   String tempVar7 = ConsoleInput.scanfRead();
						   if (tempVar7 != null)
						   {
							   b[i][j] = Integer.parseInt(tempVar7);
						   }
					   }
					   else
					   {
						   String tempVar8 = ConsoleInput.scanfRead(" ");
						   if (tempVar8 != null)
						   {
							   b[i][j] = Integer.parseInt(tempVar8);
						   }
					   }
				 }
		  }
		  int t;
		  for (i = 0;i < x1;i++)
		  {
				 for (j = 0;j < y2;j++)
				 {
					   t = 0;
					   for (k = 0;k < y1;k++)
					   {
							  t += (a[i][k]) * (b[k][j]);
					   }
							  if (j != y2 - 1)
							  {
								  System.out.printf("%d ",t);
							  }
							  else
							  {
								  System.out.printf("%d\n",t);
							  }
				 }
		  }
	}

}

