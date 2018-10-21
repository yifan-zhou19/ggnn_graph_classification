package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[5][5];
	   int e;
	   int m;
	   int n;
	   int i;
	   int k;
	   int h;
		  for (i = 0;i < 5;i++)
		  {
		  for (k = 0;k < 5;k++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  sz[i][k] = Integer.parseInt(tempVar);
		  }
		  }
		  }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   m = Integer.parseInt(tempVar3);
	   }
		 if ((m < 5) && (n < 5))
		 {
		  h = 0;
		  for (i = 0;i < 5;i++)
		  {
		  e = sz[m][i];
		  sz[m][i] = sz[n][i];
		  sz[n][i] = e;
		  }
		 }
	   else
	   {
		  h = 1;
	   }
	   if (h == 1)
	   {
	   System.out.print("error");
	   }
	   else
	   {
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 4;k++)
				{
				System.out.printf("%d ",sz[i][k]);
				}
			   System.out.printf("%d\n",sz[i][4]);
			}
	   }
	   return 0;
	}
}

