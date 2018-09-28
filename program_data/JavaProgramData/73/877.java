package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int x;
		  int y;
		  int z;
		  int w;
		  int s;
		  int q;
		  int p = 0;
		  for (i = 0;i < 5;i++)
		  {
			for (j = 0;j < 5;j++)
			{
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar);
			   }
			}
		  }
		  for (i = 0;i < 5;i++)
		  {
			for (j = 0;j < 5;j++)
			{
			   w = a[i][j];
			   x = i;
			   y = j;
			   for (s = 0;s < 5;s++)
			   {
				   if (a[i][s] >= w)
				   {
				w = a[i][s];
				   }
			   }
			   if (w == a[i][j])
			   {
					 q = a[i][j];
				   for (s = 0;s < 5;s++)
				   {
					   if (a[s][j] <= q)
					   {
					 q = a[s][j];
					   }
				   }
					  if (q == a[i][j])
					  {
							System.out.printf("%d %d %d\n",x + 1,y + 1,w);
						 p = p + 1;
					  }
			   }
			}
		  }
		   if (p == 0)
		   {
		   System.out.print("not found");
		   }

	}



}

