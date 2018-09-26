package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int a;
		int b;
		int i;
		int[] h = new int[5];
		int[] z = new int[5];
		for (a = 0;a < 5;a++)
		{
						 for (b = 0;b < 5;b++)
						 {
										  String tempVar = ConsoleInput.scanfRead();
										  if (tempVar != null)
										  {
											  sz[a][b] = Integer.parseInt(tempVar);
										  }
						 }
		}
		for (a = 0;a < 5;a++)
		{
						 h[a] = sz[a][0];
						 for (b = 1;b < 5;b++)
						 {
										  if (sz[a][b] > h[a])
										  {
															h[a] = sz[a][b];
										  }
						 }
		}
		for (b = 0;b < 5;b++)
		{
						 z[b] = sz[0][b];
						 for (a = 1;a < 5;a++)
						 {
										  if (sz[a][b] < z[b])
										  {
															z[b] = sz[a][b];
										  }
						 }
		}
	   i = 0;
	   for (a = 0;a < 5;a++)
	   {
						for (b = 0;b < 5;b++)
						{
										 if (sz[a][b] == h[a] && sz[a][b] == z[b])
										 {
																			System.out.printf("%d %d %d",a + 1,b + 1,sz[a][b]);
																			i = 1;
										 }
						}
	   }
	   if (i == 0)
	   {
				System.out.print("not found");
	   }

	   return 0;
	}

}

