package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int[][] sz = new int[8][8];
		int count = 0;
		int i;
		int k;
		int[][] fz = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hang;i++)
		{
						   for (k = 0;k < lie;k++)
						   {
											 String tempVar3 = ConsoleInput.scanfRead();
											 if (tempVar3 != null)
											 {
												 sz[i][k] = Integer.parseInt(tempVar3);
											 }
											 fz[i][k] = sz[i][k];
						   }
		}
	   for (i = 0;i < hang;i++)
	   {
						  for (k = lie-1;k > 0;k--)
						  {
											  if (sz[i][k] > sz[i][k - 1])
											  {
											  e = sz[i][k];
											  sz[i][k] = sz[i][k - 1];
											  sz[i][k - 1] = e;
											  }
						  }
						  max[i] = sz[i][0];
	   }
	   for (k = 0;k < lie;k++)
	   {
						 for (i = hang - 1;i > 0;i--)
						 {
											  if (fz[i][k] < fz[i - 1][k])
											  {
											   f = fz[i][k];
											   fz[i][k] = fz[i - 1][k];
											   fz[i - 1][k] = f;
											  }
						 }
						 min[k] = fz[0][k];
	   }
	  for (i = 0;i < hang;i++)
	  {
						 for (k = 0;k < lie;k++)
						 {
										  if (max[i] == min[k])
										  {
															System.out.printf("%d+%d",i,k);
															count = 1;
										  }
						 }
	  }
	  if (count == 0)
	  {
				 System.out.print("No");
	  }
	   return 0;
	}




}

