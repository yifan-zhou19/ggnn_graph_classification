package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int t = 0;
		int p = 0;
		int q = 0;
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
		int[][] a = new int[n][m];
		int[] b = new int[n];
		int[] c = new int[m];
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
		   for (j = 0;j < m;j++)
		   {
			 c[j] = a[i][j];
		   }
		   for (j = 0;j < m;j++)
		   {
			  for (k = 0;k < n;k++)
			  {
			   b[k] = a[k][j];
			  }
			  for (k = 0;k < n;k++)
			  {
			   if (b[k] < a[i][j])
			   {
				 t = 1;
				 break;
			   }
			  }
			  for (k = 0;k < m;k++)
			  {
			   if (c[k] > a[i][j])
			   {
				  p = 1;
				  break;
			   }
			  }
			  if ((p == 0) && (t == 0))
			  {
			   q = 1;
			   System.out.printf("%d+%d\n",i,j);
			  }
			  p = 0;
			  t = 0;
		   }
		}
		 if (q == 0)
		 {
		 System.out.print("No\n");
		 }
		 return 0;
	}
}

