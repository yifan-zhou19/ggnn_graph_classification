package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int h;
	   int z;
	   int i;
	   int[][] sz = new int[100][100];
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   h = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   z = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < h;i++)
	   {
		   for (k = 0;k < z;k++)
		   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
		   }
	   }
	   for (i = 0;i <= h + z - 2;i++)
	   {
		   for (k = 0;k < h;k++)
		   {
			  if (i - k < 0 || i - k >= z)
			  {
				 continue;
			  }
			  else
			  {
				  System.out.printf("%d\n",sz[k][i - k]);
			  }
		   }
	   }
	   return 0;
	}

}

