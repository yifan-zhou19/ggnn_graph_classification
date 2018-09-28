package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] num = new int[5][5];
		int i;
		int j;
		int[] k = new int[5];
		int[] h = new int[5];
		int[] a = new int[5];
		int[] b = new int[5];
		int m;
		int p;
		int q;
		int x;
		int y;
		for (i = 0;i <= 4;i++)
		{
						 k[i] = 0;
						 for (j = 0;j <= 4;j++)
						 {
										  String tempVar = ConsoleInput.scanfRead();
										  if (tempVar != null)
										  {
											  num[i][j] = Integer.parseInt(tempVar);
										  }
										  if (num[i][j] > k[i])
										  {
															  k[i] = num[i][j];
															  a[i] = j;
										  }
						 }

		}




		  for (q = 0;q <= 4;q++)
		  {
						 h[q] = 100000;
						 for (p = 0;p <= 4;p++)
						 {
										  if (num[p][q] < h[q])
										  {
															  h[q] = num[p][q];
															  b[p] = p;
										  }
						 }

		  }
		  m = 0;
		  for (x = 0;x <= 4;x++)
		  {
						 for (y = 0;y <= 4;y++)
						 {
										  if (k[x] == h[y])
										  {
														  System.out.printf("%d %d %d\n",x + 1,y + 1,k[x]);
														  m = 1;
										  }
						 }

		  }

		  if (m == 0)
		  {
			  System.out.print("not found");
		  }

	}

}

