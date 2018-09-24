package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int i;
	   int j;
	   int l;
	   int m;
	   int n;
	   int s = 0;
	   int p = 0;
	   int r = 0;
	   int q = 0;
	   int sum;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
		  int[][] a = new int[1000][1000];
	   for (i = 0;i < k;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  n = Integer.parseInt(tempVar3);
		  }
		  for (j = 1;j <= m;j++)
		  {
			 for (l = 1;l <= n;l++)
			 {
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[j][l] = Integer.parseInt(tempVar4);
				}
			 }
		  }
		  for (j = 1;j <= n;j++)
		  {
				 s = s + a[1][j];
				 q = q + a[m][j];
		  }
		  for (j = 1;j <= m;j++)
		  {
				 p = p + a[j][1];
				 r = r + a[j][n];
		  }
		  sum = s + p + r + q - a[1][1] - a[m][1] - a[1][n] - a[m][n];
		  System.out.printf("%d\n",sum);
		  s = 0;
		  q = 0;
		  p = 0;
		  r = 0;
	   }
	   return 0;
	}

}

