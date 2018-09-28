package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int j;
		 int k;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 char[][] a = new char[n][10];
		 char[][] p = new char[1][10];
		 int[] g = new int[n];
		 for (j = 0;j < n;j++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[j] = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 g[j] = Integer.parseInt(tempVar3);
		 }
		 }
			for (j = n - 1;j > 0;j--)
			{
			 for (k = n - 1;k > n - j - 1;k--)
			 {
				 if (g[k] >= 60)
				 {
					  if (g[k] > g[k - 1])
					  {
						 t = g[k - 1];
						 g[k - 1] = g[k];
						 g[k] = t;
						 p[0] = a[k - 1];
						   a[k - 1] = a[k];
							 a[k] = p[0];
					  }
				 }
			 }
			}
			  for (k = 0;k < n;k++)
			  {
		  System.out.printf("%s\n",a[k]);
			  }
		 System.in.read();
		 System.in.read();
	}



}

