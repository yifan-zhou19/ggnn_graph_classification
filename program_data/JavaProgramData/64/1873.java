package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int c;
		int k;
		int i;
		int m;
		int j;
		int n;
		int[] x = new int[101];
		int[] y = new int[101];
		int[] z = new int[101];
		int[] xs = new int[101];
		int[] ys = new int[101];
		int[] zs = new int[101];
		int[] xz = new int[101];
		int[] yz = new int[101];
		int[] zz = new int[101];
		double b;
		double[][] l = new double[10][10];
		double[] ls = new double[100];
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		a = 0;
		 for (i = 0;i < n;i++)
		 {
			  for (j = i + 1;j < n;j++)
			  {
				  xs[a] = x[i];
				  ys[a] = y[i];
				  zs[a] = z[i];
				  xz[a] = x[j];
				  yz[a] = y[j];
				  zz[a] = z[j];
				  ls[a] = l[i][j];
				  a++;
				  m = a;
			  }
		 }
		  k = 0;
	 while (k <= m)
	 {
		  for (i = 0;i < m - 1;i++)
		  {
			  if (ls[i] >= ls[i + 1])
			  {
			  ls[i] = ls[i];
			  ls[i + 1] = ls[i + 1];
			  }
			  else
			  {
			  b = ls[i];
			  ls[i] = ls[i + 1];
			  ls[i + 1] = b;
			  c = xs[i];
			  xs[i] = xs[i + 1];
			  xs[i + 1] = c;
			  c = ys[i];
			  ys[i] = ys[i + 1];
			  ys[i + 1] = c;
			  c = zs[i];
			  zs[i] = zs[i + 1];
			  zs[i + 1] = c;
			  c = xz[i];
			  xz[i] = xz[i + 1];
			  xz[i + 1] = c;
			  c = yz[i];
			  yz[i] = yz[i + 1];
			  yz[i + 1] = c;
			  c = zz[i];
			  zz[i] = zz[i + 1];
			  zz[i + 1] = c;
			  }
		  }
		  k++;
	 }
	 for (i = 0;i < m;i++)
	 {
		  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",xs[i],ys[i],zs[i],xz[i],yz[i],zz[i],ls[i]);
	 }
	 return 0;
	}



}

