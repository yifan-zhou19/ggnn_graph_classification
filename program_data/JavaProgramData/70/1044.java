package <missing>;

public class GlobalMembers
{
	public static double len(double a,double b,double c,double d)
	{
		double le1;
		double le2;
		double op;
	   le1 = (a > c != 0?a:c) - (a < c != 0?a:c);
	   le2 = (b > d != 0?b:d) - (b < d != 0?b:d);
	   op = le1 * le1 + le2 * le2;
	   op = Math.sqrt(op);
	   return op;
	}

	public static int Main()
	{
		int n;
		int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  double[] x = new double[n];
	  double[] y = new double[n];
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
	  int j;
	  int k;

	  double LEN;
	  double max;

	  for (j = 0;j < n;j++)
	  {
	  for (k = j;k < n;k++)
	  {
		LEN = len(x[j], y[j], x[k], y[k]);

		if (max < LEN)
		{
		max = LEN;
		}
	  }
	  }

	  System.out.printf("%.4lf",max);
	  System.in.read();
	   System.in.read();
		System.in.read();
		 System.in.read();
		  System.in.read();
	 System.in.read();
	}

}

