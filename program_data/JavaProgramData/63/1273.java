package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int x1;
		  int y1;
		  int m;
		  int n;

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
		  for (m = 0;m < x1;m++)
		  {
					   for (n = 0;n < y1;n++)
					   {
										String tempVar3 = ConsoleInput.scanfRead();
										if (tempVar3 != null)
										{
											a[m][n] = Integer.parseInt(tempVar3);
										}
					   }
		  }
		  int x2;
		  int y2;
		  int p;
		  int q;

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
		  for (p = 0;p < x2;p++)
		  {
					   for (q = 0;q < y2;q++)
					   {
										String tempVar6 = ConsoleInput.scanfRead();
										if (tempVar6 != null)
										{
											b[p][q] = Integer.parseInt(tempVar6);
										}
					   }
		  }
		  int[][] c = new int[x1][y2];
		  int d;
		  int e;
		  int f;
		  int r;
		  int t;
		  for (r = 0;r < x1;r++)
		  {
						   for (t = 0;t < y2;t++)
						   {
											c[r][t] = 0;
						   }
		  }
		  for (d = 0;d < x1;d++)
		  {
						   for (e = 0;e < y2;e++)
						   {

											for (f = 0;f < y1;f++)
											{
														 c[d][e] += a[d][f] * b[f][e];
											}

						   }
		  }
		  int g;
		  int h;
		  for (g = 0;g < x1;g++)
		  {
						   for (h = 0;h < y2;h++)
						   {
											 if (h < y2 - 1)
											 {
											System.out.printf("%d ",c[g][h]);
											 }
											else
											{
											System.out.printf("%d\n",c[g][h]);
											}
						   }
		  }
	}
}

