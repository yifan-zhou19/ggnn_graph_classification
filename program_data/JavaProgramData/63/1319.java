package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int x1;
		 int y1;
		 int x2;
		 int y2;
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
		 int[][] a = new int[100][100];
		 for (int i1 = 0;i1 <= x1 - 1;i1++)
		 {
			  for (int j1 = 0;j1 <= y1 - 1;j1++)
			  {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   a[i1][j1] = Integer.parseInt(tempVar3);
				   }
			  }
		 }
		 int[][] b = new int[100][100];
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
		 int[][] c = new int[100][100];
		 for (int i2 = 0;i2 <= x2 - 1;i2++)
		 {
			  for (int j2 = 0;j2 <= y2 - 1;j2++)
			  {
				   String tempVar6 = ConsoleInput.scanfRead();
				   if (tempVar6 != null)
				   {
					   b[i2][j2] = Integer.parseInt(tempVar6);
				   }
			  }
		 }
		 for (int i = 0;i <= x1 - 1;i++)
		 {
			  for (int j = 0;j <= y2 - 1;j++)
			  {
				   for (int t = 0;t <= y1 - 1;t++)
				   {
					   c[i][j] += a[i][t] * b[t][j];
				   }
			  }
		 }
		 for (int k1 = 0;k1 <= x1 - 1;k1++)
		 {
			  for (int k2 = 0;k2 <= y2 - 1;k2++)
			  {
				   if (k2 == 0)
				   {
					   System.out.printf("%d",c[k1][k2]);
				   }
				   else
				   {
					   System.out.printf(" %d",c[k1][k2]);
				   }
			  }
			  System.out.print("\n");
		 }
	}

}

