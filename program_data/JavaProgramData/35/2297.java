package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[][] sz = new int[8][8];
	   int r;
	   int c;
	   int m;
	   int n;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   r = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   c = Integer.parseInt(tempVar2);
	   }
	   for (m = 0;m < r;m++)
	   {
		   for (n = 0;n < c;n++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[m][n] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
		for (m = 0;m < r;m++)
		{
			int max = 0;
			int maxindex;
		   for (n = 0;n < c;n++)
		   {
			   if (sz[m][n] > max)
			   {
				   max = sz[m][n];
				   maxindex = n;
			   }
		   }
		   int min = sz[0][maxindex];
		   int minindex = 0;
		   for (k = 0;k < r;k++)
		   {
			   if (sz[k][maxindex] < min)
			   {
				   minindex = k;
				   min = sz[k][maxindex];
			   }
		   }
		   if (minindex == m)
		   {
			   System.out.printf("%d+%d",m,maxindex);
			   return 0;
		   }
		}
			 System.out.print("No");
			return 0;
	}
}

