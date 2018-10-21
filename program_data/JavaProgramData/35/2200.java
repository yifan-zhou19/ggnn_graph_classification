package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int m;
	   int[][] a = new int[8][8];
	   int[] max = new int[8];
	   int[] b = new int[8];
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(",");
	   if (tempVar2 != null)
	   {
		   m = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < m;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar3);
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   max[i] = a[i][0];
		 b[i] = 0;
		   for (j = 0;j < m;j++)
		   {
			   if (a[i][j] > max[i])
			   {
				   max[i] = a[i][j];
			   b[i] = j;
			   }
		   }
	   }

	   for (i = 0;i < n;i++)
	   {
		   for (k = 0;k < n;k++)
		   {
			  if (max[i] > a[k][b[i]])
			  {
				  break;
			  }

		   }
		  if (k == n)
		  {
			  System.out.printf("%d+%d",i,b[i]);
			  break;
		  }
	   }
	   if (i == n)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}

}

