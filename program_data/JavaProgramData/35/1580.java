package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[8][8];
	   int i;
	   int m;
	   int n;
	   int k;
	   int max;
	   int min;
	   int p;
	   int x;
	   int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < m;i++)
	   {
		  for (k = 0;k < n;k++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  sz[i][k] = Integer.parseInt(tempVar3);
			  }
		  }
	   }
	   for (i = 0;i < m;i++)
	   {
		  int max = 0;
		  for (k = 0;k < n;k++)
		  {
			 if (sz[i][k] > max)
			 {
			   max = sz[i][k];
			   y = k;
			 }
		  }
		  int min = 100;
		  for (p = 0;p < m;p++)
		  {
			  if (sz[p][y] < min)
			  {
				  min = sz[p][y];
				  x = p;
			  }
		  }
			 if (max == min)
			 {
			 System.out.printf("%d+%d",x,y);
			 return 0;
			 }
	   }
		System.out.print("No");
		return 0;
	}


}

