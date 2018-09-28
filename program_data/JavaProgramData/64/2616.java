package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double[][] c = new double[10][10];
		double[] w = new double[100];
		int[][] k = new int[50][4];
		int[][] l = new int[50][4];
		int i;
		int n;
		int q;
		int o;
		int j;
		int d = 0;
		int a;
		int b;
		double m;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (q = i + 1;q < n;q++)
			{
				m = 1.0 * (x[i] - x[q]) * (x[i] - x[q]) + 1.0 * (y[i] - y[q]) * (y[i] - y[q]) + 1.0 * (z[i] - z[q]) * (z[i] - z[q]);
				c[i][q] = (double)Math.sqrt(m);
				d++;
			}
		}
		j = d;
		for (o = 0;o < j;o++)
		{
			w[o] = 0;
			a = 0;
			b = 0;
		   for (i = 0;i < n - 1;i++)
		   {
			for (q = i + 1;q < n;q++)
			{
				if (w[o] < c[i][q])
				{
					w[o] = c[i][q];
					a = i;
					b = q;
				}
			}
		   }
		   c[a][b] = -1;
		   k[o][1] = x[a];
		   k[o][2] = y[a];
		   k[o][3] = z[a];
		   l[o][1] = x[b];
		   l[o][2] = y[b];
		   l[o][3] = z[b];
		}

		for (o = 0;o < d;o++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",k[o][1],k[o][2],k[o][3],l[o][1],l[o][2],l[o][3],w[o]);
		}
		return 0;
	 }

}

