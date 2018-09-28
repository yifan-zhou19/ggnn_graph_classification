package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int p;
		int l;
		int m = 0;
		int x;
		int[][] c = new int[100][100];
		int[][] d = new int[100][100];
		int e2;
		int e3;
		int o;
		int w = 0;
		double[] b = new double[100];
		double e1;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 3;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
			}
		}
		for (p = 1;p <= n;p++)
		{
			for (k = p - 1;k < n - 1;k++)
			{
			   for (j = 0;j < 3;j++)
			   {
				  x = a[p - 1][j] - a[k + 1][j];

				  m = m + x * x;

				  c[w][j] = a[p - 1][j];
				  d[w][j] = a[k + 1][j];



			   }
			b[w] = Math.sqrt(m);
			w++;
			m = 0;

			}
		}
	   o = n * (n - 1) / 2;
		for (l = 1;l <= o;l++)
		{
			for (k = 0;k < o - l;k++)
			{
				  if (b[k] < b[k + 1])
				  {
					  for (j = 0;j < 3;j++)
					  {
					e1 = b[k];
					e2 = c[k][j];
					e3 = d[k][j];
					b[k] = b[k + 1];
				   c[k][j] = c[k + 1][j];
					d[k][j] = d[k + 1][j];
					  b[k + 1] = e1;
					 c[k + 1][j] = e2;
					 d[k + 1][j] = e3;
					  }
				  }
			}
		}
		for (k = 0;k < o;k++)
		{
			System.out.print("(");
			System.out.printf("%d,%d,%d",c[k][0],c[k][1],c[k][2]);
			System.out.print(")-(");
			System.out.printf("%d,%d,%d",d[k][0],d[k][1],d[k][2]);
			System.out.print(")=");
			System.out.printf("%.2lf\n",b[k]);
		}
		return 0;
	}

}

