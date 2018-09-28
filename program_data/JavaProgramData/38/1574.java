package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	double[] a = new double[1000];
	double sum = 0.0;
	double average;
	double[] b = new double[1000];
	double s = 0.0;
	double m;
	double u;
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
			j = Integer.parseInt(tempVar2);
		}
	  for (k = 0;k < j;k++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[k] = Double.parseDouble(tempVar3);
	  }
	  }
	   for (k = 0;k < j;k++)
	   {
	   sum += a[k];
	   }
	average = (double)sum / j;
	for (k = 0;k < j;k++)
	{
		b[k] = a[k] - average;
	s += b[k] * b[k];
	}
	m = (double)s / j;
	u = Math.sqrt(m);
	System.out.printf("%.5f\n",u);
	sum = 0;
	s = 0;
	}
	return 0;
	}

}

