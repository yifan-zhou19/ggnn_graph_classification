package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int s;
		 int t;
		 int[][] a = new int[1000][1000];
		 int[][] b = new int[1000][1000];
		 int[][] c = new int[1000][1000];


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
		 for (int i = 1;i <= m;i++)
		 {
			   for (int j = 1;j <= n;j++)
			   {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 a[i][j] = Integer.parseInt(tempVar3);
						 }
			   }
		 } //?????????



		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 s = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 t = Integer.parseInt(tempVar5);
		 }
		 for (int i = 1;i <= s;i++)
		 {
			   for (int j = 1;j <= t;j++)
			   {
						 String tempVar6 = ConsoleInput.scanfRead();
						 if (tempVar6 != null)
						 {
							 b[i][j] = Integer.parseInt(tempVar6);
						 }
			   }
		 } //?????????



		   for (int x = 1;x <= m;x++)
		   {
					for (int y = 1;y <= t;y++)
					{
						c[x][y] = 0;
							for (int i = 1;i <= n;i++)
							{
							   c[x][y] += a[x][i] * b[i][y];
							}

							if (y == 1)
							{
								System.out.printf("%d",c[x][y]);
							}
							if (y > 1)
							{
								System.out.printf(" %d",c[x][y]);
							}
					}
			 if (x < m)
			 {
				 System.out.print("\n");
			 }

		   }



	}

}

