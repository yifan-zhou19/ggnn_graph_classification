package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int m;
	   int n;
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
	   int i;
	   int j;
	   int[][] a = new int[m][n];
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
		   }
	   }
	   int[] b = new int[m];
	   int[] c = new int[n];
	   int s = 0;
	   for (i = 0;i < m;i++)
	   {
			b[i] = a[i][0];
			for (j = 1;j < n;j++)
			{
				  if (a[i][j] > b[i])
				  {
					   b[i] = a[i][j];
				  }
			}
	   }
	   for (j = 0;j < n;j++)
	   {
			c[j] = a[0][j];
			for (i = 1;i < m;i++)
			{
				  if (a[i][j] < c[j])
				  {
					   c[j] = a[i][j];
				  }
			}
	   }
	   for (i = 0;i < m;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
				if (a[i][j] == b[i] && a[i][j] == c[j])
				{
					 System.out.printf("%d+%d",i,j);
					 s += 1;
				}
		   }
	   }
	   if (s == 0)
	   {
		   System.out.print("No");
	   }
	   return 0;
	}
}

