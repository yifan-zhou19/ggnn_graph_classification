package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int x2;
		  int y2;
		  int i;
		  int j;
		  int x;
		  int y;
		  int sum;
		  int t;
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

		  for (i = 0;i <= x1 - 1;i++)
		  {
			  for (j = 0;j <= y1 - 1;j++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[i][j] = Integer.parseInt(tempVar3);
				  }
	//printf("%d",a[i][j]);
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
		  int[][] b = new int[x2][y2];
		   for (i = 0;i <= x2 - 1;i++)
		   {
			  for (j = 0;j <= y2 - 1;j++)
			  {
				  String tempVar6 = ConsoleInput.scanfRead();
				  if (tempVar6 != null)
				  {
					  b[i][j] = Integer.parseInt(tempVar6);
				  }
			 // printf("%d",b[i][j]);
			  }
		   }
		   int[][] c = new int[x1][y2];
		   //printf("%d %d",x1,y2);
		   for (i = 0;i < x1;i++)
		   {
			  for (j = 0;j < y2;j++)
			  {
					sum = 0;
					for (t = 0;t < x2;t++)
					{
											   //printf("%d %d",a[x1][t],b[t][y2]);
											   sum = sum + (a[i][t]) * (b[t][j]);
						 //printf("%d",sum);
					   //  printf("%d",t);

					}
					c[i][j] = sum;
					//printf("%d",c[i][j]);          
			  }
		   }
			 for (i = 0;i < x1;i++)
			 {
			  for (j = 0;j < y2;j++)
			  {
				 if (j == y2 - 1)
				 {
				 System.out.printf("%d\n",c[i][j]);
				 }
				 else
				 {
				 System.out.printf("%d ",c[i][j]);
				 }
			  }
			 }




	}

}

