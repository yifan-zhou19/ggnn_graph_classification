package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double[] d = new double[10000];
		double max = 0;
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
			   x[i] = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   y[i] = Double.parseDouble(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			   d[(i + 1) * (j + 1)] = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
		  }
		}
		for (k = 1;k <= n * n;k++)
		{
		   if (max < d[k])
		   {
			  max = d[k];
		   }
		}
		System.out.printf("%.4lf",Math.sqrt(max));

	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

