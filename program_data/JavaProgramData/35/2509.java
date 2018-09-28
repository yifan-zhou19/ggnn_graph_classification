package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int j;
	   int t;
	   int k;
	   int l;
	   int s;
	   int b = 0;
	   int[][] a = new int[9][9];
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
				 (a[i][j]) = Integer.parseInt(tempVar3);
			 }
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   t = 0;
		  for (j = 0;j < m;j++)
		  {
			  if (a[i][j] > t)
			  {
				   t = a[i][j];
					s = j;
			  }
		  }
		  for (k = 0;k < n;k++)
		  {
			  l = 0;
			  if (a[k][s] < t)
			  {
				  l = 1;
				  break;
			  }
		  }
		  if (l == 0)
		  {
			  System.out.printf("%d+%d\n",i,s);
			  b = 1;
			  break;
		  }
	   }
	   if (b == 0)
	   {
		   System.out.print("No\n");
	   }
	   return 0;
	}
}

